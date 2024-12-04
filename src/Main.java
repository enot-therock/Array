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
            if (i == firstArr.length - 1) {
                System.out.print(firstArr[i]);
                break;
            }
            System.out.print(firstArr[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < secondArr.length; i++) {
            if (i == secondArr.length - 1) {
                System.out.print(secondArr[i]);
                break;
            }
            System.out.print(secondArr[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < thirdArr.length; i++) {
            if (i == thirdArr.length - 1) {
                System.out.print(thirdArr[i]);
                break;
            }
            System.out.print(thirdArr[i] + ", ");
        }

        System.out.println();
        System.out.println("Task number 3");

        for (int i = firstArr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(firstArr[i]);
                break;
            }
                System.out.print(firstArr[i] + ", ");
        }

        System.out.println();

        for (int i = secondArr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(secondArr[i]);
                break;
            }
            System.out.print(secondArr[i] + ", ");
        }

        System.out.println();

        for (int i = thirdArr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(thirdArr[i]);
                break;
            }
            System.out.print(thirdArr[i] + ", ");
        }

        System.out.println();
        System.out.println("Task number 4");

        for (int a = 0; a < firstArr.length; a++) {
            if (firstArr[a] % 2 != 0) {
                firstArr[a]++;
            }
            System.out.println(firstArr[a]);
        }
    }
}