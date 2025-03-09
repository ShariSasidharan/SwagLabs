package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/features",
glue={"stepDefinitions","base"},
monochrome=true,
plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags = "@PositiveStandardUserLogin or @NegativeVisualUserLogin or @SubmitOrder or @Logout")

@Test
public class RunnerTest extends AbstractTestNGCucumberTests{

}
