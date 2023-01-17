public class Shape {

    public String shapeName;
    public int numberOfEdges;

        public Shape() {
            System.out.println("New object created!");
            this.shapeName = "Undefined shape!";
        }

        public Shape(double radius){
            this.shapeName = "Circle";
            System.out.printf("New %s created! Radius of circle = %f m.\n" ,shapeName, radius);
        }

        public Shape(int edges, double side){
            this.shapeName = "Square";
            this.numberOfEdges = edges;
            System.out.printf("New %s created! Side length = %fm\n",shapeName, side);
        }

        public Shape(int edges, double e1, double e2){
            this.shapeName = "Rectangle";
            this.numberOfEdges = edges;
            System.out.printf("New %s created! Length = %fm , Width = %fm\n",shapeName, e1, e2);
        }

        public Shape(int edges, double e1, double e2, double e3){
            this.shapeName = "Triangle";
            this.numberOfEdges = edges;
            System.out.printf("New %s created! Edge1 = %fm, Edge2 = %fm, Edge3 = %fm\n",shapeName, e1, e2, e3);
        }

    public String getShapeDetails() {
            return this.shapeName + " has " + this.numberOfEdges + " edges!";

    }
}

