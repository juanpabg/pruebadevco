package co.com.devco.certification.hangout.stepdefinitions;

import static co.com.devco.certification.hangout.util.constant.ConstantManager.CHROME;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class PhoneCallStepDefinitions {

	@Before
	public void prepareStage() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Managed(driver = CHROME)
	private WebDriver hisBrowser;

	@When("^I call an no existent contact$")
	public void iCallAnNoExistentContact() {

	}

	@Then("^I can verify that was called$")
	public void iCanVerifyThatWasCalled() {

	}

	@When("^I call an existent contact$")
	public void iCallAnExistentContact() {

	}

	@When("^I call an contact in another country$")
	public void iCallAnContactInAnotherCountry() {

	}
}
