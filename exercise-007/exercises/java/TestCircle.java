package exercises.java;

public class TestCircle {
    public static void main(String[] args) {
        Circle baseCircle = new Circle();
        Circle paramCircle = new Circle(12);
        Circle paramsCircle = new Circle(12, "green");
        System.out.println(paramCircle.getRadius());
        System.out.println(paramCircle.getArea());
        baseCircle.setRadius(13);
        System.out.println(baseCircle.getRadius());
        baseCircle.setColor("brown");
        // Explicit call to toString which contains only a string:
        System.out.println(baseCircle.toString());
        // Implicit call to toString: WOW
        System.out.println(baseCircle);
        // Invoking the toString method with string concatenation (+ operator):
        System.out.println("" + baseCircle);
    }
}
