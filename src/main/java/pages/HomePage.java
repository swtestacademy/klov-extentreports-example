package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage extends BasePage {

    //*********Constructor*********
    public HomePage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Page Variables*********
    String baseURL = "http://www.swtestacademy.com/";



    //Go to Homepage
    public void goToMainPage (){
        driver.get(baseURL);
    }

    public void checkTestAutomationLink (){

        Assert.assertEquals(getText(By.xpath("//ul[@id='menu-main']/li[3]//span[@class='menu-text']")),"Test Automation");

    }

    public void checkPerformanceTestingLink (){

        Assert.assertEquals(getText(By.xpath("//ul[@id='menu-main']/li[4]//span[@class='menu-text']")),"Performance Testing");

    }


    public void checkFrameworksLink (){

        Assert.assertEquals(getText(By.xpath("//ul[@id='menu-main']/li[5]//span[@class='menu-text']")),"Frameworks");

    }

    public void checkDevOpsLink (){

        Assert.assertEquals(getText(By.xpath("//ul[@id='menu-main']/li[6]//span[@class='menu-text']")),"Devopss");

    }


}
