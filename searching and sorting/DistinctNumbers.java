
// import java.io.*;
// import java.util.Arrays;
// import java.util.StringTokenizer;

// public class DistinctNumbers{
//     public static void main(String[] args) throws java.lang.Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
//         int n=Integer.parseInt(br.readLine());
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         int[] a = new int[n];
//         for(int i = 0; i < n; i++){
//             a[i] = Integer.parseInt(st.nextToken());
//         }
//         Arrays.sort(a);
//         int count=0;
//         for(int i=1;i<n;i++){
//             if(a[i]!=a[i-1]){
//                 count++;
//             }
//         }
//         pw.print(count+1);
//         pw.close();
//         br.close();
//     }
// }
import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class DistinctNumbers {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(br.readLine());
        
        // Use a HashSet to automatically handle uniqueness
        HashSet<Integer> distinctValues = new HashSet<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            distinctValues.add(Integer.parseInt(st.nextToken()));
        }

       
        pw.print(distinctValues.size());
        
        pw.close();
        br.close();
    }
}