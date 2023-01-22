public class Main {
    public static void main(String[] args) {

        Double[] doubleArray = {1.1, 2.2, 3.3};
        Sum<Double> sum = new Sum<>();
        System.out.println(sum.sum(doubleArray));

        Integer[] integerArray = {1,2,3,4};
        Sum<Integer> sum1 = new Sum<>();
        System.out.println(sum1.sum(integerArray));

    }
}
