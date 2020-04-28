package com.tcs.certificacion.tuya.RetoLinkedin.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Task {

	
	  @Override
	    public <T extends Actor> void performAs(T actor) {
		  
	        actor.attemptsTo(Open.url("https://www.linkedin.com/"));
	       
	    }

	    public static  AbrirNavegador navegador(){

	        return Tasks.instrumented(AbrirNavegador.class);
	    }

}
