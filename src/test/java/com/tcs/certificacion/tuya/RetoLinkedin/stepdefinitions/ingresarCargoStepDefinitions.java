package com.tcs.certificacion.tuya.RetoLinkedin.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;
import com.tcs.certificacion.tuya.RetoLinkedin.models.DatosParaElCargo;
import com.tcs.certificacion.tuya.RetoLinkedin.questions.IngresarCargoQuestions;
import com.tcs.certificacion.tuya.RetoLinkedin.questions.IngresarLoguin;
import com.tcs.certificacion.tuya.RetoLinkedin.tasks.IngresarCargo;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class ingresarCargoStepDefinitions {
	
	
	@Dado("^el Analista se encuentra en la pantalla de agregar experiencia y digita los datos$")
	public void elAnalistaSeEncuentraEnLaPantallaDeAgregarExperienciaYDigitaLosDatos(List<DatosParaElCargo> datosCargo) {
	    
	
		OnStage.theActorInTheSpotlight().attemptsTo(IngresarCargo.conDatos(datosCargo.get(0)));
	}

	@Entonces("^el deberia ver en el perfil (.*)$")
	public void elDeberiaVerEnElPerfilAutomatizadorPruebasFuncionales(String tituloCargo) {
		theActorInTheSpotlight().should(seeThat(IngresarCargoQuestions.mensaje(tituloCargo), org.hamcrest.Matchers.is(tituloCargo)));
	}

}
