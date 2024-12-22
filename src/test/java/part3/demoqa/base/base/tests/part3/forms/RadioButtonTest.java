package part3.demoqa.base.base.tests.part3.forms;

import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class RadioButtonTest extends BaseTest {


    @Test
    public void testRadioButton() {
        var formsPage= homePage.gotoForms().clickPracticeForm();
         formsPage.clickFemaleRadioButton();

         assertTrue(formsPage.isFemaleRadioButtonSelected());
    }
}
