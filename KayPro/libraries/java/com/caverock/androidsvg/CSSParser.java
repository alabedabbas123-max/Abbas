package com.caverock.androidsvg;

import android.util.Log;
import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import com.luajava.LuaState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.io.FilenameUtils;
import org.objectweb.asm.signature.SignatureVisitor;

class CSSParser {
    private static final String CLASS = "class";
    static final String CSS_MIME_TYPE = "text/css";

    private static final String f4674ID = "id";
    private static final int SPECIFICITY_ATTRIBUTE_OR_PSEUDOCLASS = 1000;
    private static final int SPECIFICITY_ELEMENT_OR_PSEUDOELEMENT = 1;
    private static final int SPECIFICITY_ID_ATTRIBUTE = 1000000;

    private static final String f4675TAG = "CSSParser";
    private MediaType deviceMediaType;
    private boolean inMediaRule;
    private Source source;

    private static class Attrib {
        public final String name;
        final AttribOp operation;
        public final String value;

        Attrib(String str, AttribOp attribOp, String str2) {
            this.name = str;
            this.operation = attribOp;
            this.value = str2;
        }
    }

    private enum AttribOp {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH;

        public static AttribOp valueOf(String str) {
            for (AttribOp attribOp : values()) {
                if (attribOp.name().equals(str)) {
                    return attribOp;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    private static class CSSTextScanner extends SVGParser.TextScanner {

        private static class AnPlusB {

            public int f4676a;

            public int f4677b;

            AnPlusB(int i, int i2) {
                this.f4676a = i;
                this.f4677b = i2;
            }
        }

        CSSTextScanner(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        private int hexChar(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            if (i >= 65 && i <= 70) {
                return (i - 65) + 10;
            }
            if (i < 97 || i > 102) {
                return -1;
            }
            return (i - 97) + 10;
        }

        private AnPlusB nextAnPlusB() throws CSSParseException {
            int i;
            IntegerParser integerParser;
            IntegerParser integerParser2;
            AnPlusB anPlusB;
            int i2 = 1;
            if (empty()) {
                return (AnPlusB) null;
            }
            int i3 = this.position;
            if (!consume('(')) {
                return (AnPlusB) null;
            }
            skipWhitespace();
            if (consume("odd")) {
                anPlusB = new AnPlusB(2, 1);
            } else if (consume("even")) {
                anPlusB = new AnPlusB(2, 0);
            } else {
                int i4 = (!consume(SignatureVisitor.EXTENDS) && consume(SignatureVisitor.SUPER)) ? -1 : 1;
                IntegerParser integerParser3 = (IntegerParser) null;
                IntegerParser integerParser4 = IntegerParser.parseInt(this.input, this.position, this.inputLength, false);
                if (integerParser4 != null) {
                    this.position = integerParser4.getEndPos();
                }
                if (consume('n') || consume('N')) {
                    if (integerParser4 == null) {
                        integerParser4 = new IntegerParser(1, this.position);
                    }
                    IntegerParser integerParser5 = (IntegerParser) null;
                    skipWhitespace();
                    boolean zConsume = consume(SignatureVisitor.EXTENDS);
                    i = (zConsume || !(zConsume = consume(SignatureVisitor.SUPER))) ? 1 : -1;
                    if (zConsume) {
                        skipWhitespace();
                        IntegerParser integerParser6 = IntegerParser.parseInt(this.input, this.position, this.inputLength, false);
                        if (integerParser6 == null) {
                            this.position = i3;
                            return (AnPlusB) null;
                        }
                        this.position = integerParser6.getEndPos();
                        i2 = i4;
                        integerParser = integerParser4;
                        integerParser2 = integerParser6;
                    } else {
                        i2 = i4;
                        integerParser = integerParser4;
                        integerParser2 = integerParser5;
                    }
                } else {
                    integerParser = integerParser3;
                    i = i4;
                    integerParser2 = integerParser4;
                }
                anPlusB = new AnPlusB(integerParser == null ? 0 : integerParser.value() * i2, integerParser2 == null ? 0 : integerParser2.value() * i);
            }
            skipWhitespace();
            if (consume(')')) {
                return anPlusB;
            }
            this.position = i3;
            return (AnPlusB) null;
        }

        private String nextAttribValue() {
            if (empty()) {
                return (String) null;
            }
            String strNextQuotedString = nextQuotedString();
            return strNextQuotedString == null ? nextIdentifier() : strNextQuotedString;
        }

        private List<String> nextIdentListParam() throws CSSParseException {
            if (empty()) {
                return (List) null;
            }
            int i = this.position;
            ArrayList arrayList = (ArrayList) null;
            if (!consume('(')) {
                return (List) null;
            }
            skipWhitespace();
            do {
                String strNextIdentifier = nextIdentifier();
                if (strNextIdentifier == null) {
                    this.position = i;
                    return (List) null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strNextIdentifier);
                skipWhitespace();
            } while (skipCommaWhitespace());
            if (consume(')')) {
                return arrayList;
            }
            this.position = i;
            return (List) null;
        }

        private List<Selector> nextPseudoNotParam() throws CSSParseException {
            if (empty()) {
                return (List) null;
            }
            int i = this.position;
            if (!consume('(')) {
                return (List) null;
            }
            skipWhitespace();
            List<Selector> listNextSelectorGroup = nextSelectorGroup();
            if (listNextSelectorGroup == null) {
                this.position = i;
                return (List) null;
            }
            if (!consume(')')) {
                this.position = i;
                return (List) null;
            }
            for (Selector selector : listNextSelectorGroup) {
                if (selector.simpleSelectors == null) {
                    break;
                }
                for (SimpleSelector simpleSelector : selector.simpleSelectors) {
                    if (simpleSelector.pseudos == null) {
                        break;
                    }
                    Iterator<PseudoClass> it = simpleSelector.pseudos.iterator();
                    while (it.hasNext()) {
                        if (it.next() instanceof PseudoClassNot) {
                            return (List) null;
                        }
                    }
                }
            }
            return listNextSelectorGroup;
        }

        public List<Selector> nextSelectorGroup() throws CSSParseException {
            if (empty()) {
                return (List) null;
            }
            ArrayList arrayList = new ArrayList(1);
            Selector selector = new Selector();
            while (!empty() && nextSimpleSelector(selector)) {
                if (skipCommaWhitespace()) {
                    arrayList.add(selector);
                    selector = new Selector();
                }
            }
            if (!selector.isEmpty()) {
                arrayList.add(selector);
            }
            return arrayList;
        }

        private void parsePseudoClass(Selector selector, SimpleSelector simpleSelector) throws CSSParseException {
            PseudoClass pseudoClassNotSupported;
            String strNextIdentifier = nextIdentifier();
            if (strNextIdentifier == null) {
                throw new CSSParseException("Invalid pseudo class");
            }
            PseudoClassIdents pseudoClassIdentsFromString = PseudoClassIdents.fromString(strNextIdentifier);
            if (pseudoClassIdentsFromString == PseudoClassIdents.first_child) {
                pseudoClassNotSupported = new PseudoClassAnPlusB(0, 1, true, false, (String) null);
                selector.addedAttributeOrPseudo();
            } else if (pseudoClassIdentsFromString == PseudoClassIdents.last_child) {
                pseudoClassNotSupported = new PseudoClassAnPlusB(0, 1, false, false, (String) null);
                selector.addedAttributeOrPseudo();
            } else if (pseudoClassIdentsFromString == PseudoClassIdents.only_child) {
                pseudoClassNotSupported = new PseudoClassOnlyChild(false, (String) null);
                selector.addedAttributeOrPseudo();
            } else if (pseudoClassIdentsFromString == PseudoClassIdents.first_of_type) {
                pseudoClassNotSupported = new PseudoClassAnPlusB(0, 1, true, true, simpleSelector.f4684tag);
                selector.addedAttributeOrPseudo();
            } else if (pseudoClassIdentsFromString == PseudoClassIdents.last_of_type) {
                pseudoClassNotSupported = new PseudoClassAnPlusB(0, 1, false, true, simpleSelector.f4684tag);
                selector.addedAttributeOrPseudo();
            } else if (pseudoClassIdentsFromString == PseudoClassIdents.only_of_type) {
                pseudoClassNotSupported = new PseudoClassOnlyChild(true, simpleSelector.f4684tag);
                selector.addedAttributeOrPseudo();
            } else if (pseudoClassIdentsFromString == PseudoClassIdents.root) {
                pseudoClassNotSupported = new PseudoClassRoot();
                selector.addedAttributeOrPseudo();
            } else if (pseudoClassIdentsFromString == PseudoClassIdents.empty) {
                pseudoClassNotSupported = new PseudoClassEmpty();
                selector.addedAttributeOrPseudo();
            } else if (pseudoClassIdentsFromString == PseudoClassIdents.nth_child || pseudoClassIdentsFromString == PseudoClassIdents.nth_last_child || pseudoClassIdentsFromString == PseudoClassIdents.nth_of_type || pseudoClassIdentsFromString == PseudoClassIdents.nth_last_of_type) {
                boolean z = pseudoClassIdentsFromString == PseudoClassIdents.nth_child || pseudoClassIdentsFromString == PseudoClassIdents.nth_of_type;
                boolean z2 = pseudoClassIdentsFromString == PseudoClassIdents.nth_of_type || pseudoClassIdentsFromString == PseudoClassIdents.nth_last_of_type;
                AnPlusB anPlusBNextAnPlusB = nextAnPlusB();
                if (anPlusBNextAnPlusB == null) {
                    throw new CSSParseException(new StringBuffer().append("Invalid or missing parameter section for pseudo class: ").append(strNextIdentifier).toString());
                }
                pseudoClassNotSupported = new PseudoClassAnPlusB(anPlusBNextAnPlusB.f4676a, anPlusBNextAnPlusB.f4677b, z, z2, simpleSelector.f4684tag);
                selector.addedAttributeOrPseudo();
            } else if (pseudoClassIdentsFromString == PseudoClassIdents.not) {
                List<Selector> listNextPseudoNotParam = nextPseudoNotParam();
                if (listNextPseudoNotParam == null) {
                    throw new CSSParseException(new StringBuffer().append("Invalid or missing parameter section for pseudo class: ").append(strNextIdentifier).toString());
                }
                PseudoClassNot pseudoClassNot = new PseudoClassNot(listNextPseudoNotParam);
                selector.specificity = pseudoClassNot.getSpecificity();
                pseudoClassNotSupported = pseudoClassNot;
            } else if (pseudoClassIdentsFromString == PseudoClassIdents.target) {
                pseudoClassNotSupported = new PseudoClassTarget();
                selector.addedAttributeOrPseudo();
            } else if (pseudoClassIdentsFromString == PseudoClassIdents.lang) {
                nextIdentListParam();
                pseudoClassNotSupported = new PseudoClassNotSupported(strNextIdentifier);
                selector.addedAttributeOrPseudo();
            } else {
                if (pseudoClassIdentsFromString != PseudoClassIdents.link && pseudoClassIdentsFromString != PseudoClassIdents.visited && pseudoClassIdentsFromString != PseudoClassIdents.hover && pseudoClassIdentsFromString != PseudoClassIdents.active && pseudoClassIdentsFromString != PseudoClassIdents.focus && pseudoClassIdentsFromString != PseudoClassIdents.enabled && pseudoClassIdentsFromString != PseudoClassIdents.disabled && pseudoClassIdentsFromString != PseudoClassIdents.checked && pseudoClassIdentsFromString != PseudoClassIdents.indeterminate) {
                    throw new CSSParseException(new StringBuffer().append("Unsupported pseudo class: ").append(strNextIdentifier).toString());
                }
                pseudoClassNotSupported = new PseudoClassNotSupported(strNextIdentifier);
                selector.addedAttributeOrPseudo();
            }
            simpleSelector.addPseudo(pseudoClassNotSupported);
        }

        private int scanForIdentifier() {
            if (empty()) {
                return this.position;
            }
            int i = this.position;
            int i2 = this.position;
            int iCharAt = this.input.charAt(this.position);
            if (iCharAt == 45) {
                iCharAt = advanceChar();
            }
            if ((iCharAt >= 65 && iCharAt <= 90) || ((iCharAt >= 97 && iCharAt <= 122) || iCharAt == 95)) {
                int iAdvanceChar = advanceChar();
                while (true) {
                    if ((iAdvanceChar < 65 || iAdvanceChar > 90) && ((iAdvanceChar < 97 || iAdvanceChar > 122) && !((iAdvanceChar >= 48 && iAdvanceChar <= 57) || iAdvanceChar == 45 || iAdvanceChar == 95))) {
                        break;
                    }
                    iAdvanceChar = advanceChar();
                }
                i2 = this.position;
            }
            this.position = i;
            return i2;
        }

        String nextCSSString() {
            int iHexChar;
            if (empty()) {
                return (String) null;
            }
            char cCharAt = this.input.charAt(this.position);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return (String) null;
            }
            StringBuilder sb = new StringBuilder();
            this.position++;
            int iIntValue = nextChar().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = nextChar().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = nextChar().intValue();
                        } else {
                            int iHexChar2 = hexChar(iIntValue);
                            if (iHexChar2 != -1) {
                                for (int i = 1; i <= 5 && (iHexChar = hexChar((iIntValue = nextChar().intValue()))) != -1; i++) {
                                    iHexChar2 = (iHexChar2 * 16) + iHexChar;
                                }
                                sb.append((char) iHexChar2);
                            }
                        }
                    }
                }
                sb.append((char) iIntValue);
                iIntValue = nextChar().intValue();
            }
            return sb.toString();
        }

