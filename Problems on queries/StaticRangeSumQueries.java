
import java.io.*;
import java.util.*;

public class StaticRangeSumQueries {

    public static void main(String[] args) throws IOException {
        // Use BufferedReader for faster input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read n and q
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        // Read array elements
        long[] nums = new long[n];
        st = new StringTokenizer(br.readLine()); // Read the entire line
        for (int i = 0; i < n; i++) {
            nums[i] = Long.parseLong(st.nextToken());
        }

        // Compute prefix sums
        long[] prefixSumArray = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSumArray[i] = prefixSumArray[i - 1] + nums[i - 1];
        }

        // Prepare output using StringBuilder
        StringBuilder sb = new StringBuilder();

        // Process queries
        for (int i = 0; i < q; i++) {
            // Read a and b
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // Compute and append the result
            sb.append(prefixSumArray[b] - prefixSumArray[a - 1]).append('\n');
        }

        // Print the results in one go
        System.out.print(sb);
    }
}
