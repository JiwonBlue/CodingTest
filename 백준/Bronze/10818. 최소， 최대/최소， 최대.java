import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;
        int min = 1000000;
        int max = -1000000;
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            m = sc.nextInt();
            if(max < m)
                max = m;
            if(min > m)
                min = m;
        }
        System.out.println(min + " " +max);
    }    
}