package components;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;


public class AnketaDepositeComponent {
/*
    Faker faker = new Faker(new Locale("ru"));
    String lastName = faker.name().lastName(),
    //            firstName = faker.name().firstName(),
//            middleName = faker.name().nameWithMiddle(),
    fullName = faker.name().lastName() + " " + faker.name().firstName() + " " +
            "Вич";

    Date birthDay = faker.date().birthday();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String birthdayString = formatter.format(birthDay);
*/


    public void anketaDepositeComponent() {
        $(byName("fullName")).setValue("Ганс Христиан Андерсон");
        $(byName("passportBirthDateField")).setValue("01.01.1990");
        $(byName("phone")).setValue("9032727970");
        $(byName("email")).setValue("gans@mail.ru");
    }
}