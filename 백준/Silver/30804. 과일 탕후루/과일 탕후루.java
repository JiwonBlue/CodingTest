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

        int [] fruitCountByType = new int[10];
        int fruitType = 0;
        int left = 0;       
        int answer = 0;

        for(int right=0; right<n; right++){
            if(fruitCountByType[tanghulu[right]]==0){
                fruitType += 1;
            }
            fruitCountByType[tanghulu[right]]++;


            while(fruitType >2){
                fruitCountByType[tanghulu[left]]--;
                if (fruitCountByType[tanghulu[left]] == 0) {
                    fruitType--;
                }
                left++;
            }
            
            answer = Math.max(answer, right - left + 1);
        }
        System.out.println(answer);
    }
}