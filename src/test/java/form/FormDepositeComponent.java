package form;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FormDepositeComponent {
    public void formDepositeComponent() {

        $("#alfa #form").shouldHave(appear);
        $("[value='Ганс']").shouldBe(visible);
        $("[value='Христиан']").shouldBe(visible);
        $("[value='Андерсон']").shouldBe(visible);
        $(byText("Мужской")).click();

        $("[data-test-id=button]").click();
        $("[data-test-id=sms-confirmation-modal]").shouldHave(appear);
        $("[data-test-id=sms-confirmation-modal]")
                .shouldHave(text("Введите код из смс"),
                        text("+7 (903) 272-79-70"));
    }
}

