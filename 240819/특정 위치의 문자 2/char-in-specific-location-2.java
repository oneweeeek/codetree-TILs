import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String [] arr = new String[10];
        for(int i=0;i<10;i++){
            arr[i] = st.nextToken();
        }
        System.out.print(arr[1]+" "+arr[4]+" "+arr[7]);


    }
}