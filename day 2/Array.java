public class Array {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        double avg = sum /numbers.length;
        System.out.println("sum"+sum);
        System.out.println("avg"+avg);
        System.out.println("min"+min);
        System.out.println("max"+max);
    }
}
