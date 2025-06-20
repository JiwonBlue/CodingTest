import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[][] hun = new String[3][20];
        double sum = 0.0;
        double creditGrade = 0.0;
        double avg = 0.0;

        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 3; j++){
                hun[j][i] = sc.next();
            }
        }

        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 3; j++){
                if(!(hun[2][i]).equals("P")){
                    creditGrade += (getGradePoint(hun[2][i]) * Double.parseDouble(hun[1][i]));
                    sum += Double.parseDouble(hun[1][i]);
                }
            }
        }
        avg = creditGrade / sum;
        System.out.printf("%.6f\n", avg);
    }

    public static double getGradePoint(String grade) {
        switch(grade){
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F":  return 0.0;
            default:   return 0.0;
        }
    }
       
}