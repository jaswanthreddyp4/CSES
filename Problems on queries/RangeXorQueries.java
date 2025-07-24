
import java.io.*;
import java.util.*;

public class RangeXorQueries {

    public static void main(String[] args) throws IOException {

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

        //pre process xor values
        long[] prefXor = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefXor[i] = nums[i - 1] ^ prefXor[i - 1];
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
            sb.append(prefXor[b] ^ prefXor[a - 1]).append('\n');
        }

        System.out.print(sb);
    }
}
