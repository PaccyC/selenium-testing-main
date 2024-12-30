package part3.demoqa.base.base.tests.part4.screenshots;

import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

public class CaptureFailedScreenshotTest extends BaseTest {


    @Test
    public  void testClickSubmitButtonWithoutJavaScriptExecutor(){
        var practiceFormPage= homePage.gotoForms().clickPracticeForm();

        practiceFormPage.clickSubmitButton();
    }
}
