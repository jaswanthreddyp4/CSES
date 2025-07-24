import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Labyrinth {


        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            char[][] mat = new char[m][n];

            for (int i = 0; i < m; i++) {
                // Read a full line of n characters
                String row = br.readLine();
                // Fill the row into the char[][] array
                for (int j = 0; j < n; j++) {
                    mat[i][j] = row.charAt(j);
                }
            }
//            System.out.println(bfs(mat));
        }

}
