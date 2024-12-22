package com.paccy.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class LinksPage extends ElementsPage{

    private By badRequestLink= By.id("bad-request");
    private By linkResponse= By.id("linkResponse");

    public void clickBadRequestLink() {
        scrollToElementJS(badRequestLink);
        click(badRequestLink);
    }

    public String getLinkResponse() {
        delay(2000);
        return find(linkResponse).getText();
    }

}
