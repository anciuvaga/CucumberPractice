package hooks;


import io.cucumber.java.*;

public class AmazonHooks {

//    @Before("@Smoke")
//    public void setupBrowserCheckTags(Scenario scenario) {
//        System.out.println("Lanch chrome browse");
//        System.out.println(scenario.getName());
//    }
//
//    @After("@Smoke")
//    public void tearDownCloseCloseChecktags() {
//        System.out.println("Close the browser");
//    }

    @Before(order = 1)
    public void setupBrowser(Scenario scenario) {
        System.out.println("Lanch chrome browse");
        System.out.println(scenario.getName());
    }

    @Before(order  = 2)
    public void setupUrl() {
        System.out.println("Lanch url");
    }

    @After(order = 1)
    public void tearDownClose() {
        System.out.println("Close the browser");
    }

    @After(order = 2)
    public void tearDownLogOut() {
        System.out.println("Logout from app");
    }

    @BeforeStep
    public void takeScreenShot() {
        System.out.println("take screenshot");
    }

    @AfterStep
    public void refreshPage() {
        System.out.println("refresh the page");
    }
}
