package abstractFactoryPattern;

public class RoundedShapeFactory extends AbstractFactory{
	@Override
	Shape getShape(String shapeType) {
		
		if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		
		if(shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		
		return null;
	}
	
}
