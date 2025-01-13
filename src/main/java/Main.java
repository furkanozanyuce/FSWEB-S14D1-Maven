import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.Employee;
import com.workintech.developers.HRManager;
import com.workintech.developers.MidDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius()); // circle.radius= 3.75
        System.out.println("circle.area= " + circle.getArea()); // circle.area= 44.178646691106465

        lines();

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius()); // cylinder.radius= 5.55
        System.out.println("cylinder.height= " + cylinder.getHeight()); // cylinder.height= 7.25
        System.out.println("cylinder.area= " + cylinder.getArea()); // cylinder.area= 96.76890771219959
        System.out.println("cylinder.volume= " + cylinder.getVolume()); // cylinder.volume= 701.574580913447

        lines();

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth()); // rectangle.width= 5.0
        System.out.println("rectangle.length= " + rectangle.getLength()); // rectangle.length= 10.0
        System.out.println("rectangle.area= " + rectangle.getArea()); // rectangle.area= 50.0

        lines();

        Cuboid cuboid = new Cuboid(5, 10, 5);

        System.out.println("cuboid.width= " + cuboid.getWidth()); // cuboid.width= 5.0
        System.out.println("cuboid.length= " + cuboid.getLength()); // cuboid.length= 10.0
        System.out.println("cuboid.area= " + cuboid.getArea()); // cuboid.area= 50.0
        System.out.println("cuboid.height= " + cuboid.getHeight()); // cuboid.height= 5.0
        System.out.println("cuboid.volume= " + cuboid.getVolume()); // cuboid.volume= 250.0

        lines();

//        Employee employee = new Employee(1, "Furkan", 15000);
//        System.out.println(employee);
//
//        lines();
//
//        employee.work();
//
//        lines();
//
//        HRManager hrManager = new HRManager(2, "Ozan", 30000);
//        System.out.println(hrManager);
//
//        lines();

//        hrManager.addEmployee(new MidDeveloper(3, "At", 50000));
//        System.out.println(hrManager);

    }

    public static void lines() {
        System.out.println("-----------------------");
    }
}