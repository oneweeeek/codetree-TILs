import java.util.*;
import java.io.*;
import static java.lang.Integer.*;

public class Main {
	static int[][] arr;
	static int[][] ball;
	static int n, m, t;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int[][] next;
	static void move() {
		next = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (ball[i][j] == 1) {
					check(i, j);
					ball[i][j] -= 1;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ball[i][j] += next[i][j];
				if (ball[i][j] >= 2) {
					m -= ball[i][j];
					ball[i][j] = 0;
				}
			}
		}
	}

	static void check(int x, int y) {
		
//		int max = arr[ci][cj];
//		int maxi = ci;
//		int maxj = cj;
		int max = MIN_VALUE;
		int indexX = 0;
		int indexY = 0;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (valid(nx, ny)) {
				if (arr[nx][ny] > max) {
					max = arr[nx][ny];
					indexX = nx;
					indexY = ny;
				}
			}
		}

		next[indexX][indexY] += 1;
	}

	static boolean valid(int x, int y) {
		return 0 <= x && x < n && 0 <= y && y < n;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = parseInt(st.nextToken());
		m = parseInt(st.nextToken());
		t = parseInt(st.nextToken());

		arr = new int[n][n];
		ball = new int[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = parseInt(st.nextToken()) - 1;
			int y = parseInt(st.nextToken()) - 1;
			ball[x][y] += 1;
		}

		for (int i = 0; i < t; i++) {
			move();
		}
		System.out.println(m);
	}
}