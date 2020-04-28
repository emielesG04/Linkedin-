package com.tcs.certificacion.tuya.RetoLinkedin.userinterfaces;

import org.openqa.selenium.By;


import net.serenitybdd.screenplay.targets.Target;

public class IngresarCargo {

	public static final Target INGRESA_ICONO_PERFIL = Target.the("Ingresa al perfil").locatedBy("//*[@id=\"ember26\"]");

	public static final Target INGRESA_PERFIL = Target.the("Selecciona la opción para ver la pantalla de agregar crago")
			.locatedBy("//*[@class=\"nav-settings__member-name t-16 t-black t-bold\"]");
	
	public static final Target INGRESAR_EXPERIENCIA = Target.the("Selecciona el icono de experiencia")
			.locatedBy("//a[@class='pv-profile-section__header-add-action add-position artdeco-button artdeco-button--tertiary artdeco-button--circle ember-view']/li-icon");

	public static final Target INGRESA_A_INGRESAR_CARGO = Target.the("Ingresa a la pantalla para agregar el cargo")
			.locatedBy("//*[@data-control-name='globalfooter.talent_solutions']");

	public static final Target DIGITA_EL_TITULO_DEL_CARGO = Target.the("Digita el titulo del cargo")
			.located(By.id("position-title-typeahead"));
	
	public static final Target SELECCIONA_MENU_PRINCIPAL_CONTRATO =Target.the("selecciona el menu principal")
			.locatedBy("//select[@data-control-name='edit_position_employment_type']");

	public static final Target SELECCIONA_TIPO_CONTRATO = Target.the("selecciona el tipo de contrato")
			.locatedBy("//select[@data-control-name='edit_position_employment_type']//option[.='{0}']");
	
	public static final Target INGRESA_EMPRESA = Target.the("Digita el nombre empresa")
			.located(By.id("position-company-typeahead"));

	public static final Target INGRESA_UBICACION = Target.the("Digita la ubicación de la empresa")
			.locatedBy("//input[@placeholder='Ex: London, United Kingdom']");

	public static final Target SELECCIONA_EL_MES_INGRESO = Target.the("selecciona el tipo de contrato")
			.locatedBy("//select[@data-control-name='edit_position_start_date_month']//option[.='{0}']");
	
	public static final Target SELECCIONA_EL_AÑO_INGRESO = Target.the("selecciona el tipo de contrato")
			.locatedBy("//select[@data-control-name='edit_position_start_date_year']//option[.='{0}']");
	
	public static final Target INGRESA_LA_DESCIPCION_DEL_CARGO = Target.the("Ingresa la descipción del cargo")
			.located(By.id("position-description"));

	public static final Target GUARDA_LA_INFORMACIÓN = Target.the("Guarda la información")
			.locatedBy("(//button[@class='pe-form-footer__action--submit artdeco-button form-submit-action t-14 t-white t-normal'])[2]");

    public static  final Target MENSAJE_RESPUESTA_CARGO = Target.the("Muestra el cargo ingresado")
            .locatedBy("//ul//li//div//h3[contains(text(), '{0}')]");
}
