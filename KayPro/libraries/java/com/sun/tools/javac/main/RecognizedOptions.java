package com.sun.tools.javac.main;

import com.google.common.collect.Sets;
import com.sun.tools.javac.code.Lint;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.jvm.Target;
import com.sun.tools.javac.processing.JavacProcessingEnvironment;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Options;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.lang.model.SourceVersion;

public class RecognizedOptions {
    static Set<OptionName> javacOptions = m482of(OptionName.G, OptionName.G_NONE, OptionName.G_CUSTOM, OptionName.XLINT, OptionName.XLINT_CUSTOM, OptionName.NOWARN, OptionName.VERBOSE, OptionName.DEPRECATION, OptionName.CLASSPATH, OptionName.CP, OptionName.SOURCEPATH, OptionName.BOOTCLASSPATH, OptionName.XBOOTCLASSPATH_PREPEND, OptionName.XBOOTCLASSPATH_APPEND, OptionName.XBOOTCLASSPATH, OptionName.EXTDIRS, OptionName.DJAVA_EXT_DIRS, OptionName.ENDORSEDDIRS, OptionName.DJAVA_ENDORSED_DIRS, OptionName.PROC, OptionName.PROCESSOR, OptionName.PROCESSORPATH, OptionName.D, OptionName.S, OptionName.IMPLICIT, OptionName.ENCODING, OptionName.SOURCE, OptionName.TARGET, OptionName.VERSION, OptionName.FULLVERSION, OptionName.DIAGS, OptionName.HELP, OptionName.A, OptionName.X, OptionName.J, OptionName.MOREINFO, OptionName.WERROR, OptionName.PROMPT, OptionName.DOE, OptionName.PRINTSOURCE, OptionName.WARNUNCHECKED, OptionName.XMAXERRS, OptionName.XMAXWARNS, OptionName.XSTDOUT, OptionName.XPKGINFO, OptionName.XPRINT, OptionName.XPRINTROUNDS, OptionName.XPRINTPROCESSORINFO, OptionName.XPREFER, OptionName.O, OptionName.XJCOV, OptionName.XD, OptionName.AT, OptionName.SOURCEFILE);
    static Set<OptionName> javacFileManagerOptions = m482of(OptionName.CLASSPATH, OptionName.CP, OptionName.SOURCEPATH, OptionName.BOOTCLASSPATH, OptionName.XBOOTCLASSPATH_PREPEND, OptionName.XBOOTCLASSPATH_APPEND, OptionName.XBOOTCLASSPATH, OptionName.EXTDIRS, OptionName.DJAVA_EXT_DIRS, OptionName.ENDORSEDDIRS, OptionName.DJAVA_ENDORSED_DIRS, OptionName.PROCESSORPATH, OptionName.D, OptionName.S, OptionName.ENCODING, OptionName.SOURCE);
    static Set<OptionName> javacToolOptions = m482of(OptionName.G, OptionName.G_NONE, OptionName.G_CUSTOM, OptionName.XLINT, OptionName.XLINT_CUSTOM, OptionName.NOWARN, OptionName.VERBOSE, OptionName.DEPRECATION, OptionName.PROC, OptionName.PROCESSOR, OptionName.IMPLICIT, OptionName.SOURCE, OptionName.TARGET, OptionName.A, OptionName.MOREINFO, OptionName.WERROR, OptionName.PROMPT, OptionName.DOE, OptionName.PRINTSOURCE, OptionName.WARNUNCHECKED, OptionName.XMAXERRS, OptionName.XMAXWARNS, OptionName.XPKGINFO, OptionName.XPRINT, OptionName.XPRINTROUNDS, OptionName.XPRINTPROCESSORINFO, OptionName.XPREFER, OptionName.O, OptionName.XJCOV, OptionName.XD);

    public interface OptionHelper {
        void addClassName(String str);

        void addFile(File file);

        void error(String str, Object... objArr);

        void printFullVersion();

        void printHelp();

        void printVersion();

        void printXhelp();

        void setOut(PrintWriter printWriter);
    }

    private RecognizedOptions() {
    }

    public static class GrumpyHelper implements OptionHelper {
        @Override
        public void setOut(PrintWriter out) {
            throw new IllegalArgumentException();
        }

        @Override
        public void error(String key, Object... args) {
            throw new IllegalArgumentException(Main.getLocalizedString(key, args));
        }

        @Override
        public void printVersion() {
            throw new IllegalArgumentException();
        }

        @Override
        public void printFullVersion() {
            throw new IllegalArgumentException();
        }

