package tester;

import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x and y coordinates of the first point (p1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x and y coordinates of the second point (p2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

        System.out.println("Details of point p1: " + p1.getDetails());
        System.out.println("Details of point p2: " + p2.getDetails());

        if (p1.isEqual(p2)) {
            System.out.println("p1 and p2 are located at the same position.");
        } else {
            double distance = p1.calculateDistance(p2);
            System.out.println("p1 and p2 are located at different positions.");
            System.out.println("Distance between p1 and p2: " + distance);
        }

        sc.close();
    }
}