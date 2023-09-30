public class BubbleSort {

    public static void main(String[] args) {

        int[] input = {22,55,84,54,548,841,54,44};

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                if (input[i] < input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }

            }

        }

        System.out.println("Bubble Sort : Sorted List");

        for (int i = 0; i < 10; i++) {
            System.out.println(input[i]);
        }

    }

}
