package pl.javastart.task;

import java.util.Scanner;

public class ArrayUtils {
    Scanner scanner = new Scanner(System.in);

    double[] createArray() {
        System.out.println("Podaj rozmiar tablicy: ");
        int number = scanner.nextInt();
        double[] array = new double[number];
        System.out.printf("Wprowadź %d liczb:\n", number);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }

    void calculateSum(double[] array) {
        double sum = 0;
        for (double v : array) {
            sum += Math.pow(v, 2);
        }
        System.out.printf("Suma kwadratów wprowadzonych liczb to %.0f", sum);
    }
}
