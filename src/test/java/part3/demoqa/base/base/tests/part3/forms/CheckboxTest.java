package part3.demoqa.base.base.tests.part3.forms;

import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

import static org.testng.Assert.*;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckbox() {
        var formsPage= homePage.gotoForms().clickPracticeForm();
        formsPage.clickReadingCheckbox();
        formsPage.clickSportsCheckbox();
        formsPage.clickMusicCheckbox();


        formsPage.unClickReadingCheckbox();

        boolean isReadingCheckBoxSelected= formsPage.isReadingCheckboxSelected();
        assertFalse(isReadingCheckBoxSelected);

    }
}
