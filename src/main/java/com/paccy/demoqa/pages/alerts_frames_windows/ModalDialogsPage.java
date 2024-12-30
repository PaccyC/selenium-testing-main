package com.paccy.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class ModalDialogsPage extends Alerts_Frames_WindowsPage{
   private final By smallDialogButton = By.id("showSmallModal");
   private final By smallModalText= By.xpath("//div[contains(text(),'small modal')]");
   private final By closeModalButton= By.id("closeSmallModal");


  public void clickSmallDialogButton(){
      click(smallDialogButton);
  }

  public String getSmallDialogText(){
     return find(smallModalText).getText();
  }

  public void clickCloseModalButton(){
      click(closeModalButton);
  }

}
