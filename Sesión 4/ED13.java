import java.util.LinkedList;

public class ED13 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("LinkedList: " + list);
        System.out.println("The last element is removed: " + list.removeLast());
        System.out.println("Final LinkedList: " + list);
        System.out.println("The last element is removed: " + list.removeLast());
        System.out.println("Final LinkedList: " + list);
    }
}

