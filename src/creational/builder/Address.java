package creational.builder;

import java.util.Date;

public class Address {

    private String no;

    private String street;

    private String distrcit;

    private String city;

    private String postalCode;

    public Address(String no, String street, String distrcit, String city, String postalCode) {
        this.no = no;
        this.street = street;
        this.distrcit = distrcit;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getStreet() {
        return street;
    }

    private void setStreet(String street) {
        this.street = street;
    }

    public String getDistrcit() {
        return distrcit;
    }

    private void setDistrcit(String distrcit) {
        this.distrcit = distrcit;
    }

    public String getCity() {
        return city;
    }

    private void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    private void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public static AddressBuilder getAddressBuilder(){
        return new AddressBuilder();
    }

    @Override
    public String toString() {
        return "Address{" +
                "no='" + no + '\'' +
                ", street='" + street + '\'' +
                ", distrcit='" + distrcit + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static class AddressBuilder{

        private String no;

        private String street;

        private String district;

        private String city;

        private String postalCode;

        public AddressBuilder withNo(String no){
            this.no = no;
            return this;
        }

        public AddressBuilder withStreet(String street){
            this.street = street;
            return this;
        }

        public AddressBuilder withDistrict(String district){
            this.district = district;
            return this;
        }

        public AddressBuilder withCity(String city){
            this.city = city;
            return this;
        }

        public AddressBuilder withPostalCode(String postalCode){
            this.postalCode = postalCode;
            return this;
        }

        public Address build(){
            Address address = new Address(no,street,district,city,postalCode);
            return address;
        }
    }
}
