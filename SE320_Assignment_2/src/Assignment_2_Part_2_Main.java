import java.util.ArrayList;
import java.util.HashSet;
public class Assignment_2_Part_2_Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(14);
        list.add(24);
        list.add(14);
        list.add(42);
        list.add(25);
        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.print(newList);
    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        HashSet<E> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}