import java.util.Random;

 class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random random = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        // get method from SafeInput class
        SafeInput.ArrayProj(dataPoints);
    }
}