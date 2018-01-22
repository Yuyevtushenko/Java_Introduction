package homeWorks.homeWorkThird;

public class Task2HWThird {
    public static void main(String[] args) {
        int arr[] = new int[8];

        System.out.print("Массив рандомных чисел: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (10 - 1) + 1) + 1;
            System.out.print("[" + arr[i] + "]");
        }

        System.out.println();
        System.out.print("Новый массив:");

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
            System.out.print("[" + arr[i] + "]");
        }
    }
}
