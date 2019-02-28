public class Circle {
    private double radius = 1;
    private String color = "Red";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }

    public double getArea(){
        return (radius*radius)*Math.PI;
    }
    public double getPrimeter(){
        return (radius+radius)*Math.PI;
    }
    @Override
    public String toString(){
        return "With radius= "+getRadius()+" and color is "+getColor()+" we have Area = "+getArea();
    }
}
