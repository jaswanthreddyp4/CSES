// for n sized array elements there are n^2 intervals possible ofc we cant keep track min in all these intervals
// for powers of 2 starting from 1,2,4,8,16...... i need to know minimum in every interval of these numbers
// store arrays of minima for intervals of power of 2 (1,2,4,8,16,32...)

// 0 1 2 3 4 5 6 7 8 9 10 11 12
// min[3][pow=8]=Math.min(min[3][pow=4],min[7][pow=8])
// min[3][3]=Math.min(min[3][2] , min[7][2])
//final formulea
// min[i][j]=Math.min(min[i][j-1],min[i+(1<<(j-1))][j-1])
// for(int j=1;j<log(n);j++){
//     for(int i=0;i+(1<<(j))-1<n;i++){
//           }
//   }
// l,r is given
// interval length len=r-l+1
// j=log2(len)
// l,r is given then ans=min(min[l][j],min[r-(1<<j)+1][j])
import java.io.*;

public class RangeMinQueries {

    static final int MAX_N = 200005;
    static final int LOG = 18;
    static int[] a = new int[MAX_N];
    static int[][] m = new int[MAX_N][LOG]; // m[i][j] is the minimum among a[i...i + 2^j - 1]

    static int query(int L, int R) {
        int length = R - L + 1;
        int k = 31 - Integer.numberOfLeadingZeros(length);
        return Math.min(m[L][k], m[R - (1 << k) + 1][k]);
    }

    public static void main(String[] args) throws IOException {
        // Use BufferedReader for faster input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Use PrintWriter for faster output
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        // 1) Read input
        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int q = Integer.parseInt(tokens[1]);

        tokens = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(tokens[i]);
            m[i][0] = a[i];
        }

        // 2) Preprocessing
        for (int k = 1; k < LOG; k++) {
            for (int i = 0; i + (1 << k) <= n; i++) {
                m[i][k] = Math.min(m[i][k - 1], m[i + (1 << (k - 1))][k - 1]);
            }
        }

        // 3) Answer queries
        for (int i = 0; i < q; i++) {
            tokens = br.readLine().split(" ");
            int L = Integer.parseInt(tokens[0]) - 1; // Adjust for 0-based indexing
            int R = Integer.parseInt(tokens[1]) - 1;
            out.println(query(L, R));
        }

        out.flush();
        out.close();
    }
}
