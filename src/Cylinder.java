public class Cylinder extends Circle {
    private double height=1;

    public Cylinder(){

    }


    public Cylinder(double height, double circle, String color){
        super(circle,color);
        this.height=height;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getTheTich(){
        return this.height*(this.getRadius()*this.getRadius())*Math.PI;
    }

    @Override
    public String toString(){
        return "with height ="+ getHeight()+" and "+super.toString();
    }

}
