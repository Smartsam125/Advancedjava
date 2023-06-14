public class TestException {
    //private int age;
    public static void validate(int age) throws InvalidException{
        if (age>17)
        {
            throw new InvalidException("Fuckyou");


        }else {
            System.out.println("Welcome you are eligible to vote");
        }
    }

    public static void main(String[] args) {
        try{
            TestException.validate(18);
        }catch(InvalidException e){
            System.out.println(e.getMessage());
        }
    }
}
