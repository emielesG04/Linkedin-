package com.tcs.certificacion.tuya.RetoLinkedin.questions;

import static com.tcs.certificacion.tuya.RetoLinkedin.userinterfaces.Ingresar.MENSAJE_RESPUESTA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class IngresarLoguin implements Question<String> {
	

	@Override
	public String answeredBy(Actor actor) {
		actor.attemptsTo(WaitUntil.the((MENSAJE_RESPUESTA), WebElementStateMatchers.isVisible()));
        return Text.of(MENSAJE_RESPUESTA).viewedBy(actor).asString();
		
	}
	
	 public static IngresarLoguin mensaje(){

	        return new IngresarLoguin();
	    }
	

}
