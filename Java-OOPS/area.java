public class area {
    public static void main(String[] args) {

        Circle cir = new Circle(4);
        Rectangle rt = new Rectangle(2, 6);
        Triangle tr = new Triangle(2, 3, 4);

        cir.display();
        rt.display();
        tr.display();

        System.out.println(cir.area());
        System.out.println(rt.area());
        System.out.println(tr.area());





    }
    public abstract static class Shape {
        abstract double area();

        void display() {
            System.out.println("This is a type of shape");
        }
    }
    public static class Circle extends Shape {

        double radius;
        Circle(double radius) {
            this.radius = radius;
        }
        @Override 
        double area() {

            return Math.PI * radius * radius;

        }
    }
    public static class Rectangle extends Shape {
        
        double length;
        double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double area() {
            return length * width;
        }
    }

    public static class Triangle extends Shape {
        double base;
        double height;
        double thirdSide;

        Triangle(double base, double height, double thirdSide) {
            this.base = base;
            this.height = height;
            this.thirdSide = thirdSide;
        }

        @Override
        double area() {
            return 0.5 * base * height;
        }
    }
}