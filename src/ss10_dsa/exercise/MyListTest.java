package ss10_dsa.exercise;

public class MyListTest {
    public static void main(String[] args) {
        MyList test = new MyList(10);
        System.out.println(test.size());
        test.add(0, "loan");
        test.add(1, "florence");
        test.add("a");
        System.out.println(test);
        test.remove(3);
        System.out.println(test);
    }
}
