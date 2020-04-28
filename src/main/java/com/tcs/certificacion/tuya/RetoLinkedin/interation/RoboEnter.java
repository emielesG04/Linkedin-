package com.tcs.certificacion.tuya.RetoLinkedin.interation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class RoboEnter implements Interaction {
	
	private int enter;

	public RoboEnter(int enter) {
		this.enter = enter;
	}

	@Override
	public <T extends Actor> void performAs(T arg0) {
		try {
			Robot robot = new Robot();
//			robot.keyPress(KeyEvebt.VK_END);
			for (int i = 0; i < enter; i++)
				robot.keyPress(KeyEvent.VK_ENTER);

		} catch (AWTException e) {
			e.printStackTrace();
		}
		
	}
	
	public static ScrollDown on(int enter) {
		return new ScrollDown(enter);
	}

}
