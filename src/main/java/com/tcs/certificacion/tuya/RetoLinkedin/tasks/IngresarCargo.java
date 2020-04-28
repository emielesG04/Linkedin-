package com.tcs.certificacion.tuya.RetoLinkedin.tasks;

import static com.tcs.certificacion.tuya.RetoLinkedin.userinterfaces.IngresarCargo.DIGITA_EL_TITULO_DEL_CARGO;
import static com.tcs.certificacion.tuya.RetoLinkedin.userinterfaces.IngresarCargo.INGRESAR_EXPERIENCIA;
import static com.tcs.certificacion.tuya.RetoLinkedin.userinterfaces.IngresarCargo.INGRESA_EMPRESA;
import static com.tcs.certificacion.tuya.RetoLinkedin.userinterfaces.IngresarCargo.INGRESA_ICONO_PERFIL;
import static com.tcs.certificacion.tuya.RetoLinkedin.userinterfaces.IngresarCargo.INGRESA_PERFIL;
import static com.tcs.certificacion.tuya.RetoLinkedin.userinterfaces.IngresarCargo.INGRESA_UBICACION;
import static com.tcs.certificacion.tuya.RetoLinkedin.userinterfaces.IngresarCargo.SELECCIONA_EL_MES_INGRESO;
import static com.tcs.certificacion.tuya.RetoLinkedin.userinterfaces.IngresarCargo.SELECCIONA_TIPO_CONTRATO;
import static com.tcs.certificacion.tuya.RetoLinkedin.userinterfaces.IngresarCargo.SELECCIONA_EL_AÑO_INGRESO;
import static com.tcs.certificacion.tuya.RetoLinkedin.userinterfaces.IngresarCargo.INGRESA_LA_DESCIPCION_DEL_CARGO;
import static com.tcs.certificacion.tuya.RetoLinkedin.userinterfaces.IngresarCargo.GUARDA_LA_INFORMACIÓN;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.tcs.certificacion.tuya.RetoLinkedin.interation.ScrollDown;
import com.tcs.certificacion.tuya.RetoLinkedin.interation.WaitInteration;
import com.tcs.certificacion.tuya.RetoLinkedin.models.DatosParaElCargo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarCargo implements Task {

	private DatosParaElCargo datosCargo;

	public IngresarCargo(DatosParaElCargo datosCargo) {

		this.datosCargo = datosCargo;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(INGRESA_ICONO_PERFIL), Click.on(INGRESA_PERFIL), WaitInteration.waitFor(5),
				ScrollDown.on(5));
		actor.attemptsTo(Click.on(INGRESAR_EXPERIENCIA));
		actor.attemptsTo(Enter.theValue(datosCargo.getTitulo()).into(DIGITA_EL_TITULO_DEL_CARGO));

		actor.attemptsTo(Click.on(SELECCIONA_TIPO_CONTRATO.of(datosCargo.getTipoContrato())));

		actor.attemptsTo(Enter.theValue(datosCargo.getEmpresa()).into(INGRESA_EMPRESA), ScrollDown.on(1));

		actor.attemptsTo(Enter.theValue(datosCargo.getUbicacion()).into(INGRESA_UBICACION), ScrollDown.on(2));
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);

		} catch (AWTException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Click.on(SELECCIONA_EL_MES_INGRESO.of(datosCargo.getMesIngreso())));
		actor.attemptsTo(Click.on(SELECCIONA_EL_AÑO_INGRESO.of(datosCargo.getAñoIngreso())), ScrollDown.on(2));
		actor.attemptsTo(Enter.theValue(datosCargo.getDescripcion()).into(INGRESA_LA_DESCIPCION_DEL_CARGO));
		actor.attemptsTo(Click.on(GUARDA_LA_INFORMACIÓN));
		WaitInteration.waitFor(5);
		ScrollDown.on(2);

	}

	public static IngresarCargo conDatos(DatosParaElCargo datosCargo) {
		return new IngresarCargo(datosCargo);
	}
}
