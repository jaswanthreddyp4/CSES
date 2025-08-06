import java.io.*;

public class PalindromeReorder {
    //so idea is to 1st store all the characters in the frequency array
    //iterate through each freq and check any odd freq exists
    //note that there cannot be 2 letters with odd frequency so count it 
    //if count of odd frq ?1 then no solution , 
    //else1st half will be all letters /2
    //2nd half will be reverse of 1st half
    //if odd count is 1 then middle character will be the one with odd frequency and we already have this odd character 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));


        String s = br.readLine();

       
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'A']++;
        }

        int oddCount = 0;
        char middleChar = ' ';
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
                middleChar = (char) ('A' + i);
            }
        }

        if (oddCount > 1) {
            pw.println("NO SOLUTION");
        } else {
           
            StringBuilder firstHalf = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < freq[i] / 2; j++) {
                    firstHalf.append((char) ('A' + i));
                }
            }

            String secondHalf = new StringBuilder(firstHalf).reverse().toString();
            
            if (oddCount == 1) {
                pw.println(firstHalf.toString() + middleChar + secondHalf);
            } else { 
                pw.println(firstHalf.toString() + secondHalf);
            }
        }

        pw.close();
        br.close();
    }
}