public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        stroll(30, 0);
        stroll(2, 45);
        stroll(14, 12);
        stroll(45, -4);
        stroll(7, -30);


    }

    public static void stroll(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature <= 28 && temperature >= 0) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temperature <= 25 && temperature >= -10) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");

        }
    }
}







