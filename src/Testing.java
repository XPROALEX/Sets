import java.util.HashSet;
import java.util.LinkedHashSet;
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

        Set<String> daysOfWeekLinkedHashSet = new LinkedHashSet<>();
        daysOfWeekLinkedHashSet.add("Lunedì");
        daysOfWeekLinkedHashSet.add("Martedì");
        daysOfWeekLinkedHashSet.add("Mercoledì");
        daysOfWeekLinkedHashSet.add("Giovedì");
        daysOfWeekLinkedHashSet.add("Venerdì");
        daysOfWeekLinkedHashSet.add("Sabato");
        daysOfWeekLinkedHashSet.add("Domenica");

        System.out.println("LinkedHashSet : " + daysOfWeekLinkedHashSet);

        System.out.println("Is the first Set equal to the second one? " + daysOfWeekHashSet.equals(daysOfWeekLinkedHashSet));
    }
}
