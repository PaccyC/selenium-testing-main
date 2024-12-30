package part3.demoqa.base.base.tests.part4.alerts;

import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

import static org.testng.Assert.*;
import static utilities.SwitchToUtility.acceptAlert;
import static utilities.SwitchToUtility.getAlertText;

public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlerts(){
        var alertsPage= homePage.goToAlertsFramesWindows().clickAlertsMenuItem();
        alertsPage.clickAlertButton();

        String expectedAlertText="You clicked a button";
        assertEquals(getAlertText(),expectedAlertText);
        acceptAlert();
        alertsPage.clickAlertButton();
    }
}
