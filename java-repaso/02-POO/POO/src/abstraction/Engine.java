package abstraction;

public class Engine {

    public void start(){
        System.out.println("Starting Engine");
    }

    public void start(boolean slientMode){
        if(slientMode){
            System.out.println("Starting silent Mode");
        } else {
            System.out.println("Starting vehicle");
        }
    }
}
