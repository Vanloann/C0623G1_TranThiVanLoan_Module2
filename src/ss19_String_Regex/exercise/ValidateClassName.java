package ss19_String_Regex.exercise;

public class ValidateClassName {
    private static ClassExample classExample;

    public static final String[] valid = new String[] {"C0223G", "A0323K"};

    public static final String[] invalid = new String[] {"M0318G", "P0323A"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String clazz : valid) {
            boolean isvalid = classExample.validateClass(clazz);
            System.out.println("ClassName " + clazz + " is valid: " + isvalid);
        }
        for (String clazz : invalid) {
            boolean isvalid = classExample.validateClass(clazz);
            System.out.println("ClassName " + clazz + " is valid: " + isvalid);
        }
    }


}
