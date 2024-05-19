
import java.awt.Rectangle;

public class Rectangle_Class {
    public static void main(String[] args) {
        Rectangle box = new Rectangle();
        System.out.println("X = "+box.getX());
        System.out.println("Y = "+box.getY());
        System.out.println("Width = "+box.getWidth());
        System.out.println("Highet = "+box.getHeight());
        System.out.println("========================");
        box.setBounds(5,10,20,30);
        System.out.println("X = "+box.getX());
        System.out.println("Y = "+box.getY());
        System.out.println("Width = "+box.getWidth());
        System.out.println("Highet = "+box.getHeight());
        System.out.println("========================");
        box.translate(10, 15);
        System.out.println("X = "+box.getX());
        System.out.println("Y = "+box.getY());
    }
}
