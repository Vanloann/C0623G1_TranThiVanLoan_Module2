package ss19_String_Regex.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private static final String CLASS_REGEX = "^[CAP]\\d{4}[GHIK]$";
    private static Pattern pattern;
    private static Matcher matcher;

    public boolean validateClass(String regex) {
        pattern = Pattern.compile(CLASS_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
