public class MemberOuterClass1 {
    private int data=30;
    class MemberInnerClass{
        void msg(){
            System.out.println("data"+data);
        }
    }

    public static void main(String[] args) {
        MemberOuterClass1 obj = new MemberOuterClass1();
        MemberOuterClass1.MemberInnerClass inner=obj.new MemberInnerClass();
        inner.msg();

    }
}
