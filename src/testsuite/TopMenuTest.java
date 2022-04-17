package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        //open the browser
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //Find the Computers elements
        //click on the ‘Computers’ link
        WebElement computerLink = driver.findElement(By.linkText("Computers"));
        computerLink.click();

        //this is from documents
        String expectedComputersLink = "Computers";
        //find the welcome text element and get the text
        WebElement actualComputersElement = driver.findElement(By.cssSelector("div.page-title"));
        String actualComputersLink = actualComputersElement.getText();

        //Verify the text ‘Computers’ with assert
        Assert.assertEquals("not open the Computer page",expectedComputersLink,actualComputersLink);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //Find the Electronics elements
        //click on the ‘Electronics’ link
        WebElement ElectronicsLink = driver.findElement(By.linkText("Electronics"));
        ElectronicsLink.click();

        //this is from documents
        String expectedElectronicsLink = "Electronics";
        //find the welcome text element and get the text
        WebElement actualElectronicsElement = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualElectronicsLink = actualElectronicsElement.getText();

        //Verify the text ‘Electronics’ with assert
        Assert.assertEquals("not open the Computer page",expectedElectronicsLink,actualElectronicsLink);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //Find the Apparel elements
        //click on the ‘Apparel’ link
        WebElement ApparelLink = driver.findElement(By.linkText("Apparel"));
        ApparelLink.click();

        //this is from documents
        String expectedApparelLink = "Apparel";
        //find the welcome text element and get the text
        WebElement actualApparelElement = driver.findElement(By.className("page-title"));
        String actualApparelLink = actualApparelElement.getText();

        //Verify the text ‘Apparel’ with assert
        Assert.assertEquals("not open the Computer page",expectedApparelLink,actualApparelLink);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //Find the Digital downloads elements
        //click on the ‘DigitalDownloads’ link
        WebElement DigitalDownloadsLink = driver.findElement(By.linkText("Digital downloads"));
        DigitalDownloadsLink.click();

        //this is from documents
        String expectedDigitalDownloadsLink = "Digital downloads";
        //find the welcome text element and get the text
        WebElement actualDigitalDownloadsElement = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualDigitalDownloadsLink = actualDigitalDownloadsElement.getText();

        //Verify the text ‘Digital downloads’ with assert
        Assert.assertEquals("not open the Computer page",expectedDigitalDownloadsLink,actualDigitalDownloadsLink);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //Find the Books elements
        //click on the ‘Books’ link
        WebElement BooksLink = driver.findElement(By.linkText("Books"));
        BooksLink.click();

        //this is from documents
        String expectedBooksLink = "Books";
        //find the welcome text element and get the text
        WebElement actualBooksElement = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualBooksLink = actualBooksElement.getText();

        //Verify the text ‘Books’ with assert
        Assert.assertEquals("not open the Computer page",expectedBooksLink,actualBooksLink);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //Find the Jewelry elements
        //click on the ‘Jewelry’ link
        WebElement JewelryLink = driver.findElement(By.linkText("Jewelry"));
        JewelryLink.click();

        //this is from documents
        String expectedJewelrysLink = "Jewelry";
        //find the welcome text element and get the text
        WebElement actualJewelryElement = driver.findElement(By.cssSelector("div.page-title"));
        String actualJewelryLink = actualJewelryElement.getText();

        //Verify the text ‘Jewelry’ with assert
        Assert.assertEquals("not open the Computer page",expectedJewelrysLink,actualJewelryLink);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //Find the Gift Cards elements
        //click on the ‘Gift Cards’ link
        WebElement GiftCardsLink = driver.findElement(By.linkText("Gift Cards"));
        GiftCardsLink.click();

        //this is from documents
        String expectedGiftCardsLink = "Gift Cards";
        //find the welcome text element and get the text
        WebElement actualGiftCardsElement = driver.findElement(By.cssSelector("div.page-title"));
        String actualGiftCardsLink = actualGiftCardsElement.getText();

        //Verify the text ‘Gift Cards’ with assert
        Assert.assertEquals("not open the Computer page",expectedGiftCardsLink,actualGiftCardsLink);
    }

    @After
    public void clearBrowser(){
        //close the browser
      // closeBrowser();
    }
}
