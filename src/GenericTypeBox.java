public class GenericTypeBox <T>{
    private T t;
    public   void set(T t){
        this.t=t;
    }
    public T getT(){
        return t;
    }
   public   GenericTypeBox(T t){
//        this.t=t;
       this.t=t;

    }
//    public static void main(String[] args) {
//        GenericTypeBox<Integer>integerBox;
//
//    }

}
