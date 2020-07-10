package Habitat.PageObjectPackage;

import Habitat.BaseClassPackage.DriverFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends DriverFactory {
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement cookie;
    public void cookieMethod(){
        cookie.click();
    }
    @FindBy(id = "i-account")
    WebElement accountButton;
    public void accountButtonMethod(){
        accountButton.click();
    }
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement pass;
    public void loginMethod(String arg0, String arg1){
        email.sendKeys(arg0);
        pass.sendKeys(arg1);
        pass.sendKeys(Keys.ENTER);
    }
}
