package application;

import entities.RemoteControl;

public class Main {

	public static void main(String[] args) {
		RemoteControl c = new RemoteControl();
		c.turnOn();
		c.plusVolume();
		c.play();
		c.openMenu();
		c.closeMenu();
	}
}
