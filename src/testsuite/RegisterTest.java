package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        //open the browser
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //Find the register elements
        //click on the ‘Register’ link
        WebElement RegisterLink = driver.findElement(By.linkText("Register"));
        RegisterLink.click();

        //this is from documents
        String expectedRegisterLink = "Register";
        //find the welcome text element and get the text
        WebElement actualRegisterElement = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualRegisterLink = actualRegisterElement.getText();

        //Verify the text ‘Register’ with assert
        Assert.assertEquals(expectedRegisterLink,actualRegisterLink);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //Find the register elements
        //click on the ‘Register’ link
        WebElement RegisterLink = driver.findElement(By.linkText("Register"));
        RegisterLink.click();
        //Select gender radio button
        WebElement genderRadioButton = driver.findElement(By.id("gender-female"));
        genderRadioButton.click();
        //Enter First name with name
        WebElement FirstName = driver.findElement(By.name("FirstName"));
        FirstName.sendKeys("Megha");
        //Enter last name with css selector
        WebElement lastName = driver.findElement(By.cssSelector("input#LastName"));
        lastName.sendKeys("Jadvani");
        //Select Date of birth using select class
        Select dayOfBirth = new Select(driver.findElement(By.name("DateOfBirthDay")));
        dayOfBirth.selectByValue("26");
        //Select month of birth using select class
        Select monthOfBirth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        monthOfBirth.selectByValue("7");
        //Select year of birth using select class
        Select yearOfBirth = new Select(driver.findElement(By.name("DateOfBirthYear")));
        yearOfBirth.selectByValue("1998");
        // Enter Email address using xpath
        WebElement emailAddress = driver.findElement(By.xpath("//input[@id='Email']"));
        emailAddress.sendKeys("djadvani12345@gmail.com");
        //Enter Password using id
        WebElement passwordFeild = driver.findElement(By.id("Password"));
        passwordFeild.sendKeys("megha1234");

        //Enter confirm Password using id
        WebElement confirmPasswordFeild = driver.findElement(By.id("ConfirmPassword"));
        confirmPasswordFeild.sendKeys("megha1234");

        //Click on REGISTER button
        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();

        String expectedRegister = "Your registration completed";
        WebElement actualregisterElement = driver.findElement(By.cssSelector("div.result"));
        String actualregister = actualregisterElement.getText();
        //variable actual and expected message
        Assert.assertEquals("not successfully registration",expectedRegister,actualregister);
    }


    @After
    public void clearBrowser(){
        //close the browser
       closeBrowser();
    }
}
