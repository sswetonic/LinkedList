public class Main {

    public static void main(String[] args) {
        Node<Integer> testNode = new Node<>(5);
        LinkedList<Integer> test = new LinkedList<>(testNode);
        test.add(6);
        test.add(7);
        System.out.println(test.exists(testNode));
        System.out.println(test);
    }
}
