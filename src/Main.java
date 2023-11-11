import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.Online board\n2.Show the flight info\n3.Search and book a flight\n4.Cancel the booking\n5.My flights\n6.Exit");
        ArrayList<Schedule> allFlights = new ArrayList<>();
        Schedule schedule1 = new Schedule("Baku", "22.05.2023", 1000, "22:00", 14);
        Schedule schedule2 = new Schedule("London", "13.09.2023", 2000, "18:00", 60);
        Schedule schedule3 = new Schedule("Paris", "12.07.2023", 3000, "19:00", 54);
        Schedule schedule4 = new Schedule("Frankfurt", "01.10.2023", 4000, "13:00", 23);
        Schedule schedule5 = new Schedule("London", "06.01.2023", 5000, "16:00", 5);
        allFlights.add(schedule1);
        allFlights.add(schedule2);
        allFlights.add(schedule3);
        allFlights.add(schedule4);
        allFlights.add(schedule5);
        ArrayList<Ticket> allTickets = new ArrayList<Ticket>();
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int id = 0;
        System.out.println("Enter the number u want to apply:");
        number = sc.nextInt();
        sc.nextLine();
        switch (number){
            case 1:
                for(Schedule obj : allFlights){
                    System.out.println(obj.getCity()+"---"+obj.getDate()+"---"+obj.getId()+"---"+obj.getTime());
                }
                break;
            case 2:
                System.out.println("Enter ur flight id:");
                id = sc.nextInt();
                sc.nextLine();
                if(id== schedule1.getId()){
                    System.out.println(schedule1.getCity()+" --- "+schedule1.getDate()+" --- "+schedule1.getTime()+" --- "+schedule1.getNumberOfSeats()+" free seats");
                } else if(id== schedule2.getId()){
                    System.out.println(schedule2.getCity()+" --- "+schedule2.getDate()+" --- "+schedule2.getTime()+" --- "+schedule2.getNumberOfSeats()+" free seats");
                } else if(id== schedule3.getId()){
                    System.out.println(schedule3.getCity()+" --- "+schedule3.getDate()+" --- "+schedule3.getTime()+" --- "+schedule3.getNumberOfSeats()+" free seats");
                } else if(id== schedule4.getId()){
                    System.out.println(schedule4.getCity()+" --- "+schedule4.getDate()+" --- "+schedule4.getTime()+" --- "+schedule4.getNumberOfSeats()+" free seats");
                } else if(id== schedule5.getId()){
                    System.out.println(schedule5.getCity()+" --- "+schedule5.getDate()+" --- "+schedule5.getTime()+" --- "+schedule5.getNumberOfSeats()+" free seats");
                } else{
                    System.out.println("Invalid id");
                }
                break;
            case 3:
                System.out.println("Enter the destination u want to travel:");
                String dest = sc.nextLine();
                System.out.println("Enter the date:");
                String date = sc.nextLine();
                System.out.println("Enter the number of tickets:");
                int numberofpeople = sc.nextInt();
                sc.nextLine();
                Ticket t = new Ticket(dest, date, numberofpeople);
                allTickets.add(t);
                if(dest.equals(schedule1.getCity()) && date.equals(schedule1.getDate()) && numberofpeople<= schedule1.getNumberOfSeats()){
                    System.out.println(schedule1.getCity()+" --- "+schedule1.getDate()+" --- "+schedule1.getTime()+" --- "+schedule1.getNumberOfSeats()+" free seats");
                } else if(dest.equals(schedule2.getCity()) && date.equals(schedule2.getDate()) && numberofpeople<= schedule2.getNumberOfSeats()){
                    System.out.println(schedule2.getCity()+" --- "+schedule2.getDate()+" --- "+schedule2.getTime()+" --- "+schedule2.getNumberOfSeats()+" free seats");
                } else if(dest.equals(schedule3.getCity()) && date.equals(schedule3.getDate()) && numberofpeople<= schedule3.getNumberOfSeats()){
                    System.out.println(schedule3.getCity()+" --- "+schedule3.getDate()+" --- "+schedule3.getTime()+" --- "+schedule3.getNumberOfSeats()+" free seats");
                } else if(dest.equals(schedule4.getCity()) && date.equals(schedule4.getDate()) && numberofpeople<= schedule4.getNumberOfSeats()){
                    System.out.println(schedule4.getCity()+" --- "+schedule4.getDate()+" --- "+schedule4.getTime()+" --- "+schedule4.getNumberOfSeats()+" free seats");
                } else if(dest.equals(schedule5.getCity()) && date.equals(schedule5.getDate()) && numberofpeople<= schedule5.getNumberOfSeats()){
                    System.out.println(schedule5.getCity()+" --- "+schedule5.getDate()+" --- "+schedule5.getTime()+" --- "+schedule5.getNumberOfSeats()+" free seats");
                } else{
                    System.out.println("Unfortunately, there is not any flight relevant for you");
                }
                break;

            case 4:
                System.out.println("Enter the Ticket ID to cancel:");
                int ticketIdToCancel = sc.nextInt();
                Iterator<Schedule> iterator = allFlights.iterator();
                while (iterator.hasNext()) {
                    Iterator<Schedule> all = (Iterator<Schedule>) iterator.next();
                    if (((Schedule) iterator.next()).getId()== ticketIdToCancel) {
                        iterator.remove();
                        System.out.println("Ticket with ID " + ticketIdToCancel + " has been canceled.");
                        return;
                    }

                System.out.println("Ticket with ID " + ticketIdToCancel + " not found.");
            }
                break;
        }
//            case 5:
//
//                break;
//            case 6:
//
//                break;
//            default:
//                System.out.println("Invalid number");
        }


    }