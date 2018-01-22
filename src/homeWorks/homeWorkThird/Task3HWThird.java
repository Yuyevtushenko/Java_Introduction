package homeWorks.homeWorkThird;

public class Task3HWThird {
    public static void main(String[] args) {
        int[] arr = new int[12];
        int max = arr[0];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (15 - (-15)) + 1) + (-15);
            System.out.print("["+arr[i] + "]");
        }

        System.out.println();

        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.print("Максимальное число: " + max + " Его индекс: " + maxIndex);

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] == max) && (i != maxIndex)) {
                System.out.print(" и " + i);
            }
        }
    }

}
