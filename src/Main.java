import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<String> checkList = new ArrayList<>(List.of("h", "a", "t"));

        List<String> list1 = new ArrayList<>(List.of("head", "black", "final", "art", "orange", "test", "hot"));
        System.out.println("initial list: " + list1);

        Predicate<String> prs = (a) -> {
            for (String s : checkList) {
                if (a.startsWith(s)) {
                    return true;
                }
            }
            return false;
        };

        list1.removeIf(prs);
        System.out.println("transformed list: " + list1);
    }
}