        String nextIdentifier() {
            int iScanForIdentifier = scanForIdentifier();
            if (iScanForIdentifier == this.position) {
                return (String) null;
            }
            String strSubstring = this.input.substring(this.position, iScanForIdentifier);
            this.position = iScanForIdentifier;
            return strSubstring;
        }

        String nextLegacyURL() {
            char cCharAt;
            int iHexChar;
            StringBuilder sb = new StringBuilder();
            while (!empty() && (cCharAt = this.input.charAt(this.position)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !isWhitespace(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                this.position++;
                if (cCharAt == '\\') {
                    if (!empty()) {
                        String str = this.input;
                        int i = this.position;
                        this.position = i + 1;
                        cCharAt = str.charAt(i);
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                            int iHexChar2 = hexChar(cCharAt);
                            if (iHexChar2 != -1) {
                                int i2 = iHexChar2;
                                for (int i3 = 1; i3 <= 5 && !empty() && (iHexChar = hexChar(this.input.charAt(this.position))) != -1; i3++) {
                                    this.position++;
                                    i2 = (i2 * 16) + iHexChar;
                                }
                                sb.append((char) i2);
                            }
                        }
                    }
                }
                sb.append(cCharAt);
            }
            return sb.length() == 0 ? (String) null : sb.toString();
        }

        String nextPropertyValue() {
            if (empty()) {
                return (String) null;
            }
            int i = this.position;
            int i2 = this.position;
            int iCharAt = this.input.charAt(this.position);
            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !isEOL(iCharAt)) {
                if (!isWhitespace(iCharAt)) {
                    i2 = this.position + 1;
                }
                iCharAt = advanceChar();
            }
            if (this.position > i) {
                return this.input.substring(i, i2);
            }
            this.position = i;
            return (String) null;
        }

