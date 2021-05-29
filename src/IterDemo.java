import java.util.Iterator;
import java.util.LinkedList;

public class IterDemo {

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            l.add(i%3);
        }
        System.out.printf("%d", eliminaSecondo(l, 2));
    }

    private static <T extends Comparable<T>> T eliminaSecondo(LinkedList<T> linkedList, T obj){
        Iterator<T> iterator = linkedList.listIterator();
        boolean second = false;
        while (iterator.hasNext()){
            T current = iterator.next();
            if(current.compareTo(obj) == 0){
                if(second){
                    iterator.remove();
                    return current;
                }
                second = true;
            }
        }
        return null;
    }

}
