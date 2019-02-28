package co.com.devco.certification.hangout.interactions;

import static co.com.devco.certification.hangout.util.constant.ConstantManager.IFRAME;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SwitchToTheFrame implements Interaction{

	
	public SwitchToTheFrame()
	{
		super();
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		WebElement iFrame= BrowseTheWeb.as(actor).getDriver()
				.findElement(By.tagName(IFRAME));
		BrowseTheWeb.as(actor).getDriver().switchTo().defaultContent();
		BrowseTheWeb.as(actor).getDriver().switchTo().frame(iFrame);
		
	}
	
	public static SwitchToTheFrame called()
	{
		return Tasks.instrumented(SwitchToTheFrame.class);
	}

}
