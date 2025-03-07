package ro.ulbs.paradigme.lab2;

public class Triangle extends Form {
    private float height;
    private float base;

    public Triangle() {
        super();
        this.height = 0;
        this.base = 0;
    }

    public Triangle(float height, float base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return (height * base) / 2;
    }

    @Override
    public String toString() {
        return "Is a Triangle with base =" + base + "and height =" + height;
    }

}
