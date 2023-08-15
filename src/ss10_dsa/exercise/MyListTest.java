package ss10_dsa.exercise;

public class MyListTest {
    public static void main(String[] args) {
        MyList test = new MyList(10);
        System.out.println(test.size());
        test.add(0, "loan");
        test.add(1, "florence");
        test.add(2, "LY");
        System.out.println(test);
//        System.out.println(test.get(3));
        System.out.println(test.get(1));
        test.remove(2);
        System.out.println(test);
        test.clear();
        System.out.println(test);

    }
}
