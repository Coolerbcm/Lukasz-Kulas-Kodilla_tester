import java.util.Random;
public class RandomNumbers {
    private static final int maximumValue = 30;
    private static final int maximumSum = 5000;

    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int count = 0;

        while (sum <= maximumSum) {
            int randomNumber = random.nextInt(maximumValue + 1);
            sum += randomNumber;

            if (randomNumber > maxValue) {
                maxValue = randomNumber;
            }

            if (randomNumber < minValue) {
                minValue = randomNumber;
            }
            count++;
        }

        System.out.println("The highest number : " + maxValue);
        System.out.println("The lowest number : " + minValue);
            }
}