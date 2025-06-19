import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        n = sc.nextInt();
        
        int start = 0;
        int end = 0;
        int count = 0;
        int countEnd = 0;
        List<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            start = sc.nextInt();
            end = sc.nextInt();
            meetings.add(new Meeting(start, end)); 
        }

        meetings.sort((a, b) -> {
            if (a.end != b.end) return a.end - b.end;
            return a.start - b.start;
        });
        
        for(int i = 0 ; i < meetings.size(); i++ ){
            if(meetings.get(i).start >= countEnd){
                count++;
                countEnd = meetings.get(i).end;
            }

        }
        System.out.println(count);
    }
}

class Meeting {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}