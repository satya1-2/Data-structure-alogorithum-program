package algorithmProgram;

public class AlgorithmProgram {

    public static void main(String[] args) {
        System.out.println("After sorted string is : ");
        String[] array = {"Satya", "Kundan", "praveen", "Shubham", "Elam"};
        int count = 0;
        String sortedArray[] = sort_sub(array, array.length);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }

    public static String[] sort_sub(String array[], int number) {
        String string = "";
        for (int i = 0; i < number; i++) {
            for (int j = i + 1; j < number; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    string = array[i];
                    array[i] = array[j];
                    array[j] = string;
                }
            }
        }
        return array;
    }
}
