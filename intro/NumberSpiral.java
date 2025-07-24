import java.io.*;
import java.util.StringTokenizer;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long row = Long.parseLong(st.nextToken());
            long col = Long.parseLong(st.nextToken());

            long result;
            long layer = Math.max(row, col);
            long prevLayerCorner = (layer - 1) * (layer - 1);

            // FIX 3: Correct logic based on layer parity
            if (layer % 2 != 0) { // If layer is ODD
                if (col == layer) { // Right edge
                    result = layer * layer - row + 1;
                } else { // Bottom edge
                    result = prevLayerCorner + col;
                }
            } else { // If layer is EVEN
                if (row == layer) {
                    result = layer * layer - col + 1;
                } else {
                    result = prevLayerCorner + row;
                }
            }

            pw.print(result+" ");
        }

        pw.close();
        br.close();
    }
}