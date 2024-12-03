import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Task number 1");

        int [] firstArr = new int[3];
        firstArr [0] = 1;
        firstArr [1] = 2;
        firstArr [2] = 3;

        float [] secondArr = {1.57f, 7.654f, 9.986f};

        int [] thirdArr = {7, 9, 59, 84, 65};

        System.out.println();
        System.out.println("Task number 2");

        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] == firstArr[2]) {
                System.out.print(firstArr[i]);
                break;
            }
            System.out.print(firstArr[i] + ", ");
        }

        System.out.println();

        for (int r = 0; r < secondArr.length; r++) {
            if (secondArr[r] == secondArr[2]) {
                System.out.print(secondArr[r]);
                break;
            }
            System.out.print(secondArr[r] + ", ");
        }

        System.out.println();

        for (int c = 0; c < thirdArr.length; c++) {
            if (thirdArr[c] == thirdArr[4]) {
                System.out.print(thirdArr[c]);
                break;
            }
            System.out.print(thirdArr[c] + ", ");
        }

        System.out.println();
        System.out.println("Task number 3");

        for (int i = firstArr.length - 1; i >= 0; i--) {
            if (firstArr[i] <= firstArr[0]) {
                System.out.print(firstArr[i]);
                break;
            }
                System.out.print(firstArr[i] + ", ");
        }

        System.out.println();

        for (int r = secondArr.length - 1; r >= 0; r--) {
            if (secondArr[r] <= secondArr[0]) {
                System.out.print(secondArr[r]);
                break;
            }
            System.out.print(secondArr[r] + ", ");
        }

        System.out.println();

        for (int c = thirdArr.length - 1; c >= 0; c--) {
            if (thirdArr[c] == thirdArr[0]) {
                System.out.print(thirdArr[c]);
                break;
            }
            System.out.print(thirdArr[c] + ", ");
        }

        System.out.println();
        System.out.println("Task number 4");

        for (int a = 0; a < firstArr.length; a++) {
            if (firstArr[a] % 2 ==  1) {
                firstArr[a]++;
            }
            System.out.println(firstArr[a]);
        }
    }
}