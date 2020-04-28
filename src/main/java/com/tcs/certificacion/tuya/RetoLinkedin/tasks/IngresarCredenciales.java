package com.tcs.certificacion.tuya.RetoLinkedin.tasks;

import com.tcs.certificacion.tuya.RetoLinkedin.models.DatosIngreso;
import net.serenitybdd.screenplay.Actor;
import static com.tcs.certificacion.tuya.RetoLinkedin.userinterfaces.Ingresar.*;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarCredenciales implements Task {

	 private DatosIngreso datosIngreso;

	    public IngresarCredenciales(DatosIngreso datosIngreso) {

	        this.datosIngreso = datosIngreso;
	    }

	    @Override
	    public <T extends Actor> void performAs(T actor) {
	    	
	        actor.attemptsTo(Click.on(INGRESA_PESTANA_PRODUCTO));
	        actor.attemptsTo(Enter.theValue(datosIngreso.getUsuario()).into(DIGITA_EL_USUARIO));
	        actor.attemptsTo(Enter.theValue(datosIngreso.getContrasena()).into(DIGITA_CONTRASENA));
	        actor.attemptsTo(Click.on(SELECCIONA_BOTON_ACEPTAR));
	    }

	    public static IngresarCredenciales conDatos( DatosIngreso datosIngreso){
	        return new IngresarCredenciales(datosIngreso);
	    }
	    
}
