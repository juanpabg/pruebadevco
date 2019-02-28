package co.com.devco.certification.hangout.stepdefinitions;

import static co.com.devco.certification.hangout.util.constant.ConstantManager.CHROME;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class VideoCallStepDefinitions {

	@Before
	public void prepareStage() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Managed(driver = CHROME)
	private WebDriver hisBrowser;

	@When("^I make video call to a contact$")
	public void iMakeVideoCallToAContact() {

	}

	@Then("^I can verify that the video call was made$")
	public void iCanVerifyThatTheVideoCallWasMade() {

	}

	@When("^I make video call to a group$")
	public void iMakeVideoCallToAGroup() {

	}

	@When("^I invite a video call to an contact$")
	public void iInviteAVideoCallToAnContact() {

	}

}
