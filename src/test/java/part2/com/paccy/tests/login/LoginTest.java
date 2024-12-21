package part2.com.paccy.tests.login;

import org.testng.annotations.Test;
import part2.com.paccy.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {


    @Test
    public void testLoginErrorMessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret");


        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();

        assertTrue(actualMessage.contains("Epic sadface"));
    }
}
