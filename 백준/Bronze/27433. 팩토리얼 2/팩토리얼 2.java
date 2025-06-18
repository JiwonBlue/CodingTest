import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n = 0;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        System.out.print(fac(n));
    } 
    
    static long fac(int a){
        if(a > 1)
            return a * fac(a - 1);
        else
            return 1;
    }
}
