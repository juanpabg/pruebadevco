package co.com.devco.certification.hangout.userinterface;

import co.com.devco.certification.hangout.util.constant.ConstantTypeClass;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

	public static final Target BTN_SIGN_IN = Target.the("button to sign in hangout")
			.locatedBy("//a[@id='gb_70']");
	
	public static final Target TXT_USER = Target.the("Text introduce your user")
			.locatedBy("//input[@id='identifierId']");
	
	public static final Target BTN_NEXT = Target.the("Button to next")
			.locatedBy("//*[@id=\"identifierNext\"]/content/span");
	
	public static final Target TXT_PASSWORD = Target.the("Text introduce your password")
			.locatedBy("//input[@name='password']");	
	
	public static final Target BTN_NEXT_PASSWORD = Target.the("Button to next password")
			.locatedBy("//*[@id=\"passwordNext\"]/content/span");
	
	private LoginPage() {
		throw new IllegalStateException(ConstantTypeClass.UI_CLASS);
	}
}
