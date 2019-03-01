
public class LinkedListDriver {

    public static void main(String[] args) {
        LinkedList<Integer> test = new LinkedList<>();
        test.add(6);
        test.add(7);

        LinkedList<Integer> test2 = new LinkedList<>();
        test2.add(1);
        test2.add(2);
        test2.add(3);
        test2.add(4);

        System.out.println(test2);
        System.out.println(test);

        LinkedList<Integer> test3 = merge(test2, test);
        System.out.println(test3);


    }

    static LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> newList = new LinkedList<>();
        Node<Integer> current1 = list1.first;
        Node<Integer> current2 = list2.first;
        if (current1 == null) { return list2; }
        if (current2 == null) { return list1; }
        while (current1.next != null && current2.next != null) {
            if (current1.data <= current2.data) {
                newList.add(current1.data);
                current1 = current1.next;
            } else {
                newList.add(current2.data);
                current2 = current2.next;
            }
        }
        if (current1.next == null) {
            newList.add(current1.data);
            newList.add(current2.data);
            while (current2.next != null) {
                current2 = current2.next;
                newList.add(current2.data);
            }
        } else {
            newList.add(current1.data);
            newList.add(current2.data);
            while (current1.next != null) {
                current1 = current1.next;
                newList.add(current1.data);
            }
        }
        return newList;
    }
}
