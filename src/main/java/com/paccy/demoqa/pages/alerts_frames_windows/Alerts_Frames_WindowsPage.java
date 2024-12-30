package com.paccy.demoqa.pages.alerts_frames_windows;

import com.paccy.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class Alerts_Frames_WindowsPage extends HomePage {
    private final By modalDialogsMenuItem= By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");
    private final By alertsMenuItem= By.xpath("//li[@id='item-1']/span[text()='Alerts']");

//    TransitionMethods

    public AlertsPage clickAlertsMenuItem(){
        click(alertsMenuItem);
        return new AlertsPage();
    }

    public ModalDialogsPage clickModalDialogs(){
        click(modalDialogsMenuItem);

        return new ModalDialogsPage();
    }

}
