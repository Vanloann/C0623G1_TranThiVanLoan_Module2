package ss11_stack_queue.execise;

import java.util.Map;

public class TreeMap {
    public static void frequencyOfWord() {
        Map<String, Integer> myTree = new java.util.TreeMap<>();
        String string = "Count the frequency of Words in the String";
        String[] str = string.split(" ");

        for (String words : str) {
            if (myTree.containsKey(words.toLowerCase())) {
                myTree.put(words.toLowerCase(), myTree.get(words) + 1);
            } else {
                myTree.put(words.toLowerCase(), 1);
            }
        }
        System.out.println(myTree);
    }

    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.frequencyOfWord();
    }
}
