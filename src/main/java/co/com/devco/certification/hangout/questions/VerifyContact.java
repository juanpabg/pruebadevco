package co.com.devco.certification.hangout.questions;

import co.com.devco.certification.hangout.userinterface.MessagePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyContact implements Question<Boolean> {

	public VerifyContact() {
		super();
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		boolean answer = false;
		String name = MessagePage.CONTACT_FIND.resolveFor(actor).getText();
		if (name.equals(actor.sawAsThe("name"))) {
			answer = true;
		}
		return answer;
	}

	public static VerifyContact exist() {
		return new VerifyContact();
	}
}
