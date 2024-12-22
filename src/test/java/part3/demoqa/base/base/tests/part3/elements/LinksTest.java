package part3.demoqa.base.base.tests.part3.elements;

import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

import static org.testng.Assert.*;

public class LinksTest extends BaseTest {

    @Test
    public void testLinks(){
        var linksPage= homePage.goToElements().clickLinks();
        linksPage.clickBadRequestLink();

        String actualResponse= linksPage.getLinkResponse();

        assertTrue(
                actualResponse.contains("400") && actualResponse.contains("Bad Request"),
                "\n Actual Response ("+ actualResponse +") \n does not contain Bad Request and 400 \n");
    }
}