        @Override
        public void printHelp() {
            throw new IllegalArgumentException();
        }

        @Override
        public void printXhelp() {
            throw new IllegalArgumentException();
        }

        @Override
        public void addFile(File f) {
            throw new IllegalArgumentException(f.getPath());
        }

        @Override
        public void addClassName(String s) {
            throw new IllegalArgumentException(s);
        }
    }

    public static <E extends Enum> Set<E> m482of(E p1, E... p2) {
        return Sets.immutableEnumSet(p1, p2);
    }

    static JavacOption.Option[] getJavaCompilerOptions(OptionHelper helper) {
        return getOptions(helper, javacOptions);
    }

    public static JavacOption.Option[] getJavacFileManagerOptions(OptionHelper helper) {
        return getOptions(helper, javacFileManagerOptions);
    }

    public static JavacOption.Option[] getJavacToolOptions(OptionHelper helper) {
        return getOptions(helper, javacToolOptions);
    }

    static JavacOption.Option[] getOptions(OptionHelper helper, Set<OptionName> desired) {
        ListBuffer<JavacOption.Option> options = new ListBuffer<>();
        for (JavacOption.Option option : getAll(helper)) {
            if (desired.contains(option.getName())) {
                options.append(option);
            }
        }
        return (JavacOption.Option[]) options.toArray(new JavacOption.Option[options.length()]);
    }

