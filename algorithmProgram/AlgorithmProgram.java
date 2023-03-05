package algorithmProgram;

public class AlgorithmProgram {

    void mergeSort(int arr[], int l, int m, int r) {
        // Find sizes of two subArrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int Left[] = new int[n1];
        int Right[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            Left[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            Right[j] = arr[m + 1 + j];

        // Initial indexes of first and second subArrays
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    void sort(int array[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(array, l, m);
            sort(array, m + 1, r);

            // Merge the sorted halves
            mergeSort(array, l, m, r);
        }
    }

    static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int array[] = {12, 11, 13, 5, 6, 7, 23, 45, 46};

        System.out.println("Given Array");
        printArray(array);

        AlgorithmProgram ob = new AlgorithmProgram();
        ob.sort(array, 0, array.length - 1);

        System.out.println("\nSorted array");
        printArray(array);
    }
}

