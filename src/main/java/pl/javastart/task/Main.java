package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        double[] array = arrayUtils.createArray();
        arrayUtils.calculateSum(array);
    }
}
