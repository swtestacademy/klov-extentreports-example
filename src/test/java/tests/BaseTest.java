package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.KlovReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public static WebDriver driver;
    public WebDriverWait wait;
    public static ExtentReports extentReports;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setup () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.swtestacademy.com");
        KlovReporter klovReporter = new KlovReporter();

        klovReporter.initMongoDbConnection("localhost", 27017);

        klovReporter.setProjectName("SWTESTACADEMY");

        klovReporter.setReportName("1.4");

        klovReporter.setKlovUrl("http://localhost");

        extentReports = new ExtentReports();
        extentReports.attachReporter(klovReporter);
    }

    @AfterClass
    public void teardown () {
        //driver.quit();
        extentReports.flush();
    }

}
