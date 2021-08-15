package work4.clasWork;

public class HelloMenuItem implements MenuItem{
    @Override
    public String getName() {
        return "show hello";
    }

    @Override
    public void run() {
        System.out.println("hello");
    }
}