        boolean nextSimpleSelector(Selector selector) throws CSSParseException {
            Combinator combinator;
            if (empty()) {
                return false;
            }
            int i = this.position;
            Combinator combinator2 = (Combinator) null;
            SimpleSelector simpleSelector = (SimpleSelector) null;
            if (selector.isEmpty()) {
                combinator = combinator2;
            } else if (consume('>')) {
                Combinator combinator3 = Combinator.CHILD;
                skipWhitespace();
                combinator = combinator3;
            } else {
                if (consume(SignatureVisitor.EXTENDS)) {
                    combinator2 = Combinator.FOLLOWS;
                    skipWhitespace();
                }
                combinator = combinator2;
            }
            if (consume('*')) {
                simpleSelector = new SimpleSelector(combinator, (String) null);
            } else {
                String strNextIdentifier = nextIdentifier();
                if (strNextIdentifier != null) {
                    simpleSelector = new SimpleSelector(combinator, strNextIdentifier);
                    selector.addedElement();
                }
            }
            while (!empty()) {
                if (!consume(FilenameUtils.EXTENSION_SEPARATOR)) {
                    if (!consume('#')) {
                        if (!consume('[')) {
                            if (!consume(':')) {
                                break;
                            }
                            if (simpleSelector == null) {
                                simpleSelector = new SimpleSelector(combinator, (String) null);
                            }
                            parsePseudoClass(selector, simpleSelector);
                        } else {
                            SimpleSelector simpleSelector2 = simpleSelector == null ? new SimpleSelector(combinator, (String) null) : simpleSelector;
                            skipWhitespace();
                            String strNextIdentifier2 = nextIdentifier();
                            String strNextAttribValue = (String) null;
                            if (strNextIdentifier2 == null) {
                                throw new CSSParseException("Invalid attribute simpleSelectors");
                            }
                            skipWhitespace();
                            AttribOp attribOp = (AttribOp) null;
                            if (consume(SignatureVisitor.INSTANCEOF)) {
                                attribOp = AttribOp.EQUALS;
                            } else if (consume("~=")) {
                                attribOp = AttribOp.INCLUDES;
                            } else if (consume("|=")) {
                                attribOp = AttribOp.DASHMATCH;
                            }
                            if (attribOp != null) {
                                skipWhitespace();
                                strNextAttribValue = nextAttribValue();
                                if (strNextAttribValue == null) {
                                    throw new CSSParseException("Invalid attribute simpleSelectors");
                                }
                                skipWhitespace();
                            }
                            if (!consume(']')) {
                                throw new CSSParseException("Invalid attribute simpleSelectors");
                            }
                            if (attribOp == null) {
                                attribOp = AttribOp.EXISTS;
                            }
                            simpleSelector2.addAttrib(strNextIdentifier2, attribOp, strNextAttribValue);
                            selector.addedAttributeOrPseudo();
                            simpleSelector = simpleSelector2;
                        }
                    } else {
                        if (simpleSelector == null) {
                            simpleSelector = new SimpleSelector(combinator, (String) null);
                        }
                        String strNextIdentifier3 = nextIdentifier();
                        if (strNextIdentifier3 == null) {
                            throw new CSSParseException("Invalid \"#id\" simpleSelectors");
                        }
                        simpleSelector.addAttrib("id", AttribOp.EQUALS, strNextIdentifier3);
                        selector.addedIdAttribute();
                    }
                } else {
                    if (simpleSelector == null) {
                        simpleSelector = new SimpleSelector(combinator, (String) null);
                    }
                    String strNextIdentifier4 = nextIdentifier();
                    if (strNextIdentifier4 == null) {
                        throw new CSSParseException("Invalid \".class\" simpleSelectors");
                    }
                    simpleSelector.addAttrib(SvgConstants.ATTR_CLASS, AttribOp.EQUALS, strNextIdentifier4);
                    selector.addedAttributeOrPseudo();
                }
            }
            if (simpleSelector != null) {
                selector.m7048add(simpleSelector);
                return true;
            }
            this.position = i;
            return false;
        }

