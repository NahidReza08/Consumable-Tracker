package consumabletracker;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<Book>();
        ArrayList<Movie> movies = new ArrayList<Movie>();
        ArrayList<Series> series = new ArrayList<Series>();
        
        Commands cd = new Commands();
        
        cd.addConsumable("Book1", null, null, 0, 0, 0, "Book");
        cd.addConsumable("Book2", "2021-01-01", null, 2, 8.4, 1, "Book");
        cd.addConsumable("Book3", null, "2021-01-01", 0, 6.7, 0, "Book");
        cd.addConsumable("Book4", "2021-01-01", "2021-03-01", 10, 0, 2, "Book");
        
        cd.addConsumable("Movie1", null, null, 0, 0, 0, "Movie");
        cd.addConsumable("Movie2", "2021-01-01", null, 3, 9.4, 1, "Movie");
        cd.addConsumable("Movie3", "2021-01-31", "2021-03-26", 0, 8.7, 0, "Movie");
        
        cd.addConsumable("Series1", null, null, 0, 0, 0, "Series");
        cd.addConsumable("Series2", "2021-02-28", null, 16, 6.4, 8, "Series");
        cd.addConsumable("Series3", "2021-02-21", "2021-03-26", 0, 5.7, 0, "Series");
        
        cd.editConsumable("Book1", "2021-01-01", 3, 0, 1, "Book");
        cd.editConsumable("Movie2", "2021-04-01", 2, 9.6, 1, "Movie");
        cd.editConsumable("Series1", "2021-04-04", 4, 6.8, 1, "Series");
        

        while (true) {

            String s0 = "Enter your command: \n";
            String s1 = "Type 1 - to add new conumable\n";
            String s2 = "Type 2 - to edit existing conumable\n";
            String s3 = "Type 3 - to delete existing conumable\n";
            String s4 = "Type 4 - to see list of conumables\n";
            String s5 = "Type 5 - to see the details of an individual conumable\n";
            String s6 = "Type 6 - to see overall info\n";
            System.out.println(s0 + s1 + s2 + s3 + s4 + s5 + s6);

            Scanner sc = new Scanner(System.in);
            String command = sc.nextLine();

            if (command.equals("1")) {
                System.out.println("Select consumable types?*(Book/Series/Movie)");
                String types = sc.nextLine();
                while (!types.equals("Book") && !types.equals("Series") && !types.equals("Movie")) {
                    System.out.println("Write consumable types in correct order.");
                    types = sc.nextLine();
                }
                System.out.println("Name of the " + types + ":*");
                String name = sc.nextLine();
                while (name.length() == 0) {
                    System.out.println("Write the name of the " + types + " plz.*");
                    name = sc.nextLine();
                }

                System.out.println("Consumption starting date in the format YYYY-MM-DD (optional).");
                String startingDate = sc.nextLine();
                if (startingDate.length() == 0) {
                    startingDate = null;
                }

                System.out.println("Consumption ending date in the format YYYY-MM-DD (optional).");
                String endingDate = sc.nextLine();
                if (endingDate.length() == 0) {
                    endingDate = null;
                }

                System.out.println("Total consumption time in hours (optional).");
                String consumption_hour = sc.nextLine();
                int consumptionHour = 0;
                if (consumption_hour.length() != 0) {
                    consumptionHour = Integer.parseInt(consumption_hour);;
                }

                System.out.println("Your personal rating X.YZ out of 10 (optional).");
                String personal_rating = sc.nextLine();
                double rating = 0.0;
                if (personal_rating.length() != 0) {
                    rating = Double.parseDouble(personal_rating);;
                }

                System.out.println("Total days of consumption (optional).");
                String consumption_days = sc.nextLine();
                int consumptionDays = 0;
                if (consumption_days.length() != 0) {
                    consumptionDays = Integer.parseInt(consumption_days);;
                }

                cd.addConsumable(name, startingDate, endingDate, consumptionHour, rating, consumptionDays, types);

            } else if (command.equals("2")) {
                System.out.println("Select consumable types?*(Book/Series/Movie)");
                String types = sc.nextLine();
                while (!types.equals("Book") && !types.equals("Series") && !types.equals("Movie")) {
                    System.out.println("Write consumable types in correct order.");
                    types = sc.nextLine();
                }

                System.out.println("Name of the " + types + ":*");
                String name = sc.nextLine();

                System.out.println("Add consumption time in hours (optional).");
                String consumption_hour = sc.nextLine();
                int consumptionHour = 0;
                if (consumption_hour.length() != 0) {
                    consumptionHour = Integer.parseInt(consumption_hour);;
                }

                System.out.println("Add days of consumption (optional).");
                String consumption_days = sc.nextLine();
                int consumptionDays = 0;
                if (consumption_days.length() != 0) {
                    consumptionDays = Integer.parseInt(consumption_days);;
                }

                System.out.println("Your personal rating X.YZ out of 10 (optional).");
                String personal_rating = sc.nextLine();
                double rating = 0.0;
                if (personal_rating.length() != 0) {
                    rating = Double.parseDouble(personal_rating);;
                }

                System.out.println("Consumption ending date in the format YYYY-MM-DD (optional).");
                String endingDate = sc.nextLine();
                if (endingDate.length() == 0) {
                    endingDate = null;
                }
                
                cd.editConsumable(name, endingDate, consumptionHour, rating, consumptionDays, types);

            } else if(command.equals("3")) {
                System.out.println("Select consumable types?*(Book/Series/Movie)");
                String types = sc.nextLine();
                while (!types.equals("Book") && !types.equals("Series") && !types.equals("Movie")) {
                    System.out.println("Write consumable types in correct order.");
                    types = sc.nextLine();
                }

                System.out.println("Name of the " + types + ":*");
                String name = sc.nextLine();
                
                cd.deleteConsumable(name, types);
               
            } else if (command.equals("4")) {
                System.out.println("Select consumable types?*(Book/Series/Movie)");
                String types = sc.nextLine();
                while (!types.equals("Book") && !types.equals("Series") && !types.equals("Movie")) {
                    System.out.println("Write consumable types in correct order.");
                    types = sc.nextLine();
                }
                
                cd.consumablesList(types);
                
            } else if(command.equals("5")) {
                System.out.println("Select consumable types?*(Book/Series/Movie)");
                String types = sc.nextLine();
                while (!types.equals("Book") && !types.equals("Series") && !types.equals("Movie")) {
                    System.out.println("Write consumable types in correct order.");
                    types = sc.nextLine();
                }

                System.out.println("Name of the " + types + ":*");
                String name = sc.nextLine();
                
                cd.individualConsumable(name, types);
               
            } else if(command.equals("6")) {
                cd.seeOverall();
                
            } else{
                System.out.println("Invalid command");
            }

        }

        
    }

}
