import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] s = new String[3];
        int gps = 0;
        for(int i=0; i<s.length; i++){
            s[i] = sc.nextLine();
        }
        if(isNumber(s[0]))
            gps = Integer.parseInt(s[0])+3;
        else if(isNumber(s[1]))
            gps = Integer.parseInt(s[1])+2;
        else
            gps = Integer.parseInt(s[2])+1;

        if((gps % 3 == 0) && (gps % 5 == 0))
            System.out.println("FizzBuzz");
        else if((gps % 3 == 0) && (gps % 5 != 0))
            System.out.println("Fizz");
        else if((gps % 3 != 0) && (gps % 5 == 0))
            System.out.println("Buzz");
        else
            System.out.println(gps);
    }

    public static boolean isNumber(String str) {
        if (str == null) return false;
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}