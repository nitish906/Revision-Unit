package Que_4;

public class Circle implements Shape {
	public void draw() {
		System.out.println("You have drawn Circle");
	}

	@Override
	public void drawIt() {
		draw();
	}
}