import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int coinCount = 0;
        int apple = 0;
        int gridCount = 0;
        coinCount = sc.nextInt();
        apple = sc.nextInt();
        int [] coinValue = new int[coinCount];

        for(int i=0; i<coinCount; i++){
            coinValue[i] = sc.nextInt();
        }

        for(int i=coinCount-1; i>=0; i--){
            if(coinValue[i] > apple) continue;
            
            gridCount += (apple/coinValue[i]);
            apple = (apple%coinValue[i]);
            

            if(apple == 0 ) break;
        }
        System.out.print(gridCount);
    }
}