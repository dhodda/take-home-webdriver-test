package dotdash.automation.tests;

import dotdash.automation.helpers.ConfigReader;
import dotdash.automation.pageobjects.LoginPageObject;
import dotdash.automation.pageobjects.SecurePageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginStepDefs {
    SecurePageObject securePageObject;
    WebDriver driver;

    public void navigateTo(String url) {
        driver.navigate().to(new ConfigReader().getBaseUri() + url);
    }

    @Given("I have username and password")
    public void i_have_username_and_password() {
        String driverType = System.getProperty("os.name").startsWith("Windiows") ? "chromedriver.exe" : "chromedriver";
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/" + driverType);
        this.driver = new ChromeDriver();
        String url = "/login";
        String username = "tomsmith";
        String password = "SuperSecretPassword!";
        navigateTo(url);
        securePageObject = new LoginPageObject(driver)
                .enterUsername(username)
                .enterPassword(password)
                .clickLogin();
        assertEquals("Welcome to the Secure Area. When you are done click logout below.", securePageObject.getSubHeader());

    }


    @When("I enter click")
    public void i_enter_click() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("I see success page")
    public void i_see_success_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
