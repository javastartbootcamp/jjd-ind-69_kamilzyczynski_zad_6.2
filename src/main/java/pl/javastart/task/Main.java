package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        double[] array = arrayUtils.createArray();
        double sum = arrayUtils.calculateSum(array);

        System.out.printf("Suma kwadratów wprowadzonych liczb to %.0f", sum);
    }
}
