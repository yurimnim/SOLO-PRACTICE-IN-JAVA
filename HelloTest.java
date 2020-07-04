import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class HelloTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String greetings;
        System.out.println("Hello! Please input your greetings!");
        greetings = sc.nextLine().trim();
        greetings = greetings.toLowerCase();

        StringTokenizer st = new StringTokenizer(greetings);
        ArrayList<String> list = new ArrayList<>();   

        while(st.hasMoreTokens()) {
            String str = st.nextToken();
            list.add(str);
        }

        int cnt = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("hello")) {
                cnt++;
            }
        }

        System.out.println("You said hello to us " + cnt + " times");

    }
}