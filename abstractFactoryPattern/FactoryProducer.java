package abstractFactoryPattern;

public class FactoryProducer {
	static AbstractFactory getFactory(boolean rounded) {
		
		if(rounded) {
			return new RoundedShapeFactory();
		}
		else {
			return new ShapeFactory();
		}
	}
}
