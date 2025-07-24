import java.io.*;

public class Permutations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(br.readLine());

        if (n == 2 || n == 3) {
            pw.print("NO SOLUTION");
        }
        else if (n == 1) {
            pw.print(1);
        }
        else {

            for (int i = 2; i <= n; i += 2) {
                pw.print(i + " ");
            }

            for (int i = 1; i <= n; i += 2) {
                pw.print(i + " ");
            }
        }

        pw.println();
        pw.close();
        br.close();
    }
}