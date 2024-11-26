import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Assignment_5_Part_2 {
    public static void removeDuplicates(List lst) {
        if (lst == null || lst.size() == 0) return;
        List copy = new ArrayList(lst);
        Iterator elements = copy.iterator();
        Object pre = elements.next();
        while (elements.hasNext()) {
            Object nex = elements.next();
            if (pre.equals(nex)) lst.remove(nex);
            else pre = nex;
        }
    }
    // Implementation of fixed method
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("C");
        list.add("D");

        System.out.println("Original list: " + list);

        removeDuplicates(list);

        System.out.println("List after removing duplicates: " + list);
    }
}
