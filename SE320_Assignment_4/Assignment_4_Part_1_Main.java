import java.util.LinkedHashSet;
public class Assignment_4_Part_1_Main {
    public static void main(String[] args) {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");

        LinkedHashSet<String> unionSet = new LinkedHashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet);

        LinkedHashSet<String> differenceSet = new LinkedHashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + differenceSet);

        LinkedHashSet<String> intersectionSet = new LinkedHashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection: " + intersectionSet);
    }
}
