package abstractFactoryPattern;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		
		Shape shape1 = shapeFactory.getShape("Regtangle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("Square");
		shape2.draw();
		
		AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
		
		Shape shape3 = shapeFactory.getShape("Regtangle");
		shape1.draw();
		
		Shape shape4 = shapeFactory.getShape("Square");
		shape2.draw();
	}

}
