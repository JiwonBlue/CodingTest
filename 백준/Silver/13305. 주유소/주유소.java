import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int city = 0;
        city = sc.nextInt();
        int[] distance = new int[city-1];
        int[] cityMoney = new int[city];

        for(int i=0; i<city-1; i++){
            distance[i] = sc.nextInt();
        }

        for(int i=0; i<city; i++){
            cityMoney[i] = sc.nextInt();
        }

        int nowCityMoney = cityMoney[0];
        long buyOil = 0;

        for(int i=0; i<city-1; i++){
            if(cityMoney[i] < nowCityMoney){
                nowCityMoney = cityMoney[i];
            }
            buyOil += (long)nowCityMoney * distance[i];
        }

        System.out.println(buyOil);
    }
    
}