import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int v = 0;
        int count = 0;

        n = sc.nextInt();
        int [] m = new int[n];
        for(int i = 0; i < n ; i++){
            m[i] = sc.nextInt();
        }
        v = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(m[i] == v)
                count++;
        }
        System.out.print(count);
    }
}