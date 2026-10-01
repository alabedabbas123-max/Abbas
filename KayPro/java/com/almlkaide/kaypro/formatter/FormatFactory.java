package com.almlkaide.kaypro.formatter;

import android.content.Context;
import com.blankj.utilcode.util.ReflectUtils;
import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;
import com.google.googlejavaformat.java.ImportOrderer;
import com.google.googlejavaformat.java.JavaFormatterOptions;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.tencent.mm.util.TypedValue;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class FormatFactory {
    static {
        try {
            try {
                ReflectUtils.reflect(Class.forName("com.google.googlejavaformat.java.JavaFormatterOptions")).field("DEFAULT_MAX_LINE_LENGTH", new Integer(1000));
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        } catch (Throwable th) {
        }
    }

    public static boolean isSupportFormat(File file) {
        return getType(file) != null;
    }

    public static Type getType(File file) {
        return !file.isFile() ? (Type) null : getType(file.getName());
    }

    public static Type getType(String str) {
        if (str.endsWith(".java")) {
            return Type.JAVA;
        }
        if (!str.endsWith(TypedValue.XML_FILE) && str.endsWith(".json")) {
            return Type.JSON;
        }
        return (Type) null;
    }

    public static String format(Context context, String str, Type type) throws Exception {
        if (type == null) {
            throw new IllegalArgumentException("type is null");
        }
        if (type == Type.JAVA) {
            return formatJava(context, str);
        }
        if (type == Type.XML) {
            return formatXml(context, str);
        }
        if (type == Type.JSON) {
            return formatXml(context, str);
        }
        return str;
    }

    public static String formatJava(Context context, String str) throws FormatterException {
        JavaFormatterOptions javaFormatterOptionsBuild = JavaFormatterOptions.builder().build();
        return new Formatter(javaFormatterOptionsBuild).formatSource(ImportOrderer.reorderImports(str));
    }

    public static String formatXml(Context context, String str) throws TransformerException, ParserConfigurationException, SAXException, IOException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(str)));
        Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
        transformerNewTransformer.setOutputProperty("indent", "yes");
        transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformerNewTransformer.setOutputProperty("omit-xml-declaration", "yes");
        StreamResult streamResult = new StreamResult(new StringWriter());
        transformerNewTransformer.transform(new DOMSource(document), streamResult);
        return streamResult.getWriter().toString();
    }

    public static String formatJson(Context context, String str) {
        return formatJson(str);
    }

    public static String formatJson(String str) {
        return new GsonBuilder().setPrettyPrinting().create().toJson(new JsonParser().parse(str));
    }

    public static String compressionJson(String str) {
        return new GsonBuilder().setLenient().create().toJson(new JsonParser().parse(str));
    }

    public enum Type {
        XML,
        JAVA,
        JSON;

        public static Type valueOf(String str) {
            for (Type type : values()) {
                if (type.name().equals(str)) {
                    return type;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
