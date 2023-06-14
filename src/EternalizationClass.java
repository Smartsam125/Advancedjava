import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EternalizationClass implements Externalizable {
    public int age;
    public  String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EternalizationClass(){}
    public EternalizationClass(int age,String name){
        this.name=name;
        this.age=age;
    }
    //Override
    public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException {
        name=(String) in.readObject();
        age =in.readInt();

    }
    public  void writeExternal(ObjectOutput out) throws IOException{
        out.writeObject(name);
        out.writeInt(age);
    }
}
