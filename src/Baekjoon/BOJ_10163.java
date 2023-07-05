package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10163 {

	static StringTokenizer st;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] count = new int[n + 1]; 
		int[][] arr = new int[1001][1001]; 
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int width = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			
			for(int j = x; j < (x + width); j++) {
				for(int k = y; k < (y + height); k++) {
					arr[j][k] = i;
				}
			}
		}
		
		for(int i = 0; i < 1001; i++) {
			for(int j = 0; j < 1001; j++) {
				count[arr[i][j]]++;
			}
		}
		
		for(int i = 1; i <= n; i++) {
			System.out.println(count[i]);
		}
	}

}
