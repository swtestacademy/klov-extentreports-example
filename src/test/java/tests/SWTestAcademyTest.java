package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class SWTestAcademyTest extends BaseTest {

    HomePage hPage;

    @BeforeClass
    public void beforeClass(){

        hPage = new HomePage(driver,wait);
    }

    @Test (priority = 1)
    public void test_menuTestAutomation (){

        hPage.checkTestAutomationLink();

    }

    @Test (priority = 2)
    public void test_menuPerformanceTest ()  {
        hPage.checkPerformanceTestingLink();
    }

    @Test (priority = 3)
    public void test_menuDevops  () {
        hPage.checkDevOpsLink();

    }

    @Test (priority = 4)
    public void test_menuFrameworks ()  {
        hPage.checkFrameworksLink();

    }

}
