import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] input = br.readLine().split(" ");
            
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            if (a == 0 && b == 0 && c == 0) break;

            int big = 0;

            big = Math.max(a,Math.max(b,c));

            int x, y;

            if (big == a) {
                x = b; 
                y = c;
            } else if (big == b) {
                x = a; 
                y = c;
            } else {
                x = a; 
                y = b;
            }

            if((big*big) == (x*x)+(y*y)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }
}