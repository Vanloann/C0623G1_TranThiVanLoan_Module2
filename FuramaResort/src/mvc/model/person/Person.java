package mvc.model.person;

public abstract class Person {
    private int id;
    private String name;
    private String dayOfBirth;
    private String gender;
    private int citizenID;
    private int phoneNumber;
    private String email;

    public Person() {}

   public Person(int id, String name, String dayOfBirth, String gender,
                 int citizenID, int phoneNumber, String email) {
      this.id = id;
      this.name = name;
      this.dayOfBirth = dayOfBirth;
      this.gender = gender;
      this.citizenID = citizenID;
      this.phoneNumber = phoneNumber;
      this.email = email;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
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

   public int getCitizenID() {
      return citizenID;
   }

   public void setCitizenID(int citizenID) {
      this.citizenID = citizenID;
   }

   public int getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(int phoneNumber) {
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
              ", Name: '" + name + '\'' +
              ", DayOfBirth:'" + dayOfBirth + '\'' +
              ", Gender: '" + gender + '\'' +
              ", CitizenID: " + citizenID +
              ", PhoneNumber: " + phoneNumber +
              ", Email: '" + email + '\'';
   }
}
