public class HashSet<V> {
    private HashMap<V, Object> map;
    private final Object EMPTY_OBJECT = new Object();

    public HashSet() {
        map = new HashMap<>();
    }

    void add(V value) {
        map.put(value, EMPTY_OBJECT);
    }
}
