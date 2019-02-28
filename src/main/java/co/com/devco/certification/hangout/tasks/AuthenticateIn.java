package co.com.devco.certification.hangout.tasks;

import java.util.List;
import co.com.devco.certification.hangout.model.Account;
import static co.com.devco.certification.hangout.userinterface.LoginPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AuthenticateIn implements Task {

	private Account credentials;

	public AuthenticateIn(List<Account> credentials) {
		this.credentials = credentials.get(0);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Enter.theValue(credentials.getUser()).into(TXT_USER), 
				Click.on(BTN_NEXT),
				Enter.theValue(credentials.getPassword()).into(TXT_PASSWORD), 
				Click.on(BTN_NEXT_PASSWORD));
	}

	public static Task hangout(List<Account> credentials) {
		return Tasks.instrumented(AuthenticateIn.class, credentials);
	}

}