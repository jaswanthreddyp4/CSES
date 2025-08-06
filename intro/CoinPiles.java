
import java.io.*;

public class CoinPiles {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        
        int t=Integer.parseInt(br.readLine());
        for(int test=1;test<=t;test++){
            String[] input = br.readLine().split(" ");
            long a = Long.parseLong(input[0]);
            long b = Long.parseLong(input[1]);

            //this greedy solution doesnt work because , time coomplexity of this is O(T*max(a,b))
            // a and b are itsel up to 10^9
            // while(a>0 && b>0){
            //     if(a>b){
            //         a-=2;
            //         b-=1;
            //     }else{
            //         a-=1;
            //         b-=2;
            //     }
            // }
            // if(a==0 && b==0){
            //     pw.println("YES");
            // }else{
            //     pw.println("NO");
            // }

            // The condition for the piles to be valid
            
            //if there is a more than double of one pile than the other pile then it is not possible to make them equal
            //if the sum of both piles is not divisible by 3 then it is not possible
            //so we can check these two conditions
            if ((a + b) % 3 == 0 && Math.min(a, b) * 2 >= Math.max(a, b)) {
                pw.println("YES");
            } else {
                pw.println("NO");
            }
        }
        pw.close();
        br.close();
    }
}
