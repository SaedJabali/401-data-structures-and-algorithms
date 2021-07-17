import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ChApp {
    public static void main(String[] args) {
        System.out.println("ok");
        DuckDuckGoose game = new DuckDuckGoose();

        String[] letters={"A","B","C","D","E"};
        ArrayList list = new ArrayList(Arrays.asList(letters));

        game.DuckDuckGoose(list,3);
//        System.out.println(list.toString());
        System.out.println(game.DuckDuckGoose(list,3));
    }

}
