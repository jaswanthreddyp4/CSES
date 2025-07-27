
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TwoKnights {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int max_n = Integer.parseInt(br.readLine());

        for(int n=1;n<=max_n;n++){
            long sizeOfBoard = n*n; //nxn chess board
            long allPossbleWays = (sizeOfBoard*(sizeOfBoard-1))/2;//except same places 2 knights can stand at any place
            long badWays=0;
            badWays+=2*4;//2
            badWays+=3*8;//3
            badWays+=16*(n-3);//4
            badWays+=(n-4)*(n-4)*8;//8
            badWays+=(n-4)*12*2;//6
            badWays/=2;
            pw.println(allPossbleWays-badWays);
        }
        br.close();
        pw.close();
    }
}

// 2344444444432
// 3466666666643
// 4688888888864
// .............
// .............
// .............
// .............
// .............
// 3466666666643
// 2344444444432
