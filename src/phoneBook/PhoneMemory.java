package phoneBook;

public class PhoneMemory {
    private String name;
    private String phoneNumber;
    public PhoneMemory(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String findContactByName(String name) {
        if(name.equals(this.name)) return phoneNumber;
        return null;
    }

//    public String getContactNumber() {
//        return phoneNumber;
//    }

    public String findContactByPhoneNumber(String phoneNumber) {
        if(phoneNumber.equals(this.phoneNumber)) return name;
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneMemory{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
