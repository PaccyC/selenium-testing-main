package com.paccy.demoqa.pages;

import com.paccy.demoqa.pages.alerts_frames_windows.Alerts_Frames_WindowsPage;
import com.paccy.demoqa.pages.elements.ElementsPage;
import com.paccy.demoqa.pages.forms.FormsPage;
import com.paccy.base.BasePage;
import com.paccy.demoqa.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By formsCard= By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementsCard= By.xpath("//div[@id='app']//h5[text()='Elements']");

    private By widgetsCard=By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private By alertsFramesWindowsCard= By.xpath("//div[@id='app']//h5[contains(text(),'Alerts')]");

    public FormsPage gotoForms(){
        scrollToElementJS(formsCard);
        click(formsCard);
        return  new FormsPage();
    }

    public ElementsPage goToElements(){
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets(){
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }

    public Alerts_Frames_WindowsPage goToAlertsFramesWindows(){
        scrollToElementJS(alertsFramesWindowsCard);
        click(alertsFramesWindowsCard);
        return new Alerts_Frames_WindowsPage();
    }


}
