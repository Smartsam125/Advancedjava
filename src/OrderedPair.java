public class OrderedPair <K,V> implements Pair<K,V>{
    private K key;
    private V value;
    public OrderedPair(K key,V value){
        this.key =key;
        this.value=value;
    }
    public  K getKey(){
        return  key;
    }
    public V getValue(){
        return value;
    }

    public static void main(String[] args) {
        Pair<String,Integer> p1= new OrderedPair<>("Sam",23);
        Pair<String,Integer> p2=new OrderedPair<>("James",79);
        System.out.println(p1.getValue()+"Hello"+p1.getKey());
        OrderedPair<String,GenericTypeBox<Integer>>z=new OrderedPair<>("Hello",new GenericTypeBox<>(67));
        System.out.println(p2.getValue());
        System.out.println(z.getValue());
    }

}
