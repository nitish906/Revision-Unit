package Que_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("appConfig.xml");
		DrawShape ds = apc.getBean("drawShape", DrawShape.class);
		ds.draw(new Cylinder());
	}
}
