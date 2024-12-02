import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Training");

        int [] weights = {5, 65, 78, 87};
        weights [0] = 90;
        weights [3] = 6;
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

        int [] arr = {8, 81, 56, 59, 89};
        System.out.println(Arrays.toString(arr));
    }
}