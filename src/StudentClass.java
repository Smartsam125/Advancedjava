public class StudentClass implements  java.io.Serializable{
    public String Name;
    public  StudentClass(String Name){
        this.Name=Name;
    }
    public String getName(){
        return  Name;
    }
}
