public class Tester {

    public Tester(){
    }
    public static void main(String[] args){

        Shape shape = new Shape();
        Shape circle = new Shape(3.4);
        Shape square = new Shape(4, 5);
        Shape rectangle = new Shape(4,15,10);
        Shape triangle = new Shape(3,20,10,10);

        String shapeDetails = shape.getShapeDetails();
        String circleDetails = circle.getShapeDetails();
        String squareDetails = square.getShapeDetails();
        String rectangleDetails = rectangle.getShapeDetails();
        String triangleDetails = triangle.getShapeDetails();


        System.out.println(shapeDetails);
        System.out.println(circleDetails);
        System.out.println(squareDetails);
        System.out.println(rectangleDetails);
        System.out.println(triangleDetails);





    }
}
