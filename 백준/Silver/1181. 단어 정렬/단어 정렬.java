import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        sc.nextLine();
        Set<String> ss = new HashSet<>();
        for(int i=0; i<n; i++){
            ss.add(sc.nextLine());
        }

        List<String> ls = new ArrayList<>(ss);
        Collections.sort(ls, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                if(a.length() != b.length())
                    return a.length() - b.length();
                return a.compareTo(b);
            }
        });

        for(int word=0; word < ls.size(); word++){
            System.out.println(ls.get(word));
        }
    }
}