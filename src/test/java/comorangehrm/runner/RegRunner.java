package comorangehrm.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features",
								glue="steps",
								stepNotifications=true,
								dryRun=true,
								tags="@wip0304a")
public class RegRunner {

}
