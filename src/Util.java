public class Util {
    public static <K,V> boolean compare(Pairs<K,V> p1,Pairs<K,V> p2){
        return p1.getKey().equals(p2.getKey())&&p1.getValue().equals(p2.getValue());

    }

    public static void main(String[] args) {
   //Util comp = new Util();
        Pairs<String,Integer> z= new Pairs<>("samson",67);
        Pairs<String,Integer>y= new Pairs<>("sason",67);
        boolean same =Util.compare(z,y);
        if(same==true){
            System.out.println("great");
        }else{
            System.out.println("fuck off");
        }

    }
}
