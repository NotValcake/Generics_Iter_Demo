public class Coppia <T extends Comparable<T>>{

    private final T t1;
    private final T t2;

    public Coppia(T t1, T t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    /**
     * @return the greatest or null if t1 and t2 are equals
     */
    public T getMax(){
        return t1.compareTo(t2) < 0 ? t2 : t1.compareTo(t2) > 0 ? t1 : null;
    }

}
