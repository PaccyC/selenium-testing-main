package part3.demoqa.base.base.tests.part4.modals;

import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class ModalTest extends BaseTest {

    @Test
    public void testModal(){
        var modalDialogsPage= homePage.goToAlertsFramesWindows().clickModalDialogs();

        modalDialogsPage.clickSmallDialogButton();
        String actualText= modalDialogsPage.getSmallDialogText();

        assertTrue(actualText.contains("small modal"));
        modalDialogsPage.clickCloseModalButton();
    }
}
