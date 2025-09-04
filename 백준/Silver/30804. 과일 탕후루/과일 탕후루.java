import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        int[] tanghulu = new int[n];
        
        for(int i=0; i<n; i++){
            tanghulu[i] = sc.nextInt();
        }

        int [] window = new int[10];
        int fruitType = 0;
        int windowLeft = 0;       
        int answer = 0;

        for(int windowRight=0; windowRight<n; windowRight++){
            if(window[tanghulu[windowRight]]==0){
                fruitType += 1;
            }
            window[tanghulu[windowRight]]++;


            while(fruitType >2){
                window[tanghulu[windowLeft]]--;
                if (window[tanghulu[windowLeft]] == 0) {
                    fruitType--;
                }
                windowLeft++;
            }
            
            answer = Math.max(answer, windowRight - windowLeft + 1);
        }
        System.out.println(answer);
    }
}