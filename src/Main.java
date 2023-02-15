import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<String> checkList = new ArrayList<>(List.of("h", "a", "t"));

        List<String> list1 = new ArrayList<>(List.of("head", "black", "final", "art", "orange", "test", "hot"));
        System.out.println("initial list: " + list1);

        for (int i = 0; i < checkList.size(); i++) {
            int iFinal = i;
            Predicate<String> prs = (a) -> a.startsWith(checkList.get(iFinal));
            list1.removeIf(prs);
        }

        System.out.println("transformed list: " + list1);
    }
}
