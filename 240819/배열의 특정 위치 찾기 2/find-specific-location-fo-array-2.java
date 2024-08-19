import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[10];
        int evenSum =0;
        int oddSum = 0;
        for(int i=0;i<10;i++){
            arr[i] = parseInt(st.nextToken());
            if(i%2==1) {
            	oddSum+=arr[i];
            }else {
            	evenSum+=arr[i];
            }
        }
        int result = Math.abs(oddSum-evenSum);
        System.out.print(result);


    }
}