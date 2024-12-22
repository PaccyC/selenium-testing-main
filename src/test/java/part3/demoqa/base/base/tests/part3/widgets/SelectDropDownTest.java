package part3.demoqa.base.base.tests.part3.widgets;

import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

import java.util.List;

import static org.testng.Assert.*;

public class SelectDropDownTest extends BaseTest {

    @Test
    public void testStandardMultiSelectDropDown(){
        var selectMenuPage=homePage.goToWidgets().clickSelectMenu();

        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1);
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.selectStandardMulti(2);

        selectMenuPage.deselectStandardMulti("saab");

        List<String> actualSelectedOptions= selectMenuPage.getAllSelectedStandardMultiOptions();

        assertTrue(actualSelectedOptions.contains("Volvo"));
        assertTrue(actualSelectedOptions.contains("Audi"));
        assertFalse(actualSelectedOptions.contains("Saab"));
        assertTrue(actualSelectedOptions.contains("Opel"));


    }
}
