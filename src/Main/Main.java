package Main;

import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main("Main.Main");
	}

	Logica log;

	public void settings() {
		fullScreen();
	}

	public void setup() {
		log = new Logica(this);
	}

	public void draw() {
		background(255);
		log.ejecutar();
	}

	public void keyPressed() {
		if (exitCalled) {
			exit();
		}
		log.pressed();
	}
}
