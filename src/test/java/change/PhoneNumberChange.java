package change;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class PhoneNumberChange {
    public void phoneNumberChange() {
        $(".phone-changer-section .button__component_lushu:last-child").click();
        $(".phone-changer-section")
                .shouldHave(text("Введите новый номер"));
        $("[class=\"input__input_1wouz input__input_12sr2\"]").shouldHave(appear);
        $("[class=\"input__input_1wouz input__input_12sr2\"]")
                .setValue("9032728080");
    }
}