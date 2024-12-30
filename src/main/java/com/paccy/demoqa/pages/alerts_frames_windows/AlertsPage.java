package com.paccy.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class AlertsPage extends Alerts_Frames_WindowsPage{
    private final By informationalertButton= By.id("alertButton");
    private final By confirmationAlertButton= By.id("confirmButton");
    private final By confirmationResult= By.id("confirmResult");

    public void clickAlertButton(){
        click(informationalertButton);
    }


    public void  clickConfirmationAlertButton(){
        click(confirmationAlertButton);
    }

    public String getConfirmationResult(){
        return  find(confirmationResult).getText();
    }


}
