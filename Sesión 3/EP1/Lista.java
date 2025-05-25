package EP1;

class Lista<T> {
    private Node<T> root;

    public Lista() {
        this.root = null;
    }

    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (root == null) {
            root = newNode;
        } else {
            Node<T> current = root;
            while (current.nextNode != null) {
                current = current.nextNode;
            }
            current.nextNode = newNode;
        }
    }

    public void remove(T item) {
        if (root == null) return;

        if (root.data.equals(item)) {
            root = root.nextNode;
            return;
        }

        Node<T> current = root;
        while (current.nextNode != null) {
            if (current.nextNode.data.equals(item)) {
                current.nextNode = current.nextNode.nextNode;
                return;
            }
            current = current.nextNode;
        }
    }

    public boolean contains(T item) {
        Node<T> current = root;
        while (current != null) {
            if (current.data.equals(item)) {
                return true;
            }
            current = current.nextNode;
        }
        return false;
    }

    public int size() {
        int count = 0;
        Node<T> current = root;
        while (current != null) {
            count++;
            current = current.nextNode;
        }
        return count;
    }

    public T get(int index) {
        int count = 0;
        Node<T> current = root;
        while (current != null) {
            if (count == index) return current.data;
            count++;
            current = current.nextNode;
        }
        throw new IndexOutOfBoundsException("Index: " + index);
    }

    public void clear() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }
}