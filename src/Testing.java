import java.util.HashSet;
import java.util.Set;

public class Testing {
    public static void main(String[] args) {
        Set<String> daysOfWeekHashSet = new HashSet<>();
        daysOfWeekHashSet.add("Lunedì");
        daysOfWeekHashSet.add("Martedì");
        daysOfWeekHashSet.add("Mercoledì");
        daysOfWeekHashSet.add("Giovedì");
        daysOfWeekHashSet.add("Venerdì");
        daysOfWeekHashSet.add("Sabato");
        daysOfWeekHashSet.add("Domenica");

        System.out.println("HashSet : " + daysOfWeekHashSet);
    }
}
