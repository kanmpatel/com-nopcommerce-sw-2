package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //this os form requirement
        String expectedMessage = "Welcome, Please Sign In!";
        //find the welcome text element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//div[@class='page-title']"));

        String actualMessage = actualMessageElement.getText();
        //variable actual and expected message
        Assert.assertEquals("not navigate to login page",expectedMessage,actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //find the element of email and send the email key
        WebElement EmailElement = driver.findElement(By.xpath("//input[@id='Email']"));
        EmailElement.sendKeys("megha1235@gmail.com");
        //find the element of password and send the password key
        WebElement passwordElement = driver.findElement(By.id("Password"));
        passwordElement.sendKeys("megha12345");
        //click on loging button using elements
        WebElement login = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        login.click();
        //this os form requirement
        String expectedLogOutText = "Log out";
        //find the welcome text element and get the text
        String actualLogOutText = driver.findElement(By.linkText("Log out")).getText();
        //Verify the text error message with assert
        Assert.assertEquals(expectedLogOutText,actualLogOutText);
    }

    @Test
    public void verifyTheErrorMessage(){
        //find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //find the element of email and send the email key
        WebElement EmailElement = driver.findElement(By.xpath("//input[@id='Email']"));
        EmailElement.sendKeys("prime@gmail.com");
        //find the element of password and send the password key
        WebElement passwordElement = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordElement.sendKeys("prime123");
        //click on loging button using elements
        WebElement login = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        login.click();
        //this os form requirement
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        //find the welcome text element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        //Verify the text error message with assert
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

    }

    @After
    public void tearDown(){
        //closeBrowser();
    }


}
