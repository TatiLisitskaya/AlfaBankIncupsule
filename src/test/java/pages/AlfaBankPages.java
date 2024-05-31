package pages;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AlfaBankPages {
    public void openPageDepositeForm() {
        String baseUrl = "https://alfabank.ru/";
        open(baseUrl);
        $(byText("Вклады")).click();
        $(byLinkText("Альфа-Счёт")).click();
        $(byName("fullName")).click();
    }
}