import java.util.ArrayList;
import java.util.Arrays;

public class DuckDuckGoose {
    public static String DuckDuckGoose(ArrayList letters, int k) {
        String space = "";
        int temp = 0;
        int i = 0;
        while (letters.size() > i) {
            if (k > 0) {
                temp += k;
                if (temp > letters.size()) {
                    temp -= letters.size();
                }
            }
            if (letters.get(temp - 1) != "_") {
                space = (String) letters.get(temp - 1);
                i++;
                letters.set(temp - 1, "_");
                System.out.println(letters.toString());
            }
            if (temp == 2){
                break;
            }
        }
        return space;
    }
}


