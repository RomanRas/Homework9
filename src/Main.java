import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        //Задача 1
        System.out.println("Задача 1");
        int sum = 0;
        for (int element: arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.\n");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        //Задача 2
        System.out.println("Задача 2");
        int min = 200_000;
        int max = 0;
        for (int element:arr) {
            if (min > element) {
                min = element;
            }
        }
        for (int element:arr) {
            if (max < element) {
                max = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей.\n");
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        //Задача 3
        System.out.println("Задача 3");
        int sum = 0;
        double averageSpending = 0;
        for (int element:arr) {
            sum += element;
        }
        averageSpending = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей.\n");
    }
    public static void task4() {
        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char placeHolder = ' ';
        int halfArray = reverseFullName.length / 2;
        for (int i = 0; i <= halfArray; i++) {
            placeHolder = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = placeHolder;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}