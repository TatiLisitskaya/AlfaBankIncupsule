import change.PhoneNumberChange;
import components.AnketaDepositeComponent;
import form.FormDepositeComponent;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.AlfaBankPages;
import tests.AlfaBankBase;


public class AlfaBankTest extends AlfaBankBase {

    private final AlfaBankPages alfaBankPages = new AlfaBankPages();
    private final AnketaDepositeComponent anketaDepositeComponent = new AnketaDepositeComponent();
    private final FormDepositeComponent formDepositeComponent = new FormDepositeComponent();
    private final PhoneNumberChange phoneNumberChange = new PhoneNumberChange();

    @Test
    @DisplayName("Заполнение формы депозита")
    void testAlfa() {
        alfaBankPages.openPageDepositeForm();
        anketaDepositeComponent.anketaDepositeComponent();
        formDepositeComponent.formDepositeComponent();
        phoneNumberChange.phoneNumberChange();
    }
}
