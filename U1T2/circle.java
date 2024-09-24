package U1T2;

public class circle {
    double radius;

    public circle (double rad) {
        radius=rad;
    }

    public double area () {
        double area = Math.PI * radius * radius;
        // System.out.println("The are of your circle is : "+area);
        return (area);
    }
}
