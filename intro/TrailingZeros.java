import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TrailingZeros {
    public static void main(String[] args) throws java.lang.Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n=Integer.parseInt(br.readLine());
        int count=0;

        //5 contributes to 1 zero so 5 comes n/5 times in n numbers
        //25 contributes to 2 zeros so 25 comes n/25 times in n numbers
        //....

        // 5! = 5 * 4 * 3 * 2 * 1
        //10! = 10(==5*2) * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 //so in 1- numbers ince 5 is appearing 2 times we will get 2 zeros
        //each 5 will pair up with even number and realize a zero in one's place
        for(int m=5;m<=n;m*=5){
            count+=n/m;
        }
       
        pw.print(count);
        pw.close();
        br.close();
    }
}
