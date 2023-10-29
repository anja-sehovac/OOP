package Shapes;

public class Rectangle extends Shape{
    double width;
    double height;
    public Rectangle(String color, fillType fillType, double width, double height){
        super(color, fillType);
        this.width=width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void displayInfo(){
        System.out.println(super.getColor()+ " " + super.getFillType() + " " + this.getHeight() + " " + this.getWidth());
    }

    @Override
    public double getArea(){
        return getWidth()*getHeight();
    }
}
