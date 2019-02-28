package co.com.devco.certification.hangout.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.com.devco.certification.hangout.util.enums.ExceptionCodes;
import co.com.devco.certification.hangout.util.properties.HangoutProperties;

public class OpenBrowser implements Task {
		
    private static final Logger LOGGER = LogManager.getLogger(OpenBrowser.class.getName());

	public OpenBrowser() {
		super();
	}	

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		try {
			actor.attemptsTo(Open.url(HangoutProperties.getUrlFront()));
		} catch (Exception ex) {
            LOGGER.warn(ExceptionCodes.EMPTY_REQUEST.getMsg(), ex);
		}		
	}
	
	public static OpenBrowser openningBrowser() {
		return instrumented(OpenBrowser.class);
	}

}
