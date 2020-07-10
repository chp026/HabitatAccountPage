package Habitat;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Chirag\\IdeaProjects\\Habitat\\src\\test\\Resource\\MyAccount.feature",
plugin = {"html:target/cucumber-html-report",
"json:target/cucumber-json-report.json"})

public class RunCukeTest {
}
