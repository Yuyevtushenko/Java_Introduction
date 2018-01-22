package homeWorks.homeWorkThird;

public class Task1HWThird {
    public static void main(String[] args) {

        int arr[] = new int[15];
        int evenNumbers = 0;

        System.out.print("Массив рандомных чисел: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print("[" + arr[i] + "]");
            if (arr[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.println();
        System.out.print("Количество четных чисел: " + evenNumbers);
    }

}

