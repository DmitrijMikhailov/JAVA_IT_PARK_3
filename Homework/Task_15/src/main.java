public class main {
    public static void main(String[] args) {
        HashMap<Double, String> map = new HashMap<>();
        map.put(1.0, "Dima");
        map.put(2.0, "vima");
        map.put(3.0, "gima");
        map.put(4.0, "tima");
        Iterator iterator = map.iteratorBuck();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
