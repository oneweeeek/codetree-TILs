import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 수열의 길이 n을 입력받음
//        int n = parseInt(br.readLine().trim());
        
        int [] arr = new int[10];
        int sum = 0;
        int threeSum = 0;
        int cnt = 2;
        int count = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<10;i++) {
        	arr[i] = parseInt(st.nextToken());
        	if(i%2==1) {
        		sum += arr[i];
        	}
        	if(i==cnt) {
        		threeSum += arr[i];
        		cnt+=3;
        		count++;
        	}
        	
        }
        double avg = threeSum/count;
        System.out.println(sum+" "+avg);
    }
}