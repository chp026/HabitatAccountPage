package Habitat.StepDefinitionPackage;

import Habitat.PageObjectPackage.MyAccount;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyAccountSteps {
    MyAccount myAccount = new MyAccount();

    @Given("^user is on Habitat homepage$")
    public void user_is_on_Habitat_homepage() throws Throwable {
        Thread.sleep(2000);
        myAccount.cookieMethod();
    }

    @When("^user clicks on MyAccount button$")
    public void user_clicks_on_MyAccount_button() throws Throwable {
        myAccount.accountButtonMethod();
    }

    @And("^user types \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userTypesAnd(String arg0, String arg1) throws Throwable {
        Thread.sleep(3000);
        myAccount.loginMethod(arg0,arg1);
    }

    @Then("^user should be able to see Account page$")
    public void user_should_be_able_to_see_Account_page() throws Throwable {
    }

}
