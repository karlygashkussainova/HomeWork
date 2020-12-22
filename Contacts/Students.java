package Contacts;

public class Students {
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String major;

    public Students(String name, String lastName, String email, String phone, String major) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return getLastName();
    }
}
