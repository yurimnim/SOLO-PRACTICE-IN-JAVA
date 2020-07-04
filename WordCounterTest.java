import java.util.ArrayList;
import java.util.Scanner;

class WordCounterTest {

    public static int Counter(String inputm, String ctd) {
        int cnt = 0;
        String trimed = inputm.replace(" ", "");
        int ctdlen = ctd.length();

        
        for (int i = 0; i < inputm.length(); i++) {
            if (i + ctdlen > trimed.length()) {
                break;
            }
            String trimed2 = trimed.substring(i, i + ctdlen);
            if (trimed2.equals(ctd)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Input words or sentences to count.");
        input = sc.nextLine();
        input = input.toLowerCase();

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        String[] arr = input.split(" ");

        for(int i=0;i<arr.length; i++){
            list.add(arr[i]);
        }

        for(int i=0;i<list.size();i++) {
            if(!list2.contains(list.get(i))){
                list2.add(list.get(i));
            }
        }

        System.out.println("Your input: " + list);
        System.out.println("Words to be counted: " + list2);

        for(int i=0; i<list2.size();i++){
            String cnted = list2.get(i);
            int result = Counter(input, cnted);
            System.out.println(list2.get(i)+ ": " + result);
        }
    }
}