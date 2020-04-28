package com.tcs.certificacion.tuya.RetoLinkedin.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.tcs.certificacion.tuya.RetoLinkedin.models.DatosIngreso;
import com.tcs.certificacion.tuya.RetoLinkedin.questions.IngresarLoguin;
import com.tcs.certificacion.tuya.RetoLinkedin.tasks.AbrirNavegador;
import com.tcs.certificacion.tuya.RetoLinkedin.tasks.IngresarCredenciales;

import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ingresarStepDefinitions {

	@Managed
	private WebDriver miNavegador;

	@Before
	public void setUpOnStage() {
		setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(miNavegador)));
		
		theActorCalled("the user");
	}

	@Given("^que Elvis esta en el portal$")
	public void queElvisEstaEnElPortal() {
		
		OnStage.theActorInTheSpotlight().wasAbleTo(AbrirNavegador.navegador());

	}

	@When("^el ingresa la información para ingresar$")
	public void elIngresaLaInformaciónParaIngresar(List<DatosIngreso> datoes) {

		OnStage.theActorInTheSpotlight().attemptsTo(IngresarCredenciales.conDatos(datoes.get(0)));
	}

	@Then("^el usuario debe ver el nombre (.*)$")
	public void elUsuarioDebeVerElNombreElvisMiguelMielesGuarin(String nombreUsuario) {
		theActorInTheSpotlight().should(seeThat(IngresarLoguin.mensaje(), org.hamcrest.Matchers.is(nombreUsuario)));
	}

}