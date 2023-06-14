public class StaticNestedClass {
    private static  int age=30;
    static class sam{
        void msg(){
            System.out.println(age);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.sam obj=new StaticNestedClass.sam();
        obj.msg();
    }
}
