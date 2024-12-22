package com.paccy.demoqa.pages;

import com.paccy.demoqa.pages.elements.ElementsPage;
import com.paccy.demoqa.pages.forms.FormsPage;
import com.paccy.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By formsCard= By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementsCard= By.xpath("//div[@id='app']//h5[text()='Elements']");

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


}
