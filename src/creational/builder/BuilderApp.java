package creational.builder;

import java.time.Instant;
import java.util.Date;

public class BuilderApp {

    public static void main(String[] args) {
        Address address = Address.getAddressBuilder().withNo("5/1").withStreet("7th Street").withDistrict("Bakirkoy")
                .withCity("Istanbul").withPostalCode("34879").build();
        User user = User.getUserBuilder().withFirstname("ali turgut").withLastname("bozkurt")
                .withAddress(address.toString()).withBirthday(new Date()).build();

        System.out.println(user.toString());
    }
}
