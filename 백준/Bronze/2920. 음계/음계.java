import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            a.add(sc.nextInt());
        }
        if(ascending(a))
            System.out.print("ascending");  
        else if(descending(a))
            System.out.print("descending");
        else 
            System.out.print("mixed");
        
    }

    static boolean ascending(ArrayList<Integer> a){
        for(int i=0; i<a.size()-1; i++){
            if(a.get(i)+1 != a.get(i+1))
                return false;
        }
        return true;
    }

    static boolean descending(ArrayList<Integer> a){
        for(int i=0; i<a.size()-1; i++){
            if(a.get(i)-1 != a.get(i+1))
                return false;
        }
        return true;
    }
}