    public static JavacOption.Option[] getAll(final OptionHelper helper) {
        String str = "opt.arg.path";
        String str2 = "opt.bootclasspath";
        String str3 = "opt.arg.dirs";
        String str4 = "opt.arg.release";
        String str5 = "opt.arg.file";
        return new JavacOption.Option[]{new JavacOption.Option(OptionName.G, "opt.g"), new JavacOption.Option(OptionName.G_NONE, "opt.g.none") {
            @Override
            public boolean process(Options options, String option) {
                options.m517put("-g:", "none");
                return false;
            }
        }, new JavacOption.Option(OptionName.G_CUSTOM, "opt.g.lines.vars.source", JavacOption.ChoiceKind.ANYOF, "lines", "vars", "source"), new JavacOption.XOption(OptionName.XLINT, "opt.Xlint"), new JavacOption.XOption(OptionName.XLINT_CUSTOM, "opt.Xlint.suboptlist", JavacOption.ChoiceKind.ANYOF, getXLintChoices()), new JavacOption.Option(OptionName.NOWARN, "opt.nowarn") {
            @Override
            public boolean process(Options options, String option) {
                options.m517put("-Xlint:none", option);
                return false;
            }
        }, new JavacOption.Option(OptionName.VERBOSE, "opt.verbose"), new JavacOption.Option(OptionName.DEPRECATION, "opt.deprecation") {
            @Override
            public boolean process(Options options, String option) {
                options.m517put("-Xlint:deprecation", option);
                return false;
            }
        }, new JavacOption.Option(OptionName.CLASSPATH, "opt.arg.path", "opt.classpath"), new JavacOption.Option(OptionName.CP, str, "opt.classpath") {
            @Override
            public boolean process(Options options, String option, String arg) {
                return super.process(options, "-classpath", arg);
            }
        }, new JavacOption.Option(OptionName.SOURCEPATH, "opt.arg.path", "opt.sourcepath"), new JavacOption.Option(OptionName.BOOTCLASSPATH, str, str2) {
            @Override
            public boolean process(Options options, String option, String arg) {
                options.remove("-Xbootclasspath/p:");
                options.remove("-Xbootclasspath/a:");
                return super.process(options, option, arg);
            }
        }, new JavacOption.XOption(OptionName.XBOOTCLASSPATH_PREPEND, "opt.arg.path", "opt.Xbootclasspath.p"), new JavacOption.XOption(OptionName.XBOOTCLASSPATH_APPEND, "opt.arg.path", "opt.Xbootclasspath.a"), new JavacOption.XOption(OptionName.XBOOTCLASSPATH, str, str2) {
            @Override
            public boolean process(Options options, String option, String arg) {
                options.remove("-Xbootclasspath/p:");
                options.remove("-Xbootclasspath/a:");
                return super.process(options, "-bootclasspath", arg);
            }
        }, new JavacOption.Option(OptionName.EXTDIRS, "opt.arg.dirs", "opt.extdirs"), new JavacOption.XOption(OptionName.DJAVA_EXT_DIRS, str3, "opt.extdirs") {
            @Override
            public boolean process(Options options, String option, String arg) {
                return super.process(options, "-extdirs", arg);
            }
        }, new JavacOption.Option(OptionName.ENDORSEDDIRS, "opt.arg.dirs", "opt.endorseddirs"), new JavacOption.XOption(OptionName.DJAVA_ENDORSED_DIRS, str3, "opt.endorseddirs") {
            @Override
            public boolean process(Options options, String option, String arg) {
                return super.process(options, "-endorseddirs", arg);
            }
        }, new JavacOption.Option(OptionName.PROC, "opt.proc.none.only", JavacOption.ChoiceKind.ONEOF, "none", "only"), new JavacOption.Option(OptionName.PROCESSOR, "opt.arg.class.list", "opt.processor"), new JavacOption.Option(OptionName.PROCESSORPATH, "opt.arg.path", "opt.processorpath"), new JavacOption.Option(OptionName.D, "opt.arg.directory", "opt.d"), new JavacOption.Option(OptionName.S, "opt.arg.directory", "opt.sourceDest"), new JavacOption.Option(OptionName.IMPLICIT, "opt.implicit", JavacOption.ChoiceKind.ONEOF, "none", "class"), new JavacOption.Option(OptionName.ENCODING, "opt.arg.encoding", "opt.encoding"), new JavacOption.Option(OptionName.SOURCE, str4, "opt.source") {
            @Override
            public boolean process(Options options, String option, String operand) {
                Source source = Source.lookup(operand);
                if (source == null) {
                    helper.error("err.invalid.source", operand);
                    return true;
                }
                return super.process(options, option, operand);
            }
        }, new JavacOption.Option(OptionName.TARGET, str4, "opt.target") {
            @Override
            public boolean process(Options options, String option, String operand) {
                Target target = Target.lookup(operand);
                if (target == null) {
                    helper.error("err.invalid.target", operand);
                    return true;
                }
                return super.process(options, option, operand);
            }
        }, new JavacOption.Option(OptionName.VERSION, "opt.version") {
            @Override
            public boolean process(Options options, String option) {
                helper.printVersion();
                return super.process(options, option);
            }
        }, new JavacOption.HiddenOption(OptionName.FULLVERSION) {
            @Override
            public boolean process(Options options, String option) {
                helper.printFullVersion();
                return super.process(options, option);
            }
        }, new JavacOption.HiddenOption(OptionName.DIAGS) {
            @Override
            public boolean process(Options options, String option) {
                String diagsOption;
                JavacOption.Option xd = RecognizedOptions.getOptions(helper, EnumSet.of(OptionName.XD))[0];
                String option2 = option.substring(option.indexOf(61) + 1);
                if (option2.contains("%")) {
                    diagsOption = "-XDdiagsFormat=";
                } else {
                    diagsOption = "-XDdiags=";
                }
                String diagsOption2 = diagsOption + option2;
                if (xd.matches(diagsOption2)) {
                    return xd.process(options, diagsOption2);
                }
                return false;
            }
        }, new JavacOption.Option(OptionName.HELP, "opt.help") {
            @Override
            public boolean process(Options options, String option) {
                helper.printHelp();
                return super.process(options, option);
            }
        }, new JavacOption.Option(OptionName.A, "opt.arg.key.equals.value", "opt.A") {
            @Override
            String helpSynopsis() {
                this.hasSuffix = true;
                return super.helpSynopsis();
            }

            @Override
            public boolean matches(String arg) {
                return arg.startsWith("-A");
            }

            @Override
            public boolean hasArg() {
                return false;
            }

            @Override
            public boolean process(Options options, String option) {
                int argLength = option.length();
                if (argLength == 2) {
                    helper.error("err.empty.A.argument", new Object[0]);
                    return true;
                }
                int sepIndex = option.indexOf(61);
                String key = option.substring(2, sepIndex != -1 ? sepIndex : argLength);
                if (!JavacProcessingEnvironment.isValidOptionName(key)) {
                    helper.error("err.invalid.A.key", option);
                    return true;
                }
                return process(options, option, option);
            }
        }, new JavacOption.Option(OptionName.X, "opt.X") {
            @Override
            public boolean process(Options options, String option) {
                helper.printXhelp();
                return super.process(options, option);
            }
        }, new JavacOption.Option(OptionName.J, "opt.arg.flag", "opt.J") {
            @Override
            String helpSynopsis() {
                this.hasSuffix = true;
                return super.helpSynopsis();
            }

            @Override
            public boolean process(Options options, String option) {
                throw new AssertionError("the -J flag should be caught by the launcher.");
            }
        }, new JavacOption.HiddenOption(OptionName.MOREINFO) {
            @Override
            public boolean process(Options options, String option) {
                Type.moreInfo = true;
                return super.process(options, option);
            }
        }, new JavacOption.Option(OptionName.WERROR, "opt.Werror"), new JavacOption.HiddenOption(OptionName.COMPLEXINFERENCE), new JavacOption.HiddenOption(OptionName.PROMPT), new JavacOption.HiddenOption(OptionName.DOE), new JavacOption.HiddenOption(OptionName.PRINTSOURCE), new JavacOption.HiddenOption(OptionName.WARNUNCHECKED) {
            @Override
            public boolean process(Options options, String option) {
                options.m517put("-Xlint:unchecked", option);
                return false;
            }
        }, new JavacOption.XOption(OptionName.XMAXERRS, "opt.arg.number", "opt.maxerrs"), new JavacOption.XOption(OptionName.XMAXWARNS, "opt.arg.number", "opt.maxwarns"), new JavacOption.XOption(OptionName.XSTDOUT, str5, "opt.Xstdout") {
            @Override
            public boolean process(Options options, String option, String arg) {
                try {
                    helper.setOut(new PrintWriter((Writer) new FileWriter(arg), true));
                    return super.process(options, option, arg);
                } catch (IOException e) {
                    helper.error("err.error.writing.file", arg, e);
                    return true;
                }
            }
        }, new JavacOption.XOption(OptionName.XPRINT, "opt.print"), new JavacOption.XOption(OptionName.XPRINTROUNDS, "opt.printRounds"), new JavacOption.XOption(OptionName.XPRINTPROCESSORINFO, "opt.printProcessorInfo"), new JavacOption.XOption(OptionName.XPREFER, "opt.prefer", JavacOption.ChoiceKind.ONEOF, "source", "newer"), new JavacOption.XOption(OptionName.XPKGINFO, "opt.pkginfo", JavacOption.ChoiceKind.ONEOF, "always", "legacy", "nonempty"), new JavacOption.HiddenOption(OptionName.O), new JavacOption.HiddenOption(OptionName.XJCOV), new JavacOption.HiddenOption(OptionName.XD) {

            String f469s;

            @Override
            public boolean matches(String s) {
                this.f469s = s;
                return s.startsWith(this.name.optionName);
            }

            @Override
            public boolean process(Options options, String option) {
                String strSubstring = this.f469s.substring(this.name.optionName.length());
                this.f469s = strSubstring;
                int eq = strSubstring.indexOf(61);
                String key = this.f469s;
                if (eq >= 0) {
                    key = key.substring(0, eq);
                }
                String value = this.f469s;
                if (eq >= 0) {
                    value = value.substring(eq + 1);
                }
                options.m517put(key, value);
                return false;
            }
        }, new JavacOption.Option(OptionName.AT, str5, "opt.AT") {
            @Override
            String helpSynopsis() {
                this.hasSuffix = true;
                return super.helpSynopsis();
            }

            @Override
            public boolean process(Options options, String option) {
                throw new AssertionError("the @ flag should be caught by CommandLine.");
            }
        }, new JavacOption.HiddenOption(OptionName.SOURCEFILE) {

            String f470s;

            @Override
            public boolean matches(String s) {
                this.f470s = s;
                return s.endsWith(".java") || SourceVersion.isName(s);
            }

            @Override
            public boolean process(Options options, String option) {
                if (this.f470s.endsWith(".java")) {
                    File f = new File(this.f470s);
                    if (!f.exists()) {
                        helper.error("err.file.not.found", f);
                        return true;
                    }
                    if (!f.isFile()) {
                        helper.error("err.file.not.file", f);
                        return true;
                    }
                    helper.addFile(f);
                } else {
                    helper.addClassName(this.f470s);
                }
                return false;
            }
        }};
    }

    public enum PkgInfo {
        ALWAYS,
        LEGACY,
        NONEMPTY;

        public static PkgInfo m483get(Options options) {
            String v = options.m514get(OptionName.XPKGINFO);
            if (v == null) {
                return LEGACY;
            }
            return valueOf(v.toUpperCase());
        }
    }

    private static Map<String, Boolean> getXLintChoices() {
        Map<String, Boolean> choices = new LinkedHashMap<>();
        choices.put("all", false);
        for (Lint.LintCategory c : Lint.LintCategory.values()) {
            choices.put(c.option, Boolean.valueOf(c.hidden));
        }
        for (Lint.LintCategory c2 : Lint.LintCategory.values()) {
            choices.put("-" + c2.option, Boolean.valueOf(c2.hidden));
        }
        choices.put("none", false);
        return choices;
    }
}
