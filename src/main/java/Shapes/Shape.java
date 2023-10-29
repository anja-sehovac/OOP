package Shapes;

public class Shape {
    public enum fillType{
        FILLED, NOT_FILLED
    }
    private String color;
    private fillType fillType;

    public Shape(String color, fillType fillType) {
        this.color = color;
        this.fillType = fillType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape.fillType getFillType() {
        return fillType;
    }

    public void setFillType(Shape.fillType fillType) {
        this.fillType = fillType;
    }

    public void displayInfo(){
        System.out.println(this.color + " " + this.fillType);
    }
    public double getArea(){return -1;}

}
