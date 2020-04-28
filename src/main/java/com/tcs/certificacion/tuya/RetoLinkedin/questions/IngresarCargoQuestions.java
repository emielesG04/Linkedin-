package com.tcs.certificacion.tuya.RetoLinkedin.questions;

import static com.tcs.certificacion.tuya.RetoLinkedin.userinterfaces.IngresarCargo.MENSAJE_RESPUESTA_CARGO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class IngresarCargoQuestions implements Question<String> {

	private String tituloCargo;

	public IngresarCargoQuestions(String tituloCargo) {
		this.tituloCargo = tituloCargo;
	}

	@Override
	public String answeredBy(Actor actor) {
		actor.attemptsTo(WaitUntil.the((MENSAJE_RESPUESTA_CARGO.of(tituloCargo)), WebElementStateMatchers.isVisible()));
		return Text.of(MENSAJE_RESPUESTA_CARGO.of(tituloCargo)).viewedBy(actor).asString();

	}

	public static IngresarCargoQuestions mensaje(String tituloCargo) {
		return new IngresarCargoQuestions(tituloCargo);
	}

}
