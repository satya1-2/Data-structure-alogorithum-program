package algorithmProgram;

public class AlgorithmProgram {

    public void performBubbleSort(int[] array) {
        int number = array.length;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < j - i - 1; j++) {
                if (array[j] >= array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    temp = array[j + 1];
                }

            }
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        AlgorithmProgram bubble = new AlgorithmProgram();
        int[] array = {12, 23, 34, 55, 6, 7, 78, 98};
        bubble.performBubbleSort(array);
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "  ");
        }
    }
}
