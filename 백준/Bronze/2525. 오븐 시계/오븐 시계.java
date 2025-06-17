import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = 0;
        int m = 0;
        int cook = 0;
        h = sc.nextInt();
        m = sc.nextInt();
        cook = sc.nextInt();

        h += (cook/60);
        m += (cook%60);
        if (m >= 60){
            m = m - 60;
            h = h + 1;
        }
        if (h >= 24)
            h = h - 24;
        System.out.print(h + " ");
        System.out.print(m);
    }
}