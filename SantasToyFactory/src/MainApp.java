import CommandPattern.Command;
import CommandPattern.needBike;
import CommandPattern.needDoll;
import FactoryPattern.Toys;
import SingletonPattern.Santa;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("HoHoHo,this is Santa's factory.Today I the Mighty ONE will grand you with a gift .\n" +
                "Choose wisely, want you want doll or bike.");

       Santa claus = Santa.getInstance();

        Toys toys = new Toys();
        Command needbike = new needBike(toys);
        Command needdoll = new needDoll(toys);

        Scanner scanner = new Scanner(System.in);
        String ChildWish = scanner.nextLine();




        if (ChildWish.equalsIgnoreCase("Bike")){
            claus.setCommand(needbike);
            claus.WantedToy();

        }
        else if (ChildWish.equalsIgnoreCase("Doll")){
            claus.setCommand(needdoll);
            claus.WantedToy();
        }
        else {
            System.out.println("What you want child bike or doll,hohohoho");

        }
        String SecondWish = scanner.nextLine();
        if (SecondWish.equalsIgnoreCase("Bike")){
            claus.setCommand(needbike);
            claus.WantedToy();
        }
        else if (SecondWish.equalsIgnoreCase("Doll")){
            claus.setCommand(needdoll);
            claus.WantedToy();
        }
        else {
            System.out.println("You wasted your second wish,hohoho.");
        }

}
}
