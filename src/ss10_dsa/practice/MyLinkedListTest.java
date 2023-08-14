package ss10_dsa.practice;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList test = new MyLinkedList(10);
        test.addFirst(10);
        test.addFirst(11);
        test.addFirst(12);

        test.add(3,4);
        test.add(4,1);
        test.printList();
    }
}
