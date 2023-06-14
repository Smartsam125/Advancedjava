import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialiZAtion1 {
    public static void main(String[] args) {
        try{
            StudentClass sam = new StudentClass("Zex Kikumi Bilangi langi");
            FileOutputStream fout =new FileOutputStream("fout.txt");
            ObjectOutputStream obj = new ObjectOutputStream(fout);
            obj.writeObject(sam);
            obj.flush();
            obj.close();

        }catch (IOException e){
            e.getMessage();
        }


    }
}
