package Shapes;

public class Circle extends Shape {
    private double radius;
    public Circle(String color, fillType fillType, double radius){
        super(color, fillType);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void displayInfo(){
        System.out.println(super.getColor() + " " + super.getFillType() + " " + getRadius());
    }
    @Override
    public double getArea(){return this.radius*this.radius*Math.PI;}

    public double calculateCircumference(double pi){
        return 2*pi*this.radius;
    }
    public double calculateCircumference(){
        return 2*Math.PI*this.radius;
    }
    }
