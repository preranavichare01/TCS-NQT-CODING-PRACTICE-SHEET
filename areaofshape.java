import java.util.Scanner;

public class areaofshape {
    private static final float PI = 3.14159f;

    public static void area(float r) {
        float res = PI * r * r;
        System.out.println("Area of circle: " + res);
    }

    public static void area(int a, int b) {
        float res = 0.5f * a * b;
        System.out.println("Area of triangle: " + res);
    }

    public static void area(float a, float b) {
        float res = a * b;
        System.out.println("Area of rectangle: " + res);
    }

    public static void area(int a) {
        float res = a * a;
        System.out.println("Area of square: " + res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------options----------------");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");
        System.out.println("Enter your option:");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Enter radius:");
                float r = sc.nextFloat();
                area(r);
                break;
            case 2:
                System.out.println("Enter length and breadth:");
                float l = sc.nextFloat();
                float b = sc.nextFloat();
                area(l, b);
                break;
            case 3:
                System.out.println("Enter base and height:");
                int base = sc.nextInt();
                int height = sc.nextInt();
                area(base, height);
                break;
            case 4:
                System.out.println("Enter side:");
                int side = sc.nextInt();
                area(side);
                break;
            default:
                System.out.println("Invalid option");
        }

        sc.close();
    }
}
