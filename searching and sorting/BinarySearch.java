
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class BinarySearch {
    //lojic of binary search is simple
    //if element is < middle element then element might be present in left so make right = mid-1
    //if element is > middle element then element might be present in right so make left = mid+1
    //if element is equal to middle element then return mid
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n=Integer.parseInt(br.readLine());
        String[] arr=br.readLine().split(" ");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(arr[i]);
        }
        int targetElement=10;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2; //to avoid overflow caused by left+right
            if(a[mid]==targetElement){
                pw.println("Element found at index: "+mid);
                pw.flush();
                return;
            }else if(a[mid]<targetElement){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        pw.close();
        br.close();
    }
}
