public class Final_Assignment_Part_3 {
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0) {
                return i; // Return the index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {
        Integer[] list = {3, 4, 5, 1, -3, -5, -1};
        System.out.println(linearSearch(list, 2)); // Should print -1 (not found)
        System.out.println(linearSearch(list, 5)); // Should print 2 (index of 5)
    }
}