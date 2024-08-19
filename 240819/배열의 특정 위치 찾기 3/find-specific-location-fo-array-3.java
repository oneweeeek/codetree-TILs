import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int [] arr = new int[100];
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        int count = 0;
        // 문자열 토크나이저를 이용해 입력된 정수를 배열에 저장
        while (st.hasMoreTokens()) {
            arr[count++] = parseInt(st.nextToken());
        }
        for (int i = 0; i < count; i++) {
        	if (arr[i] == 0) {
                sum = arr[i-1] + arr[i-2] + arr[i-3];
                System.out.println(sum);
                break; // 첫 번째 0만을 기준으로 하기 때문에 루프 종료
        	}
        }
    }
}