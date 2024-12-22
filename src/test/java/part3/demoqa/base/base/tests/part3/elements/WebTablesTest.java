package part3.demoqa.base.base.tests.part3.elements;

import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

import static org.testng.Assert.assertEquals;

public class WebTablesTest extends BaseTest {

    @Test
    public void  testWebTable(){

        String expectedAge="34";
        String email="kierra@example.com";

        var webTablePage= homePage.goToElements().clickWebTables();

        webTablePage.clickEdit(email);
        webTablePage.setAge("34");
        webTablePage.clickSubmitButton();
        String actualAge=webTablePage.getTableAge(email);


        assertEquals(actualAge,expectedAge, "\n Actual and Expected ages don't match \n");

    }
}
