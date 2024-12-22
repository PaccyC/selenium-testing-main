package com.paccy.demoqa.pages.forms;

import com.paccy.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {

    private final By practiceFormMenu= By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    public  PracticeFormPage clickPracticeForm(){
        scrollToElementJS(practiceFormMenu);
        click(practiceFormMenu);

        return  new PracticeFormPage();
    }
}
