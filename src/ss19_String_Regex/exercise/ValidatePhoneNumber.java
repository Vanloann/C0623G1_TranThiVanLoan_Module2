package ss19_String_Regex.exercise;

public class ValidatePhoneNumber {
    private static PhoneNumber phoneNumber;
    public static final String[] valid = new String[] {"(84)-(0978489648)"};

    public static final String[] invalid = new String[] {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String phone : valid) {
            boolean isvalid = phoneNumber.validatePhone(phone);
            System.out.println("PhoneNumber " + phone + " is valid: " + isvalid);
        }
        for (String phone : invalid) {
            boolean isvalid = phoneNumber.validatePhone(phone);
            System.out.println("PhoneNumber " + phone + " is valid: " + isvalid);
        }
    }
}
