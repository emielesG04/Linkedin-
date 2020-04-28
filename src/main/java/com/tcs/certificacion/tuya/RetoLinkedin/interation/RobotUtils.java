package com.tcs.certificacion.tuya.RetoLinkedin.interation;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class RobotUtils implements Interaction{
	
	 private String ruta;
	    public RobotUtils(String ruta) {
	        this.ruta = ruta;
	    }
	    public <T extends Actor> void performAs(T actor) {
	        try {
	            StringSelection string = new StringSelection(this.ruta);
	            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, (ClipboardOwner)null);
	            Robot tecla = new Robot();
	            tecla.keyPress(10);
	            tecla.keyRelease(10);
	            tecla.keyPress(17);
	            tecla.keyPress(86);
	            tecla.keyRelease(86);
	            tecla.keyRelease(17);
	            tecla.keyPress(10);
	            tecla.keyRelease(10);
	        } catch (HeadlessException var4) {
	            var4.printStackTrace();
	        } catch (AWTException var5) {
	            var5.printStackTrace();
	        }
	    }
	    public static RobotUtils robot(String ruta) {
	        return new RobotUtils(ruta);
	    }

}
