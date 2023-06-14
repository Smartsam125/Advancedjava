import java.io.*;

public class ExternalizableMain {
    public static void main(String[] args) {
        try{
            File fs= new File("fx");
            EternalizationClass ss= new EternalizationClass(45,"dgdggd");
            ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream(fs));
            out.writeObject(ss);
            ObjectInputStream fsa = new ObjectInputStream(new FileInputStream(fs));
        EternalizationClass    txr=(EternalizationClass) fsa.readObject();
            System.out.println(txr.getAge());

        }catch(Exception e){

        }


    }
}
