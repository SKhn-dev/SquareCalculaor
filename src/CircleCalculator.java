public class CircleCalculator {
    public static void main(String[] args) {
        //declare and initialize the variable to store radius value
        double circleRadius=12.0;
        // calculating circle diameter
        double circleDiameter=2*circleRadius;
        //calculating circle circumference
       // double pi=3.14159;
        double circleCircumference=2*Math.PI*circleRadius;
        //calculating area of the circle
        double circleArea=pi*circleRadius*circleRadius;
        //Print the results
        System.out.println("Diameter: "+circleDiameter);
        System.out.println("Circumference: "+circleCircumference);
        System.out.println("Area: "+circleArea);
    }
}
