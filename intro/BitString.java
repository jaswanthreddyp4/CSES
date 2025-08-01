import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class BitString {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n=Integer.parseInt(br.readLine());
        int ans=1;
        int modulo=(int)1e9+7;
        for(int i=1;i<=n;i++){
            ans=(ans*2)%modulo;
        }
        pw.print(ans%modulo);
        pw.close();
        br.close();
    }
}
