import java.util.Scanner;
public class Main{
public static void main(String[] args) {

    Scanner input=new Scanner(System.in);

//    Route Object
    Route route=new Route("Khobar","Dammam",100);
    System.out.println("===============================================================");
    System.out.println( route.DisplayInfo());

//    Car Object
    Car car=new Car();
    car.setCode("1102");
    car.setRoute(route);
    car.setMaxCapacity(4);
    System.out.println("===============================================================");
    System.out.println(car.DisplayInfo());

//    Passengers Objects

    Passenger p1=new Subscribes();
    Passenger p2=new NonSubscribers();
    System.out.println("===============================================================");
    System.out.println("───▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄───\n" +
            "───█▒▒░░░░░░░░░▒▒█───\n" +
            "────█░░█░░░░░█░░█────\n" +
            "─▄▄──█░░░▀█▀░░░█──▄▄─\n" +
            "█░░█─▀▄░░░░░░░▄▀─█░░█\n" +
            "█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█\n" +
            "█░░╦─╦╔╗╦─╔╗╔╗╔╦╗╔╗░░█\n" +
            "█░░║║║╠─║─║─║║║║║╠─░░█\n" +
            "█░░╚╩╝╚╝╚╝╚╝╚╝╩─╩╚╝░░█\n" +
            "█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█ To Booking System !\n");
    System.out.println("\uD83D\uDFE2 To Start Please Complete Your Information: \n\uD83D\uDFE2 Please Entre Your Name:");
    String name=input.nextLine();
    System.out.println("\uD83D\uDFE2 Please Entre Your ID:");
    String id=input.nextLine();
    System.out.println("\uD83D\uDFE2 Do You Have a Subscribe? 1.Yes 2.No:");
    int choice=input.nextInt();
    if(choice==1){
        p1.setName(name);
        p1.setID(id);
        p1.setReservedCar(car);
        car.CheckSeat();
        p1.Reserved(car);
        System.out.println(p1.DisplayInfo());
    }else if(choice==2){
        p2.setName(name);
        p2.setID(id);
        p2.setReservedCar(car);
        car.CheckSeat();
        p2.DisplayInfo();
        System.out.println(p2.DisplayInfo());
    }else{
        System.out.println("Invalid Choice");
    }

}
}
