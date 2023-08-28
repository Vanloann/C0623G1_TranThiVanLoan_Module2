package mvc.utilities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFile {
    public static final String EMPLOYEE_ID_REGEX = "^((NV-0)\\d{4}$";
    public static final String NAME_REGEX = "^[A-Z][a-z ]+\\s[A-Z][a-z ]+$";
    private static Pattern pattern;

    private static Matcher matcher;

    public boolean validate(String string, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public boolean validateEmployeeId(String id) {
        if (!validate(id,EMPLOYEE_ID_REGEX)) {
            System.out.println("Invalid ID!");
        }
        return validate(id, EMPLOYEE_ID_REGEX);
    }

    public boolean validateName(String name) {
        if (!validate(name, NAME_REGEX)) {
            System.out.println("Invalid name!");
        }
        return validate(name, NAME_REGEX);
    }

    public boolean is18YearsOld(String dayOfBirth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        LocalDate birthDate = LocalDate.parse(dayOfBirth, formatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears() >= 18;
    }

    public boolean validateDayOfBirth(String birthday) {

    }

    public boolean validateGender(String gender) {}

    public boolean validateCitizenID(String citizenID) {}

    public boolean validatePhoneNumber(String phone) {}

    public boolean validateEmail(String email) {}

    public boolean validateEducationLevel(String educationLevel) {}

    public boolean validatePosition(String position) {}


}