        String nextURL() {
            if (empty()) {
                return (String) null;
            }
            int i = this.position;
            if (!consume("url(")) {
                return (String) null;
            }
            skipWhitespace();
            String strNextCSSString = nextCSSString();
            if (strNextCSSString == null) {
                strNextCSSString = nextLegacyURL();
            }
            if (strNextCSSString == null) {
                this.position = i;
                return (String) null;
            }
            skipWhitespace();
            if (empty() || consume(")")) {
                return strNextCSSString;
            }
            this.position = i;
            return (String) null;
        }
    }

    private enum Combinator {
        DESCENDANT,
        CHILD,
        FOLLOWS;

        public static Combinator valueOf(String str) {
            for (Combinator combinator : values()) {
                if (combinator.name().equals(str)) {
                    return combinator;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    @SuppressWarnings("unused")
    enum MediaType {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv;

        public static MediaType valueOf(String str) {
            for (MediaType mediaType : values()) {
                if (mediaType.name().equals(str)) {
                    return mediaType;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    private interface PseudoClass {
        boolean matches(RuleMatchContext ruleMatchContext, SVG.SvgElementBase svgElementBase);
    }

    private static class PseudoClassAnPlusB implements PseudoClass {

        private int f4681a;

        private int f4682b;
        private boolean isFromStart;
        private boolean isOfType;
        private String nodeName;

        PseudoClassAnPlusB(int i, int i2, boolean z, boolean z2, String str) {
            this.f4681a = i;
            this.f4682b = i2;
            this.isFromStart = z;
            this.isOfType = z2;
            this.nodeName = str;
        }

        @Override
        public boolean matches(RuleMatchContext ruleMatchContext, SVG.SvgElementBase svgElementBase) {
            int i;
            int i2;
            String nodeName = (this.isOfType && this.nodeName == null) ? svgElementBase.getNodeName() : this.nodeName;
            if (svgElementBase.parent != null) {
                Iterator<SVG.SvgObject> it = svgElementBase.parent.getChildren().iterator();
                i = 0;
                i2 = 0;
                while (it.hasNext()) {
                    SVG.SvgElementBase svgElementBase2 = (SVG.SvgElementBase) it.next();
                    if (svgElementBase2 == svgElementBase) {
                        i = i2;
                    }
                    if (nodeName == null || svgElementBase2.getNodeName().equals(nodeName)) {
                        i2++;
                    }
                }
            } else {
                i = 0;
                i2 = 1;
            }
            int i3 = this.isFromStart ? i + 1 : i2 - i;
            if (this.f4681a == 0) {
                return i3 == this.f4682b;
            }
            return (i3 - this.f4682b) % this.f4681a == 0 && (Integer.signum(i3 - this.f4682b) == 0 || Integer.signum(i3 - this.f4682b) == Integer.signum(this.f4681a));
        }

        public String toString() {
            String str = this.isFromStart ? "" : "last-";
            return this.isOfType ? String.format("nth-%schild(%dn%+d of type <%s>)", str, new Integer(this.f4681a), new Integer(this.f4682b), this.nodeName) : String.format("nth-%schild(%dn%+d)", str, new Integer(this.f4681a), new Integer(this.f4682b));
        }
    }

    private static class PseudoClassEmpty implements PseudoClass {
        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public boolean matches(RuleMatchContext ruleMatchContext, SVG.SvgElementBase svgElementBase) {
            return !(svgElementBase instanceof SVG.SvgContainer) || ((SVG.SvgContainer) svgElementBase).getChildren().size() == 0;
        }

        public String toString() {
            return "empty";
        }
    }

    private enum PseudoClassIdents {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;

        private static final Map<String, PseudoClassIdents> cache = new HashMap();

        static {
            for (PseudoClassIdents pseudoClassIdents : values()) {
                if (pseudoClassIdents != UNSUPPORTED) {
                    cache.put(pseudoClassIdents.name().replace('_', SignatureVisitor.SUPER), pseudoClassIdents);
                }
            }
        }

        public static PseudoClassIdents fromString(String str) {
            PseudoClassIdents pseudoClassIdents = cache.get(str);
            return pseudoClassIdents != null ? pseudoClassIdents : UNSUPPORTED;
        }

        public static PseudoClassIdents valueOf(String str) {
            for (PseudoClassIdents pseudoClassIdents : values()) {
                if (pseudoClassIdents.name().equals(str)) {
                    return pseudoClassIdents;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    private static class PseudoClassNot implements PseudoClass {
        private List<Selector> selectorGroup;

        PseudoClassNot(List<Selector> list) {
            this.selectorGroup = list;
        }

        int getSpecificity() {
            int i = Integer.MIN_VALUE;
            for (Selector selector : this.selectorGroup) {
                if (selector.specificity > i) {
                    i = selector.specificity;
                }
            }
            return i;
        }

        @Override
        public boolean matches(RuleMatchContext ruleMatchContext, SVG.SvgElementBase svgElementBase) {
            Iterator<Selector> it = this.selectorGroup.iterator();
            while (it.hasNext()) {
                if (CSSParser.ruleMatch(ruleMatchContext, it.next(), svgElementBase)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return new StringBuffer().append(new StringBuffer().append("not(").append(this.selectorGroup).toString()).append(")").toString();
        }
    }

    private static class PseudoClassNotSupported implements PseudoClass {
        private String clazz;

        PseudoClassNotSupported(String str) {
            this.clazz = str;
        }

        @Override
        public boolean matches(RuleMatchContext ruleMatchContext, SVG.SvgElementBase svgElementBase) {
            return false;
        }

        public String toString() {
            return this.clazz;
        }
    }

    private static class PseudoClassOnlyChild implements PseudoClass {
        private boolean isOfType;
        private String nodeName;

        public PseudoClassOnlyChild(boolean z, String str) {
            this.isOfType = z;
            this.nodeName = str;
        }

        @Override
        public boolean matches(RuleMatchContext ruleMatchContext, SVG.SvgElementBase svgElementBase) {
            int i;
            String nodeName = (this.isOfType && this.nodeName == null) ? svgElementBase.getNodeName() : this.nodeName;
            if (svgElementBase.parent != null) {
                Iterator<SVG.SvgObject> it = svgElementBase.parent.getChildren().iterator();
                i = 0;
                while (it.hasNext()) {
                    SVG.SvgElementBase svgElementBase2 = (SVG.SvgElementBase) it.next();
                    if (nodeName == null || svgElementBase2.getNodeName().equals(nodeName)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            return i == 1;
        }

        public String toString() {
            return this.isOfType ? String.format("only-of-type <%s>", this.nodeName) : String.format("only-child", new Object[0]);
        }
    }

    private static class PseudoClassRoot implements PseudoClass {
        @Override
        public boolean matches(RuleMatchContext ruleMatchContext, SVG.SvgElementBase svgElementBase) {
            return svgElementBase.parent == null;
        }

        public String toString() {
            return "root";
        }
    }

    private static class PseudoClassTarget implements PseudoClass {
        @Override
        public boolean matches(RuleMatchContext ruleMatchContext, SVG.SvgElementBase svgElementBase) {
            return ruleMatchContext != null && svgElementBase == ruleMatchContext.targetElement;
        }

        public String toString() {
            return "target";
        }
    }

    static class Rule {
        Selector selector;
        Source source;
        SVG.Style style;

        Rule(Selector selector, SVG.Style style, Source source) {
            this.selector = (Selector) null;
            this.style = (SVG.Style) null;
            this.selector = selector;
            this.style = style;
            this.source = source;
        }

        public String toString() {
            return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(String.valueOf(this.selector)).append(" {...} (src=").toString()).append(this.source).toString()).append(")").toString();
        }
    }

    static class RuleMatchContext {
        SVG.SvgElementBase targetElement;

        public String toString() {
            return this.targetElement != null ? String.format("<%s id=\"%s\">", this.targetElement.getNodeName(), this.targetElement.f4719id) : "";
        }
    }

    static class Ruleset {
        private List<Rule> rules = (List) null;

        void m7047add(Rule rule) {
            if (this.rules == null) {
                this.rules = new ArrayList();
            }
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.rules.size()) {
                    this.rules.add(rule);
                    return;
                } else {
                    if (this.rules.get(i2).selector.specificity > rule.selector.specificity) {
                        this.rules.add(i2, rule);
                        return;
                    }
                    i = i2 + 1;
                }
            }
        }

        void addAll(Ruleset ruleset) {
            if (ruleset.rules == null) {
                return;
            }
            if (this.rules == null) {
                this.rules = new ArrayList(ruleset.rules.size());
            }
            Iterator<Rule> it = ruleset.rules.iterator();
            while (it.hasNext()) {
                m7047add(it.next());
            }
        }

        List<Rule> getRules() {
            return this.rules;
        }

        boolean isEmpty() {
            return this.rules == null || this.rules.isEmpty();
        }

        void removeFromSource(Source source) {
            if (this.rules == null) {
                return;
            }
            Iterator<Rule> it = this.rules.iterator();
            while (it.hasNext()) {
                if (it.next().source == source) {
                    it.remove();
                }
            }
        }

        int ruleCount() {
            if (this.rules != null) {
                return this.rules.size();
            }
            return 0;
        }

        public String toString() {
            if (this.rules == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Iterator<Rule> it = this.rules.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString()).append('\n');
            }
            return sb.toString();
        }
    }

    static class Selector {
        List<SimpleSelector> simpleSelectors = (List) null;
        int specificity = 0;

        void m7048add(SimpleSelector simpleSelector) {
            if (this.simpleSelectors == null) {
                this.simpleSelectors = new ArrayList();
            }
            this.simpleSelectors.add(simpleSelector);
        }

        void addedAttributeOrPseudo() {
            this.specificity += 1000;
        }

        void addedElement() {
            this.specificity++;
        }

        void addedIdAttribute() {
            this.specificity += LuaState.LUAI_MAXSTACK;
        }

        SimpleSelector m7049get(int i) {
            return this.simpleSelectors.get(i);
        }

        boolean isEmpty() {
            return this.simpleSelectors == null || this.simpleSelectors.isEmpty();
        }

        int size() {
            if (this.simpleSelectors == null) {
                return 0;
            }
            return this.simpleSelectors.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator<SimpleSelector> it = this.simpleSelectors.iterator();
            while (it.hasNext()) {
                sb.append(it.next()).append(' ');
            }
            return sb.append('[').append(this.specificity).append(']').toString();
        }
    }

    private static class SimpleSelector {
        Combinator combinator;

        String f4684tag;
        List<Attrib> attribs = (List) null;
        List<PseudoClass> pseudos = (List) null;

        SimpleSelector(Combinator combinator, String str) {
            this.combinator = (Combinator) null;
            this.f4684tag = (String) null;
            this.combinator = combinator == null ? Combinator.DESCENDANT : combinator;
            this.f4684tag = str;
        }

        void addAttrib(String str, AttribOp attribOp, String str2) {
            if (this.attribs == null) {
                this.attribs = new ArrayList();
            }
            this.attribs.add(new Attrib(str, attribOp, str2));
        }

        void addPseudo(PseudoClass pseudoClass) {
            if (this.pseudos == null) {
                this.pseudos = new ArrayList();
            }
            this.pseudos.add(pseudoClass);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.combinator == Combinator.CHILD) {
                sb.append("> ");
            } else if (this.combinator == Combinator.FOLLOWS) {
                sb.append("+ ");
            }
            sb.append(this.f4684tag == null ? "*" : this.f4684tag);
            if (this.attribs != null) {
                for (Attrib attrib : this.attribs) {
                    sb.append('[').append(attrib.name);
                    AttribOp attribOp = attrib.operation;
                    if (attribOp == AttribOp.EQUALS) {
                        sb.append(SignatureVisitor.INSTANCEOF).append(attrib.value);
                    } else if (attribOp == AttribOp.INCLUDES) {
                        sb.append("~=").append(attrib.value);
                    } else if (attribOp == AttribOp.DASHMATCH) {
                        sb.append("|=").append(attrib.value);
                    }
                    sb.append(']');
                }
            }
            if (this.pseudos != null) {
                Iterator<PseudoClass> it = this.pseudos.iterator();
                while (it.hasNext()) {
                    sb.append(':').append(it.next());
                }
            }
            return sb.toString();
        }
    }

    enum Source {
        Document,
        RenderOptions;

        public static Source valueOf(String str) {
            for (Source source : values()) {
                if (source.name().equals(str)) {
                    return source;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    CSSParser() {
        this(MediaType.screen, Source.Document);
    }

    CSSParser(MediaType mediaType, Source source) {
        this.deviceMediaType = (MediaType) null;
        this.source = (Source) null;
        this.inMediaRule = false;
        this.deviceMediaType = mediaType;
        this.source = source;
    }

    CSSParser(Source source) {
        this(MediaType.screen, source);
    }

    private static int getChildPosition(List<SVG.SvgContainer> list, int i, SVG.SvgElementBase svgElementBase) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        if (list.get(i) != svgElementBase.parent) {
            return -1;
        }
        Iterator<SVG.SvgObject> it = svgElementBase.parent.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next() == svgElementBase) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    static boolean mediaMatches(String str, MediaType mediaType) {
        CSSTextScanner cSSTextScanner = new CSSTextScanner(str);
        cSSTextScanner.skipWhitespace();
        return mediaMatches(parseMediaList(cSSTextScanner), mediaType);
    }

    private static boolean mediaMatches(List<MediaType> list, MediaType mediaType) {
        for (MediaType mediaType2 : list) {
            if (mediaType2 == MediaType.all || mediaType2 == mediaType) {
                return true;
            }
        }
        return false;
    }

    private void parseAtRule(Ruleset ruleset, CSSTextScanner cSSTextScanner) throws CSSParseException {
        String strNextIdentifier = cSSTextScanner.nextIdentifier();
        cSSTextScanner.skipWhitespace();
        if (strNextIdentifier == null) {
            throw new CSSParseException("Invalid '@' rule");
        }
        if (!this.inMediaRule && strNextIdentifier.equals(SVGParser.XML_STYLESHEET_ATTR_MEDIA)) {
            List<MediaType> mediaList = parseMediaList(cSSTextScanner);
            if (!cSSTextScanner.consume('{')) {
                throw new CSSParseException("Invalid @media rule: missing rule set");
            }
            cSSTextScanner.skipWhitespace();
            if (mediaMatches(mediaList, this.deviceMediaType)) {
                this.inMediaRule = true;
                ruleset.addAll(parseRuleset(cSSTextScanner));
                this.inMediaRule = false;
            } else {
                parseRuleset(cSSTextScanner);
            }
            if (!cSSTextScanner.empty() && !cSSTextScanner.consume('}')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.inMediaRule || !strNextIdentifier.equals("import")) {
            warn("Ignoring @%s rule", strNextIdentifier);
            skipAtRule(cSSTextScanner);
        } else {
            String strNextURL = cSSTextScanner.nextURL();
            if (strNextURL == null) {
                strNextURL = cSSTextScanner.nextCSSString();
            }
            if (strNextURL == null) {
                throw new CSSParseException("Invalid @import rule: expected string or url()");
            }
            cSSTextScanner.skipWhitespace();
            List<MediaType> mediaList2 = parseMediaList(cSSTextScanner);
            if (!cSSTextScanner.empty() && !cSSTextScanner.consume(';')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
            if (SVG.getFileResolver() != null && mediaMatches(mediaList2, this.deviceMediaType)) {
                String strResolveCSSStyleSheet = SVG.getFileResolver().resolveCSSStyleSheet(strNextURL);
                if (strResolveCSSStyleSheet == null) {
                    return;
                } else {
                    ruleset.addAll(parse(strResolveCSSStyleSheet));
                }
            }
        }
        cSSTextScanner.skipWhitespace();
    }

    public static List<String> parseClassAttribute(String str) {
        CSSTextScanner cSSTextScanner = new CSSTextScanner(str);
        List<String> arrayList = (List) null;
        while (!cSSTextScanner.empty()) {
            String strNextToken = cSSTextScanner.nextToken();
            if (strNextToken != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(strNextToken);
                cSSTextScanner.skipWhitespace();
            }
        }
        return arrayList;
    }

    private SVG.Style parseDeclarations(CSSTextScanner cSSTextScanner) throws CSSParseException {
        SVG.Style style = new SVG.Style();
        do {
            String strNextIdentifier = cSSTextScanner.nextIdentifier();
            cSSTextScanner.skipWhitespace();
            if (!cSSTextScanner.consume(':')) {
                throw new CSSParseException("Expected ':'");
            }
            cSSTextScanner.skipWhitespace();
            String strNextPropertyValue = cSSTextScanner.nextPropertyValue();
            if (strNextPropertyValue != null) {
                cSSTextScanner.skipWhitespace();
                if (cSSTextScanner.consume('!')) {
                    cSSTextScanner.skipWhitespace();
                    if (!cSSTextScanner.consume("important")) {
                        throw new CSSParseException("Malformed rule set: found unexpected '!'");
                    }
                    cSSTextScanner.skipWhitespace();
                }
                cSSTextScanner.consume(';');
                SVGParser.processStyleProperty(style, strNextIdentifier, strNextPropertyValue);
                cSSTextScanner.skipWhitespace();
                if (cSSTextScanner.empty()) {
                    break;
                }
            } else {
                throw new CSSParseException("Expected property value");
            }
        } while (!cSSTextScanner.consume('}'));
        return style;
    }

    private static List<MediaType> parseMediaList(CSSTextScanner cSSTextScanner) {
        String strNextWord;
        ArrayList arrayList = new ArrayList();
        while (!cSSTextScanner.empty() && (strNextWord = cSSTextScanner.nextWord()) != null) {
            try {
                arrayList.add(MediaType.valueOf(strNextWord));
            } catch (IllegalArgumentException e) {
            }
            if (!cSSTextScanner.skipCommaWhitespace()) {
                break;
            }
        }
        return arrayList;
    }

    private boolean parseRule(Ruleset ruleset, CSSTextScanner cSSTextScanner) throws CSSParseException {
        List listNextSelectorGroup = cSSTextScanner.nextSelectorGroup();
        if (listNextSelectorGroup == null || listNextSelectorGroup.isEmpty()) {
            return false;
        }
        if (!cSSTextScanner.consume('{')) {
            throw new CSSParseException("Malformed rule block: expected '{'");
        }
        cSSTextScanner.skipWhitespace();
        SVG.Style declarations = parseDeclarations(cSSTextScanner);
        cSSTextScanner.skipWhitespace();
        Iterator it = listNextSelectorGroup.iterator();
        while (it.hasNext()) {
            ruleset.m7047add(new Rule((Selector) it.next(), declarations, this.source));
        }
        return true;
    }

    private Ruleset parseRuleset(CSSTextScanner cSSTextScanner) {
        Ruleset ruleset = new Ruleset();
        while (!cSSTextScanner.empty()) {
            try {
                if (!cSSTextScanner.consume("<!--") && !cSSTextScanner.consume("-->")) {
                    if (!cSSTextScanner.consume('@')) {
                        if (!parseRule(ruleset, cSSTextScanner)) {
                            break;
                        }
                    } else {
                        parseAtRule(ruleset, cSSTextScanner);
                    }
                }
            } catch (CSSParseException e) {
                Log.e(f4675TAG, new StringBuffer().append("CSS parser terminated early due to error: ").append(e.getMessage()).toString());
            }
        }
        return ruleset;
    }

    private static boolean ruleMatch(RuleMatchContext ruleMatchContext, Selector selector, int i, List<SVG.SvgContainer> list, int i2, SVG.SvgElementBase svgElementBase) {
        SimpleSelector simpleSelectorM7049get = selector.m7049get(i);
        if (selectorMatch(ruleMatchContext, simpleSelectorM7049get, list, i2, svgElementBase)) {
            if (simpleSelectorM7049get.combinator == Combinator.DESCENDANT) {
                if (i == 0) {
                    return true;
                }
                while (i2 >= 0) {
                    if (ruleMatchOnAncestors(ruleMatchContext, selector, i - 1, list, i2)) {
                        return true;
                    }
                    i2--;
                }
                return false;
            }
            if (simpleSelectorM7049get.combinator == Combinator.CHILD) {
                return ruleMatchOnAncestors(ruleMatchContext, selector, i - 1, list, i2);
            }
            int childPosition = getChildPosition(list, i2, svgElementBase);
            if (childPosition > 0) {
                return ruleMatch(ruleMatchContext, selector, i - 1, list, i2, (SVG.SvgElementBase) svgElementBase.parent.getChildren().get(childPosition - 1));
            }
        }
        return false;
    }

    static boolean ruleMatch(RuleMatchContext ruleMatchContext, Selector selector, SVG.SvgElementBase svgElementBase) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = svgElementBase.parent; obj != null; obj = ((SVG.SvgObject) obj).parent) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return selector.size() == 1 ? selectorMatch(ruleMatchContext, selector.m7049get(0), arrayList, size, svgElementBase) : ruleMatch(ruleMatchContext, selector, selector.size() - 1, arrayList, size, svgElementBase);
    }

    private static boolean ruleMatchOnAncestors(RuleMatchContext ruleMatchContext, Selector selector, int i, List<SVG.SvgContainer> list, int i2) {
        SimpleSelector simpleSelectorM7049get = selector.m7049get(i);
        SVG.SvgElementBase svgElementBase = (SVG.SvgElementBase) ((SVG.SvgContainer) list.get(i2));
        if (!selectorMatch(ruleMatchContext, simpleSelectorM7049get, list, i2, svgElementBase)) {
            return false;
        }
        if (simpleSelectorM7049get.combinator != Combinator.DESCENDANT) {
            if (simpleSelectorM7049get.combinator == Combinator.CHILD) {
                return ruleMatchOnAncestors(ruleMatchContext, selector, i - 1, list, i2 - 1);
            }
            int childPosition = getChildPosition(list, i2, svgElementBase);
            if (childPosition <= 0) {
                return false;
            }
            return ruleMatch(ruleMatchContext, selector, i - 1, list, i2, (SVG.SvgElementBase) svgElementBase.parent.getChildren().get(childPosition - 1));
        }
        if (i == 0) {
            return true;
        }
        while (i2 > 0) {
            i2--;
            if (ruleMatchOnAncestors(ruleMatchContext, selector, i - 1, list, i2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean selectorMatch(RuleMatchContext ruleMatchContext, SimpleSelector simpleSelector, List<SVG.SvgContainer> list, int i, SVG.SvgElementBase svgElementBase) {
        if (simpleSelector.f4684tag != null && !simpleSelector.f4684tag.equals(svgElementBase.getNodeName().toLowerCase(Locale.US))) {
            return false;
        }
        if (simpleSelector.attribs != null) {
            for (Attrib attrib : simpleSelector.attribs) {
                String str = attrib.name;
                if (!str.equals("id")) {
                    if (str.equals(SvgConstants.ATTR_CLASS) && svgElementBase.classNames != null && svgElementBase.classNames.contains(attrib.value)) {
                    }
                    return false;
                }
                if (!attrib.value.equals(svgElementBase.f4719id)) {
                    return false;
                }
            }
        }
        if (simpleSelector.pseudos != null) {
            Iterator<PseudoClass> it = simpleSelector.pseudos.iterator();
            while (it.hasNext()) {
                if (!it.next().matches(ruleMatchContext, svgElementBase)) {
                    return false;
                }
            }
        }
        return true;
    }

    private void skipAtRule(CSSTextScanner cSSTextScanner) {
        int i = 0;
        while (!cSSTextScanner.empty()) {
            int iIntValue = cSSTextScanner.nextChar().intValue();
            if (iIntValue == 59 && i == 0) {
                return;
            }
            if (iIntValue == 123) {
                i++;
            } else if (iIntValue == 125 && i > 0) {
                int i2 = i - 1;
                if (i2 == 0) {
                    return;
                } else {
                    i = i2;
                }
            }
        }
    }

    private static void warn(String str, Object... objArr) {
        Log.w(f4675TAG, String.format(str, objArr));
    }

    Ruleset parse(String str) {
        CSSTextScanner cSSTextScanner = new CSSTextScanner(str);
        cSSTextScanner.skipWhitespace();
        return parseRuleset(cSSTextScanner);
    }
}
