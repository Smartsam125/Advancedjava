class  TestAnonymous2 {
    public static void main(String args[]) {
        TestAnonymous sam = new TestAnonymous() {
            @Override
            void eat() {
                System.out.println("Your  cat is nice");
            }
        };
        sam.eat();

    }
}