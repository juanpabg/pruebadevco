package co.com.devco.certification.hangout.tasks;

import static co.com.devco.certification.hangout.userinterface.LoginPage.BTN_SIGN_IN;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoTo implements Task {

	public GoTo() {
		super();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Click.on(BTN_SIGN_IN));
	}

	public static Task login() {
		return Tasks.instrumented(GoTo.class);
	}

}