
class first{
    public void printname(){
        System.out.println("lokesh");
    }

}

class second{
    void printage(){
        System.out.println("23");
    }
}

class third{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

//this is the main class where we will call all classes and the this class name should be same as file name
public class class_in{
    public static void main(String[] args) {
        first f = new first();
        f.printname();
        second s = new second();
        s.printage();
        third t = new third();
        t.age = 23;
        t.name = "lokesh";
        t.printinfo();
    }
}
