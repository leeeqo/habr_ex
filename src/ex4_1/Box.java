package ex4_1;

import java.util.ArrayList;

public class Box extends Shape {
    private ArrayList<Shape> shapes;// = new ArrayList<>();
    private double available;

    public Box(double available) {
        super(available);
    }

    public boolean add(Shape shape) {
        if (shape.getVolume() <= available) {
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        }
        else {
            return false;
        }
    }
}