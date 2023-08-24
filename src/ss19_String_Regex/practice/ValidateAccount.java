package ss19_String_Regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private static AccountExample accountExample;
    public static final String[] validAccount = new String[] {"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[] {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validateAccount(account);
            System.out.println("Account is " + account + "is valid: " + isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = accountExample.validateAccount(account);
            System.out.println("Account is " + account + "is valid: " + isvalid);
        }
    }
}
