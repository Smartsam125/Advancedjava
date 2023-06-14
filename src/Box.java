public class Box <T>{
//    private Object object;
//    public void set(Object object){
//        this.object =object;
//    }
//    public  Object getObject(){
//        return  object;
//    }
   private T t;

    public void setT(T t) {
        this.t = t;
    }
   public T getT(){
        return t;
   }
   public Box(T t){
        this.t=t;
   }
    public static void main(String[] args) {

   // Box<String> stringBox=new Box<>("sam");
    Box rowBox =new Box("sdsds");
    Box<String>james=rowBox;
    rowBox.setT("555");
    Box rball = new Box("ddd");
    Box<String> checkBox=rball;


    }
}
