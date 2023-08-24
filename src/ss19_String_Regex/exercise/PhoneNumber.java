package ss19_String_Regex.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)-\\(0(\\d{9})\\)$";
    private static Pattern pattern;
    private static Matcher matcher;

    public boolean validatePhone(String regex) {
        pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
