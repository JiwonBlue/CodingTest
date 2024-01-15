import java.util.*;
public class Main{
	public static void main(String args[]){
		int N, M;
        int[][] A = new int[100][100];
        int[][] B = new int[100][100];
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); 
        M = sc.nextInt();
        for(int i = 0; i < N; i++) { 
            for(int j = 0; j < M; j++) {              
                A[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N; i++) { 
            for(int j = 0; j < M; j++) {               
                B[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j <M; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
	}
}