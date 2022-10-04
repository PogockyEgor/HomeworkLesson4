import java.util.Scanner;

public class HomeworkLesson4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int array[] = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        int max = array[0];
        int min = array[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        System.out.println(min + " " + max);
        System.out.println(indexMin + " " + indexMax);
        int amount = 0;
        for (int x : array) {
            if (x == 0) {
                amount++;
            }
        }
        if (amount == 0) {
            System.out.println("Нулевых элементов нет");
        } else {
            System.out.println("Количество нулевых элементов - " + amount);
        }
        System.out.println();
        int arrayValue = 0;
        for (int i = 0; i < (array.length / 2); i++) {
            arrayValue = array[i];
            array[i] = array[(array.length - i) - 1];
            array[(array.length - i) - 1] = arrayValue;
        }
        for (int x : array) {
            System.out.println(x);
        }
        boolean logical = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                logical = true;
            }
        }
        if (logical) {
            System.out.println("Последовательность чисел не является возрастающей");
        } else {
            System.out.println("Последовательность чисел является возрастающей");
        }

    }
}