public class LinkedList<E> {
    public Node<E> first;

    public LinkedList() {
        first = null;
    }

    public LinkedList(Node<E> first) {
        this.first = first;
    }

    public void add(E value) {
        if (first == null) {
            first = new Node<E>(value);
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<E>(value);
        }
    }

    public void add(int index, E value) {
        if (index == 0) {
            first = new Node<E>(value, first);
        } else {
            Node<E> current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = new Node<E>(value, current.next);
        }
    }

    public void remove(int index) {
        if (index == 0) {
            first = first.next;
        } else {
            Node current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    public boolean equals(Object o) {
        if (o instanceof LinkedList) {
            LinkedList other = (LinkedList) o;
            return toString().equals(other.toString());
        } else {
            return false;
        }
    }

    public boolean exists(Node<E> node) {
        Node<E> current = first;
        while (current.next != null) {
            if (current.equals(node)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String toString() {

        Node current = first;
        String result = "[";
        while (current != null) {
            result += current.data + "]";
            if (current.next != null) {
                result += " -> [";
            }
            current = current.next;
        }
        return result;
    }
}
