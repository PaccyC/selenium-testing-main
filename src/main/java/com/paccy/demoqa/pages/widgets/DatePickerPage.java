package com.paccy.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.DropDownUtility.selectByVisibleText;

public class DatePickerPage extends WidgetsPage{

    private final By selectDateField=By.id("datePickerMonthYearInput");
    private final By monthDropDown=By.className("react-datepicker__month-select");
    private final By yearDropDown=By.cssSelector(".react-datepicker__year-select");


    private By dayValue(String day){
        return By.xpath("//div[contains(@class,'eact-datepicker__day react-datepicker__day--')][text()='"+ day +"']");
    }

    public void clickDate(String date){
        click(dayValue(date));
    }

    public boolean isDayInMonth(String day){
        return find(dayValue(day)).isDisplayed();
    }
    public void clickSelectDateField(){
        click(selectDateField);
    }

    public String getDate(){
        return find(selectDateField).getAttribute("value");
    }

    public void selectMonth(String month){
        selectByVisibleText(monthDropDown,month);
    }

    public void selectYear(String year){
        selectByVisibleText(yearDropDown,year);
    }
}
