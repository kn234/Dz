public class Dz1 {
    public static int abcd(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean ten_twelve(int a, int b) {
        return ((20 - a - b) < 10) && ((20 - a - b) >= 0);
    }

    public static void subzero(int num) {
        if (num < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }
    }

    public static boolean ifSubzero(int num) {
        return num < 0;
    }

    public static void helloName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static boolean visokosYear(int num) {
        if (num % 4 == 0) {
            if (num % 100 == 0) {
                if (num % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        byte b = 123;
        short s = 12345;
        int num = 0;
        boolean flag = false;
        long num1 = 255255252;
        float f = 123.45f;
        double d = 123.456;
        char ch = 'a';
        System.out.println(abcd(4, 5, 6, 7));
        System.out.println(ten_twelve(10, 5));
        subzero(-5);
        System.out.println(ifSubzero(-5));
        helloName("Игнат");
        System.out.println(visokosYear(400));
        System.out.println(visokosYear(100));
        System.out.println(visokosYear(32));
        System.out.println(visokosYear(3));
    }
}