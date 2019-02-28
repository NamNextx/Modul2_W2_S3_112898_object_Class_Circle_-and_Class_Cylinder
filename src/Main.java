public class Main {

    public static void main(String[] args) {
        Circle circle=new Circle(20,"Green");
        System.out.println(circle);

        Cylinder cylinder =new Cylinder(3,3,"blue");
        System.out.println(cylinder.getArea());
    }
}
