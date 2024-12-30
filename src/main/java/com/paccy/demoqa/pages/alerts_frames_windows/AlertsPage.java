package com.paccy.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class AlertsPage extends Alerts_Frames_WindowsPage{
    private final By alertButton= By.id("alertButton");

    public void clickAlertButton(){
        click(alertButton);
    }
}
