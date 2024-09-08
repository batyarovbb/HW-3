public class HW3 {
    public static void main(String[] args) {
        double[] array = new double[15];

        array[0] = 8.5;
        array[1] = 2.3;

        for (int i = 2; i < array.length; i++) {
            array[i] = Math.random() * 20 - 10; // Генерация числа от -10 до 10
        }

        System.out.print("Массив: ");
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        double sumPositive = 0;
        int countPositive = 0;

        boolean negativeFound = false;

        for (double num : array) {
            if (num < 0) {
                negativeFound = true;
            } else if (negativeFound && num > 0) {
                sumPositive += num;
                countPositive++;
            }
        }

        if (countPositive > 0) {
            double average = sumPositive / countPositive;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("Положительных чисел после первого отрицательного не найдено.");
        }
    }
}


