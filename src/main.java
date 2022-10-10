import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;
import java.util.List;
import java.util.Random;

public class main {
    public static  void main(String[] args){

        Manager m1 = new Manager("Dan", "General Manager");
        Waiter w1 = new Waiter("Cristian", m1);
        Client c1 = new Client("Jean", 1);
        Stock stock = new Stock("Restaurant Stock");
        Bar b1 = new Bar("Bar");
        European e1 = new European("European");
        Sushi s1 = new Sushi("Sushi");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        m1.openRestaurant();

//
        int ch;
        do {
            System.out.println("Enter 1 for the normal client scenario");
            System.out.println("Enter 2 for the dropped the food scenario");
            System.out.println("Enter 3 for the manager replaced the food scenario");
            System.out.println("Enter 4 for the manager and client argue scenario");
            System.out.println("Enter 5 for the fire hazard scenario");
            System.out.println("Enter your choice:");
            ch = scan.nextInt();
            switch (ch){
                case 1://Everything is normal
                    c1.arrived();
                    w1.greetClient();
                    w1.showMenus();
                    System.out.println("Client chose the " + b1.name + " menu: ");
                    b1.showElements();
                    c1.Order();
                    w1.bringOrder();
                    c1.payClient();
                    break;
                case 2://Waiter drops the food
                    c1.arrived();
                    w1.greetClient();
                    w1.showMenus();
                    System.out.println("Client chose the " + b1.name + " menu: ");
                    b1.showElements();
                    c1.Order();
                    w1.dropOrder();
                    int i = random.nextInt(1,3);
                   // System.out.println(i);
                    if(i == 1){
                        w1.bringAnotherOrder();
                        c1.payClient();
                    }else{
                        c1.clientDropLeft();
                    }
                    break;
                case 3://the food is bad gets a replacement
                    c1.arrived();
                    w1.greetClient();
                    w1.showMenus();
                    System.out.println("Client chose the " + b1.name + " menu: ");
                    b1.showElements();
                    c1.Order();
                    c1.Vomit();
                    w1.cUnplesead();
                    c1.Complaint();
                    m1.talkToClient();
                    c1.ToManager();
                    m1.getNewOrder();
                    c1.payClient();
                    break;
                case 4://the food is good but the client tries to get food for free
                    c1.arrived();
                    w1.greetClient();
                    w1.showMenus();
                    System.out.println("Client chose the " + b1.name + " menu: ");
                    b1.showElements();
                    c1.Order();
                    c1.Vomit();
                    w1.cUnplesead();
                    c1.Complaint();
                    m1.talkToClient();
                    c1.ToManager();
                    m1.clientDisagree();
                    c1.disagreeManager();
                    m1.deescalateSituation();
                    int f = random.nextInt(1,3);
                    if (f != 1) {
                        c1.conArgue();
                        m1.escortClientOut();
                    }
                    c1.left();
                    break;
                case 5://Section Emergency
                    w1.sectionOnFire();
                    break;
                case 9:
                    stock.showElements();
                    break;
                default:
                    System.out.println("Wrong Input!");
                    break;
            }


        }while(ch != 0);
        m1.closeRestaurant();
        return;
    }

}






