package co.com.devco.certification.hangout.stepdefinitions;

import static co.com.devco.certification.hangout.exceptions.ContactNoExistExceptions.CONTACT_NO_EXIST;
import static co.com.devco.certification.hangout.tasks.OpenBrowser.openningBrowser;
import static co.com.devco.certification.hangout.util.constant.ConstantManager.CHROME;
import static co.com.devco.certification.hangout.util.constant.ConstantManager.USER;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import java.util.List;
import org.openqa.selenium.WebDriver;
import co.com.devco.certification.hangout.exceptions.ContactNoExistExceptions;
import co.com.devco.certification.hangout.model.Account;
import co.com.devco.certification.hangout.questions.VerifyContact;
import co.com.devco.certification.hangout.tasks.AuthenticateIn;
import co.com.devco.certification.hangout.tasks.Find;
import co.com.devco.certification.hangout.tasks.GoTo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class MessageStepDefinitions {

	@Before
	public void prepareStage() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Managed(driver = CHROME)
	private WebDriver hisBrowser;

	@Given("^I am navigate to the login page$")
	public void iAmNavigateToTheLoginPage() throws Exception {
		theActorCalled(USER).can(BrowseTheWeb.with(hisBrowser));
		theActorInTheSpotlight().wasAbleTo(openningBrowser());
		theActorInTheSpotlight().attemptsTo(GoTo.login());
	}

	@When("^I start session$")
	public void iStartSession(List<Account> credentials) {
		theActorInTheSpotlight().attemptsTo(AuthenticateIn.hangout(credentials));
	}

	@When("^I look for a contact in the message$")
	public void iLookForAContactInTheMessage(List<List<String>> user) {
		theActorInTheSpotlight().attemptsTo(Find.contact(user));
	}

	@Then("^I can verify that the contact exists$")
	public void iCanVerifyThatTheContactExists() {
		theActorInTheSpotlight().should(
				seeThat(VerifyContact.exist()).orComplainWith(ContactNoExistExceptions.class, CONTACT_NO_EXIST));
	}

	@When("^I send an invitation$")
	public void iSendAnInvitation() {

	}

	@Then("^I can verify that the invitation was sent$")
	public void iCanVerifyThatTheInvitationWasSent() {

	}

	@When("^I send a message$")
	public void iSendAMessage() {

	}

	@Then("^I can verify that the message was sent$")
	public void iCanVerifyThatTheMessageWasSent() {

	}

	@When("^I form a conversation group$")
	public void iFormAConversationGroup() {

	}

}
