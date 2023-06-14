public class LocalinnerClass {
    private  int name=30;
    void display(){
        class local{
            void msg(){
                System.out.println(name);
            }

        }
        local l = new local();
        l.msg();

    }

    public static void main(String[] args) {
        LocalinnerClass sam=new LocalinnerClass();
        sam.display();
    }
}
