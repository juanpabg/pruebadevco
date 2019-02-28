package co.com.devco.certification.hangout.tasks;

import static co.com.devco.certification.hangout.userinterface.MessagePage.BTN_MESSAGE;
import static co.com.devco.certification.hangout.userinterface.MessagePage.TXT_CONTACT;
import java.util.List;
import co.com.devco.certification.hangout.interactions.SwitchToTheFrame;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

public class Find  implements Task {

	private List<List<String>> name;
	public Find(List<List<String>> name) {
		this.name = name;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
	
		actor.attemptsTo(
				Click.on(BTN_MESSAGE));
	
		actor.attemptsTo(
				SwitchToTheFrame.called(),
				Type.theValue(name.get(1).get(0)).into(TXT_CONTACT));
		actor.remember("name", name.get(1).get(1));
	}

	public static Task contact(List<List<String>> name) {
		return Tasks.instrumented(Find.class, name);
	}

}