package co.com.devco.certification.hangout.util.properties;

import static co.com.devco.certification.hangout.util.constant.ConstantManager.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class HangoutProperties {

	private static Properties prop = null;

	private HangoutProperties() {
		throw new IllegalStateException();

	}

	public static String getUrlFront() throws IOException {
		cargarPropiedades();
		return prop.getProperty(URL_FRONT);

	}

	public static void cargarPropiedades() throws IOException {
		if (prop == null) {
			prop = new Properties();
			File objclasspathRoot = new File(System.getProperty(USER_DIR));
			String strFilePath = objclasspathRoot.getAbsolutePath();
			prop.load(new FileReader(strFilePath + BACK_SLASH + HANGOUT + PUNTO + PROPERTIES));
		}
	}

}
