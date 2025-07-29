import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Sets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(br.readLine());

        long totalSum = (long) n * (n + 1) / 2;

        if (totalSum % 2 != 0) {
            pw.println("NO");
        } else {
            pw.println("YES");
            
            long targetSum = totalSum / 2;
            List<Integer> set1 = new ArrayList<>();
            List<Integer> set2 = new ArrayList<>();
            
            boolean[] used = new boolean[n + 1];

            for (int i = n; i >= 1; i--) {
                if (i <= targetSum) {
                    set1.add(i);
                    used[i] = true;
                    targetSum -= i;
                }
            }
            for (int i = 1; i <= n; i++) {
                if (!used[i]) {
                    set2.add(i);
                }
            }

            pw.println(set1.size());
            for (int num : set1) {
                pw.print(num + " ");
            }
            pw.println();

            pw.println(set2.size());
            for (int num : set2) {
                pw.print(num + " ");
            }
            pw.println();
        }

        pw.close();
        br.close();
    }
}