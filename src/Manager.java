import java.awt.*;
interface clientDisputes{
    void clientDisagree();
    void deescalateSituation();
    void escortClientOut();
}
public class Manager extends Person implements clientDisputes{

    public String position;
    Manager(String Name, String Position){
        super(Name);
        position = Position;
    }


    //base func for our class
    void openRestaurant(){
        System.out.println("Uchiha RestoBar is now open\n");
    }
    void talkToClient(){
        System.out.println("\nHello sir. My name is " + name + ", I am the " + position + ". What can I help you with?");
    }
    void getNewOrder(){
        System.out.println("\nHere is your new order. I am truly sorry for the inconvenience, enjoy your meal sir.");
    }
    void closeRestaurant(){
        System.out.println("The Restaurant has been closed");
    }

    //func for ClientDisputes interface
    public void clientDisagree() {
        System.out.println("Everything is normal with you order sir");
    }
    public void deescalateSituation() {
        System.out.println("Please calm down!");
    }
    public void escortClientOut() {
        System.out.println("Please, leave our restaurant now!");
    }
}
