package com.tcs.certificacion.tuya.RetoLinkedin.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Ingresar {
	
	 public static final Target INGRESA_PESTANA_PRODUCTO = Target
	            .the("Selecciona el boton de ingresar")
	            .located(By.className("nav__button-secondary"));

	    public static final  Target DIGITA_EL_USUARIO = Target.the("Digita el usuario")
	            .located(By.id("username"));

	    public static final Target DIGITA_CONTRASENA = Target.the("Digita la contraseña")
	            .located(By.id("password"));


	    public static final Target SELECCIONA_BOTON_ACEPTAR = Target.the("Selecciona el boton")
	            .locatedBy("//button[@class='btn__primary--large from__button--floating']");


	    public static  final Target MENSAJE_RESPUESTA = Target.the("Muestra el nombre del usuario")
	            .locatedBy("//div[@class='profile-rail-card__actor-link t-16 t-black t-bold']");
}
