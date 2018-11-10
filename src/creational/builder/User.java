package creational.builder;

import java.util.Date;

public class User {

    private String firstname;

    private String lastName;

    private String address;

    private Date birthDay;

    public User(String firstname, String lastName, String address, Date birthDay) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.address = address;
        this.birthDay = birthDay;
    }

    public String getFirstname() {
        return firstname;
    }

    private void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    private void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public static UserBuilder getUserBuilder(){
        return new UserBuilder();
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }

    public static class UserBuilder{

        private String firstname;

        private String lastname;

        private String address;

        private Date birthday;

        private User user;

        public UserBuilder withFirstname(String firstname){
            this.firstname = firstname;
            return this;
        }

        public UserBuilder withLastname(String lastname){
            this.lastname = lastname;
            return this;
        }

        public UserBuilder withAddress(String address){
            this.address = address;
            return this;
        }

        public UserBuilder withBirthday(Date birthday){
            this.birthday = birthday;
            return this;
        }

        public User build(){
            User user = new User(firstname, lastname, address, birthday);
            return user;
        }
    }
}
