package testsuite;
/**
 * 4. Write down the following test into ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfully
 * * click on the ‘Forgot your password’ link
 * * Verify the text ‘Reset Password’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


public class ForgotPasswordTest extends BaseTest {
    //BaseUrl
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    //calling openBrowser method from parentclass BaseTest
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    //1. userShouldNavigateToForgotPasswordPageSuccessfully
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        //* * click on the ‘Forgot your password’ link
        driver.findElement(By.className("orangehrm-login-forgot")).click();


        //* * Verify the text ‘Reset Password’
        String expectedtext = "Reset Password";
        String actualtext = driver.findElement(By.xpath("//h6[text() = 'Reset Password']")).getText();
        Assert.assertEquals("User is not navigated to Reset Password' page", expectedtext, actualtext);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}

