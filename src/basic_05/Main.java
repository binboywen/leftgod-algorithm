package basic_05;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] m = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                m[i][j] = sc.nextInt();
            }
        }

        for(int i = 0, j = 0; j < cols; j++){
            infect(m,i,j,rows,cols);
        }
        for(int i = 0, j = 0; i < rows; i++){
            infect(m,i,j,rows,cols);
        }
        for(int i = 0, j = cols - 1; i < rows; i++){
            infect(m,i,j,rows,cols);
        }
        for(int i = rows - 1, j = 0; j < cols; j++){
            infect(m,i,j,rows,cols);
        }

        int res = countIslands(m);
        System.out.println(res);
    }
    public static int countIslands(int[][] m) {
        if (m == null || m[0] == null) {
            return 0;
        }
        int N = m.length;
        int M = m[0].length;
        int res = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (m[i][j] == 1) {
                    res++;
                    infect(m, i, j, N, M);
                }
            }
        }
        return res;
    }

    public static void infect(int[][] m, int i, int j, int N, int M) {
        if (i < 0 || i >= N || j < 0 || j >= M || m[i][j] != 1) {
            return;
        }
        m[i][j] = 2;
        infect(m, i + 1, j, N, M);
        infect(m, i - 1, j, N, M);
        infect(m, i, j + 1, N, M);
        infect(m, i, j - 1, N, M);
    }
}
