package com.paccy.demoqa.pages.widgets;

import com.paccy.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {

    private final By selectMenuItem=By.xpath("//li[@id='item-8']/span[text()='Select Menu']");
    private final By dataPickerMenuItem= By.xpath("//li[@id='item-2']/span[text()='Date Picker']");


    public SelectMenuPage clickSelectMenu(){
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);

        return new SelectMenuPage();
    }

    public DatePickerPage clickDatePicker(){
        scrollToElementJS(dataPickerMenuItem);
        click(dataPickerMenuItem);

        return  new DatePickerPage();
    }
}
