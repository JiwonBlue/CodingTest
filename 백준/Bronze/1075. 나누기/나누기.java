import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int f = 0;
        n = sc.nextInt();
        f = sc.nextInt();
        int result = 0;

        result = (n/100) * 100;
        for(int i = 0; i < 100; i++){
            if((result+i) % f == 0){
                result = i;
                break;
            }
        }
        System.out.printf("%02d", result);
    }
}