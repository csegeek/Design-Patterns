package factory;

public class FactoryDesign {


 /*
  * When There is a superclass and multiple subclasses and we want to get object of 
  * subclasses based on input and requirement,Then We create factory class which takes 
  * responsibility of creating object of class based on Input .
  * 
  * Advantages:
  * 1.Focus on creating object for Interface rather than implementing.
  * 2.Loose coupling more robust code.
  */

  // Factory Method
        public Shape getShape(String shapeType) {
            if (shapeType == null) {
                return null;
            }
            if (shapeType.equalsIgnoreCase("CIRCLE")) {
                return new Circle();
            } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
                return new Rectangle();
            } else if (shapeType.equalsIgnoreCase("SQUARE")) {
                return new Square();
            }
            return null;
        }
        

}
