package com.paccy.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends  FormsPage{


    private final By femaleRadioButton= By.id("gender-radio-2");
    private final By sportsHobbyCheckbox= By.id("hobbies-checkbox-1");
    private final By readingHobbyCheckbox= By.id("hobbies-checkbox-2");
    private final By musicHobbyCheckbox= By.id("hobbies-checkbox-3");
    private final  By submitButton= By.id("submit");


    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleRadioButtonSelected() {
        return  find(femaleRadioButton).isSelected();
    }

    public void  clickSportsCheckbox(){
        if (!find(sportsHobbyCheckbox).isSelected()){
            scrollToElementJS(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
        }
    }
    public void  clickReadingCheckbox(){
        if (!find(readingHobbyCheckbox).isSelected()){
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }
    public void  clickMusicCheckbox(){
        if (!find(musicHobbyCheckbox).isSelected()){
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }

    public void  unClickSportsCheckbox(){
        if (find(sportsHobbyCheckbox).isSelected()){
            scrollToElementJS(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
        }
    }
    public void  unClickReadingCheckbox(){
        if (find(readingHobbyCheckbox).isSelected()){
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public void  unClickMusicCheckbox(){
        if (find(musicHobbyCheckbox).isSelected()){
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }


    }



    public boolean isReadingCheckboxSelected(){
        return find(readingHobbyCheckbox).isSelected();
    }


    public void clickSubmitButton(){
        click(submitButton);
    }




}
