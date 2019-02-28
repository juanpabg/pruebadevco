package co.com.devco.certification.hangout.userinterface;

import co.com.devco.certification.hangout.util.constant.ConstantTypeClass;
import net.serenitybdd.screenplay.targets.Target;

public class MessagePage {

	public static final Target BTN_MESSAGE = Target.the("Button to select message")
			.locatedBy("//div[@jsname='l03kKd']");
	
	public static final Target TXT_CONTACT = Target.the("Text to find contact")
			.locatedBy("//div[@class='gV']//input");
	
	public static final Target CONTACT_FIND = Target.the("Contact was find")
			.locatedBy("//div[@class='Kv']//div[1]");	
	
	private MessagePage() {
		throw new IllegalStateException(ConstantTypeClass.UI_CLASS);
	}
	
}
