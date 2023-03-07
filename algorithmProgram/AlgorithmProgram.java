package algorithmProgram;

import java.util.*;

public class AlgorithmProgram {

    static void executeProcesses(int A[], int N, int K) {
        // Stores all the array elements
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Push all the elements to the
        // priority queue
        for (int i = 0; i < N; i++) {
            pq.add(A[i]);
        }

        // Stores the required result
        int ans = 0;

        // Loop while the queue is not
        // empty and K is positive
        while (!pq.isEmpty() && K > 0) {

            // Store the top element
            // from the pq
            int top = pq.poll();


            // Add it to the answer
            ans++;

            // Divide it by 2 and push it
            // back to the pq
            K = K - top;
            top = top >> 1;
            pq.add(top);
        }

        // Print the answer
        System.out.println(ans);
    }

    public static void main(String[] args) {

        int A[] = {3, 1, 7, 4, 2};
        int K = 15;
        int N = A.length;
        executeProcesses(A, N, K);

    }
}

