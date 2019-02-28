package co.com.devco.certification.hangout.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@CucumberOptions(features = "src/test/resources/features/message.feature", 
glue = "co.com.devco.certification.hangout.stepdefinitions", 
snippets = SnippetType.CAMELCASE)
@RunWith(CucumberWithSerenity.class)

public class MessageRunner {

}
