import java.util.*;

public class MyCol {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        Set<String> treeSet = new TreeSet<>(set);
        System.out.println(Arrays.toString(set.toArray()) + "set");
        System.out.println(Arrays.toString(treeSet.toArray())+ "tree");
        System.out.println("------------------");
        treeSet.add("four");
        set.add("four");
        System.out.println(Arrays.toString(set.toArray()) + "set");
        System.out.println(Arrays.toString(treeSet.toArray())+ "tree");
        System.out.println("------------------");
        treeSet.add("five");
        set.add("five");
        System.out.println(Arrays.toString(set.toArray()) + "set");
        System.out.println(Arrays.toString(treeSet.toArray())+ "tree");
        System.out.println("------------------");
        treeSet.add("six");
        set.add("six");
        System.out.println(Arrays.toString(set.toArray()) + "set");
        System.out.println(Arrays.toString(treeSet.toArray())+ "tree");


    }
}
