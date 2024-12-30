package part3.demoqa.base.base.tests.part4.alerts;

import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

import static org.testng.Assert.*;
import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {


    public void testInformationAlerts(){
        var alertsPage= homePage.goToAlertsFramesWindows().clickAlertsMenuItem();
        alertsPage.clickAlertButton();

        String expectedAlertText="You clicked a button";
        assertEquals(getAlertText(),expectedAlertText);
        acceptAlert();
        alertsPage.clickAlertButton();
    }


    public void testConfirmationAlerts(){
        var alertsPage= homePage.goToAlertsFramesWindows().clickAlertsMenuItem();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();

        String expectConfirmationText= alertsPage.getConfirmationResult();
        String actualConfirmationText="You selected Cancel";
        assertEquals(expectConfirmationText,actualConfirmationText,"\n You did not select Cancel\n");
    }

    public void testPromptAlerts(){

        String alertText= "Selenium";
        var alertsPage= homePage.goToAlertsFramesWindows().clickAlertsMenuItem();
        alertsPage.clickPromptAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualText=alertsPage.getPromptResultText();
        String expectedText= "You entered "+ alertText;

        assertEquals(actualText,expectedText);
    }


}
