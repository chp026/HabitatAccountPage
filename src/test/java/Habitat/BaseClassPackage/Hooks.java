package Habitat.BaseClassPackage;

import Habitat.PageObjectPackage.MyAccount;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();

    @Before
    public void Setup() throws InterruptedException {
        driverFactory.openBrowser();
    }
    @After
    public void tearDown() throws InterruptedException {
        driverFactory.closeBrowser();
    }
}
