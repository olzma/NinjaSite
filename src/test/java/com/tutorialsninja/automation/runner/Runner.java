package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"html:target/cucumber_html_report","pretty"},
		//pretty used for featurefile displayed colored in console
		features ={"classpath:FeatureFiles/Register.feature"},
		glue ={"classpath:com.tutorialsninja.automation.stepdef"},
		tags ="@Register"
				//@RunOnlyForSmokeTest   @Books  @login @average @register
				//there are standard default tags  @dev @wip @ignore
		//@All and not @login and not @ignore and not @dev
		//monochrome = true
		)
public class Runner {

}
