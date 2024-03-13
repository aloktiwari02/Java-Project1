package Assignment2;
import java.util.ArrayList;

public class ReverseMain {
    public static void main(String[] args) {

        ArrayList<String> OriginalStr = new ArrayList<>();
        int result = 0;
        String ReversedStr = "";

        OriginalStr.add("apple");
        OriginalStr.add("banana");
        OriginalStr.add("cherry");
        OriginalStr.add("date");

        System.out.println(OriginalStr);

        result = OriginalStr.size();
        for(int i=result-1; i>=0; i--){
            ReversedStr = ReversedStr + OriginalStr.get(i)+" ";
        }
        System.out.println(ReversedStr);
    }

}
