package mvc.model.person;

import java.io.Serializable;
import java.util.regex.Pattern;

public abstract class Person {
    private String id;
    private String name;
    private String dayOfBirth;
    private String gender;
    private String citizenID;
    private String phoneNumber;
    private String email;

    public Person() {}

   public Person(String id, String name, String dayOfBirth, String gender,
                 String citizenID, String phoneNumber, String email) {
      this.id = id;
      this.name = name;
      this.dayOfBirth = dayOfBirth;
      this.gender = gender;
      this.citizenID = citizenID;
      this.phoneNumber = phoneNumber;
      this.email = email;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDayOfBirth() {
      return dayOfBirth;
   }

   public void setDayOfBirth(String dayOfBirth) {
      this.dayOfBirth = dayOfBirth;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   public String getCitizenID() {
      return citizenID;
   }

   public void setCitizenID(String citizenID) {
      this.citizenID = citizenID;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
       this.phoneNumber = phoneNumber;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   @Override
   public String toString() {
      return  "Id: " + id +
              " | Name: " + name  +
              " | DayOfBirth: " + dayOfBirth +
              " | Gender: " + gender +
              " | CitizenID: " + citizenID +
              " | PhoneNumber: " + phoneNumber +
              " | Email: " + email;
   }
}
