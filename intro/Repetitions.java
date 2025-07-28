import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Repetitions {
    int maxLength(String s){
        if(s.length()==1){
            return 1;
        }
        int maxCount=1;
        int currentCount=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                currentCount++;
            }else{
                maxCount=Math.max(maxCount,currentCount);
                currentCount=1;
            }
        }
        return Math.max(maxCount, currentCount);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(new BufferedWriter(new OutputStreamWriter((System.out))));
        
        String dna=br.readLine();
        Repetitions repetitions = new Repetitions();
        int result = repetitions.maxLength(dna);
        pw.println(result);
        pw.close();
        

    }
}
