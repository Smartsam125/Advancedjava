import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try{
            FileInputStream zex =new FileInputStream("fout.txt");
            ObjectInputStream frank =new ObjectInputStream(zex);
            StudentClass s =(StudentClass) frank.readObject();
            System.out.println(s.getName());
            frank.close();

        }
        catch(IOException e){
            e.getMessage();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
