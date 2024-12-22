package part3.demoqa.base.base.tests.part3.widgets;

import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

import static org.testng.Assert.assertEquals;

public class DatesTest extends BaseTest {

    @Test
    public void testSelectDate(){
        String month= "December";
        String monthNumber= "12";
        String day="23";
        String year="2025";

        var datePickerPage=homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDateField();

        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDate(day);

        String actualDate= datePickerPage.getDate();
        String expectedDate=monthNumber + "/" + day +"/" +year;

        assertEquals(actualDate
                    ,expectedDate,
                    "\nActual date "+ actualDate + "Does not match expected date "+ expectedDate +"\n");

    }
}
