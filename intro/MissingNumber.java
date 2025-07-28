import java.io.*;
import java.util.StringTokenizer;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        long totalSum = (long) n * (n + 1) / 2;
        long arraySum = 0;

        for (int i = 0; i < n - 1; i++) {
            arraySum += Integer.parseInt(st.nextToken());
        }

        pw.println(totalSum - arraySum);
        pw.close();
        br.close();
    }
}