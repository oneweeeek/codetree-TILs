import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int [10];
        for(int i=0;i<10;i++){
            arr[i] = parseInt(st.nextToken());
        }
        int ans = arr[2]+arr[4]+arr[9];
        System.out.print(ans);
    }
}