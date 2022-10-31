public class Main {
    public static void main(String[] args) {

        task1();

    }

    private static void task1() {
        System.out.println("Часть1. Задание 1:");

        PhoneBook phone = new PhoneBook();
        for (int i = 0; i < 20; i++) {
            phone.putPhone("Иван Иванов"+i, "895220941"+i);
        }

        System.out.println(phone);
    }
}