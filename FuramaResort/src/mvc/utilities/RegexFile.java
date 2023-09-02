package mvc.utilities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFile {
    public static final String EMPLOYEE_ID_REGEX = "^NV-\\d{4}$";
    public static final String NAME_REGEX = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)+$";
    public static final String BIRTHDAY_REGEX = "^(0[1-9]|[12]\\d|3[01])[-|/](0[1-9]|1[012])[-|/](19|20)\\d{2}$";
    public static final String CITIZEN_ID_REGEX = "^(\\d{9}|\\d{12})$";
    public static final String PHONE_REGEX = "^0\\d{9}$";
    public static final String EMAIL_REGEX = "^\\w+\\w*@\\w+(\\.\\w+)$";
    public static final String GENDER_REGEX = "Female|Male|female|male";
    public static final String EDUCATION_LEVEL_REGEX = "Intermediate Degree|College Degree|Bachelor's Degree|Postgraduate Degree";
    public static final String POSITION_REGEX = "Receptionist|Waiter|Specialist|Supervisor|Manager|Director";
    public static final String CUSTOMER_ID_REGEX = "^KH-\\d{4}$";
    public static final String CUSTOMER_CLASS_REGEX = "Diamond|Platinum|Gold|Silver|Member";
    public static final String VILLA_ID_REGEX = "^SVVL-\\d{4}$";
    public static final String HOUSE_ID_REGEX = "^SVHO-\\d{4}$";
    public static final String ROOM_ID_REGEX = "^SVRO-\\d{4}$";
    public static final String SERVICE_NAME = "Villa|House|Room";

    private static Pattern pattern;

    private static Matcher matcher;

    public boolean validate(String string, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public boolean validateEmployeeId(String id) {
        if (!validate(id,EMPLOYEE_ID_REGEX)) {
            System.out.println("Invalid ID! Please enter the correct format of ID.");
        }
        return validate(id, EMPLOYEE_ID_REGEX);
    }

    public boolean validateCustomerId(String id) {
        if (!validate(id, CUSTOMER_ID_REGEX)) {
            System.out.println("Invalid ID! Please enter the correct format of ID.");
        }
        return validate(id, CUSTOMER_ID_REGEX);
    }

    public boolean validateName(String name) {
        if (!validate(name, NAME_REGEX)) {
            System.out.println("Invalid name! Please enter again.");
        }
        return validate(name, NAME_REGEX);
    }

    public boolean is18YearsOld(String dayOfBirth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(dayOfBirth, formatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears() >= 18;
    }

    public boolean validateDayOfBirth(String dayOfBirth) {
        if (!validate(dayOfBirth, BIRTHDAY_REGEX) || !is18YearsOld(dayOfBirth)) {
            if (!validate(dayOfBirth, BIRTHDAY_REGEX)) {
                System.out.println("Invalid day of birth! Please enter again.");
            } else {
                System.out.println("Age must be at least 18!");
            }
            return false;
        }
        return true;
    }

    public boolean validateGender(String gender) {
        if (!validate(gender, GENDER_REGEX)) {
            System.out.println("Invalid gender! Please enter again.");
        }
        return validate(gender, GENDER_REGEX);
    }

    public boolean validateCitizenID(String citizenID) {
        if (!validate(citizenID, CITIZEN_ID_REGEX)) {
            System.out.println("Invalid citizenID! Please enter again.");
        }
        return validate(citizenID, CITIZEN_ID_REGEX);
    }

    public boolean validatePhoneNumber(String phone) {
        if (!validate(phone, PHONE_REGEX)) {
            System.out.println("Invalid phoneNumber! Please enter again.");
        }
        return validate(phone, PHONE_REGEX);
    }

    public boolean validateEmail(String email) {
        if (!validate(email, EMAIL_REGEX)) {
            System.out.println("Invalid email! Please enter again.");
        }
        return validate(email, EMAIL_REGEX);
    }

    public boolean validateEducationLevel(String educationLevel) {
        if (!validate(educationLevel, EDUCATION_LEVEL_REGEX)) {
            System.out.println("Invalid educationLevel! Please enter again.");
        }
        return validate(educationLevel, EDUCATION_LEVEL_REGEX);
    }

    public boolean validatePosition(String position) {
        if (!validate(position, POSITION_REGEX)) {
            System.out.println("Invalid position! Please enter again.");
        }
        return validate(position, POSITION_REGEX);
    }

    public boolean validateCustomerCLass(String type) {
        if (!validate(type, CUSTOMER_CLASS_REGEX)) {
            System.out.println("Invalid type! Please enter again.");
        }
        return validate(type, CUSTOMER_CLASS_REGEX);
    }

    public boolean validateVilla(String villa) {
        if (!validate(villa, VILLA_ID_REGEX)) {
            System.out.println("Invalid Villa Id! Please enter again.");
        }
        return validate(villa, VILLA_ID_REGEX);
    }

    public boolean validateHouse(String house) {
        if (!validate(house, HOUSE_ID_REGEX)) {
            System.out.println("Invalid House Id! Please enter again.");
        }
        return validate(house, HOUSE_ID_REGEX);
    }

    public boolean validateRoom(String room) {
        if (!validate(room, ROOM_ID_REGEX)) {
            System.out.println("Invalid Room Id! Please enter again.");
        }
        return validate(room, ROOM_ID_REGEX);
    }

    public boolean validateServiceName(String service) {
        if (!validate(service, SERVICE_NAME)) {
            System.out.println("Invalid service name! Please enter again.");
        }
        return validate(service, SERVICE_NAME);
    }
}
