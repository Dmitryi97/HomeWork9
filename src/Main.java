import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
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
        //Вывел массив для себя)
        Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));
        //Задача1
        System.out.println("Задача1");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        int sum = 0;
        for (final int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + numberFormat.format(sum));
        //Задача2
        System.out.println("Задача2");
        int maxSumSpending = 0;
        int minSumSpending = 300_000;
        for (final int current : arr) {
            if (current < minSumSpending) {
                minSumSpending = current;
            }
        }
        for (final int current : arr) {
            if (current > maxSumSpending) {
                maxSumSpending = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + numberFormat.format(minSumSpending) + ". Максимальная сумма трат за день составила " + numberFormat.format(maxSumSpending));
        //Задача3
        System.out.println("Задача3");
        double averageAmount = sum / 30;
        System.out.println(" Средняя сумма трат за месяц составила " + numberFormat.format(averageAmount));
        //Задача4
        System.out.println("Задача4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}