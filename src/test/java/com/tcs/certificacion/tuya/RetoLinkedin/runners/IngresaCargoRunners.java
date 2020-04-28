package com.tcs.certificacion.tuya.RetoLinkedin.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/ingresar_cargo.feature"
        , glue = "com.tcs.certificacion.tuya.RetoLinkedin.stepdefinitions"
        , snippets = SnippetType.CAMELCASE)
public class IngresaCargoRunners {
	
}
