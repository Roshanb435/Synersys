package ecommerce;

public class User {

    private String name;
    private String password;
    private String email;
    private char gender;
    private long contact;

    public User(String name, String password, String email, char gender, long contact) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.contact = contact;
    }

    public String getName() { return name; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }
    public char getGender() { return gender; }
    public long getContact() { return contact; }
}
