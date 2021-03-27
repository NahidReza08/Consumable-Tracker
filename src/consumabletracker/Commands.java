package consumabletracker;

import java.util.ArrayList;

public class Commands {

    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Movie> movies = new ArrayList<Movie>();
    ArrayList<Series> series = new ArrayList<Series>();

    public void addConsumable(String name, String startingDate, String endingDate, int consumptionHour, double rating, int consumptionDays, String types) {
        if (types.equals("Book")) {
            books.add(new Book(name, startingDate, endingDate, consumptionHour, rating, consumptionDays, types));
            System.out.println("1 " + types + " successfully added.\n");
        } else if (types.equals("Movie")) {
            movies.add(new Movie(name, startingDate, endingDate, consumptionHour, rating, consumptionDays, types));
            System.out.println("1 " + types + " successfully added.\n");
        } else if (types.equals("Series")) {
            series.add(new Series(name, startingDate, endingDate, consumptionHour, rating, consumptionDays, types));
            System.out.println("1 " + types + " successfully added.\n");
        }

    }

    public void editConsumable(String name, String endingDate, int consumptionHour, double rating, int consumptionDays, String types) {
        if (types.equals("Book")) {
            boolean flag = false;
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                if (book.getName().equals(name)) {
                    flag = true;
                    if (book.getEndingDate() == null) {
                        book.addConsumtionHour(consumptionHour);
                        book.addConsumtionDays(consumptionDays);
                        book.changeRating(rating);
                        book.changeEndingDate(endingDate);
                        System.out.println("1 book successfully edited.");
                        break;
                    } else {
                        System.out.println("This iteam isn't editable anymore.");
                    }
                }

            }
            if (flag == false) {
                System.out.println("Type or Name not correct.");
            }
        } else if (types.equals("Movie")) {
            boolean flag = false;
            for (int i = 0; i < movies.size(); i++) {
                Movie movie = movies.get(i);
                if (movie.getName().equals(name)) {
                    flag = true;
                    if (movie.getEndingDate() == null) {
                        movie.addConsumtionHour(consumptionHour);
                        movie.addConsumtionDays(consumptionDays);
                        movie.changeRating(rating);
                        movie.changeEndingDate(endingDate);
                        System.out.println("1 movie successfully edited.");
                        break;
                    } else {
                        System.out.println("This iteam isn't editable anymore.");
                    }
                }

            }
            if (flag == false) {
                System.out.println("Type or Name not correct.");
            }
        } else if (types.equals("Series")) {
            boolean flag = false;
            for (int i = 0; i < series.size(); i++) {
                Series serieS = series.get(i);
                if (serieS.getName().equals(name)) {
                    flag = true;
                    if (serieS.getEndingDate() == null) {
                        serieS.addConsumtionHour(consumptionHour);
                        serieS.addConsumtionDays(consumptionDays);
                        serieS.changeRating(rating);
                        serieS.changeEndingDate(endingDate);
                        System.out.println("1 series successfully edited.");
                        break;
                    } else {
                        System.out.println("This iteam isn't editable anymore.");
                    }
                }

            }
            if (flag == false) {
                System.out.println("Type or Name not correct.");
            }
        }
    }

    public void deleteConsumable(String name, String types) {
        if (types.equals("Book")) {
            boolean flag = false;
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                if (book.getName().equals(name)) {
                    flag = true;
                    OverallInfo info = new OverallInfo();
                    info.addOverallRating(-book.getRating());
                    info.addBookRating(-book.getRating());
                    info.addConsumable(-1);
                    info.addBook(-1);
                    books.remove(book);
                    System.out.println("1 book successfully deleted.");
                    break;
                }

            }
            if (flag == false) {
                System.out.println("Type or Name not correct.");
            }

        } else if (types.equals("Movie")) {
            boolean flag = false;
            for (int i = 0; i < movies.size(); i++) {
                Movie movie = movies.get(i);
                if (movie.getName().equals(name)) {
                    flag = true;
                    OverallInfo info = new OverallInfo();
                    info.addOverallRating(-movie.getRating());
                    info.addBookRating(-movie.getRating());
                    info.addConsumable(-1);
                    info.addBook(-1);
                    books.remove(movie);
                    System.out.println("1 movie successfully deleted.");
                    break;
                }

            }
            if (flag == false) {
                System.out.println("Type or Name not correct.");
            }

        } else if (types.equals("Series")) {
            boolean flag = false;
            for (int i = 0; i < series.size(); i++) {
                Series serieS = series.get(i);
                if (serieS.getName().equals(name)) {
                    flag = true;
                    OverallInfo info = new OverallInfo();
                    info.addOverallRating(-serieS.getRating());
                    info.addBookRating(-serieS.getRating());
                    info.addConsumable(-1);
                    info.addBook(-1);
                    books.remove(serieS);
                    System.out.println("1 series successfully deleted.");
                    break;
                }

            }
            if (flag == false) {
                System.out.println("Type or Name not correct.");
            }
        }

    }

    public void consumablesList(String types) {
        if (types.equals("Book")) {
            if (books.size() == 0) {
                System.out.println("No book available");
            } else {
                System.out.println("____________________________________________________________________________________________________");
                System.out.printf("%-50s%20s%20s%10s\n", "Name", "Consumption Hour", "Consumption Days", "Rating");
                System.out.println("____________________________________________________________________________________________________");
            }
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                //book.printValues();
                System.out.printf("%-50s%20s%20s%10s\n", book.getName(), book.getConsumtionHour(), book.getConsumtionDays(), book.getRating());
                System.out.println("____________________________________________________________________________________________________");

            }
        } else if (types.equals("Movie")) {
            if (movies.size() == 0) {
                System.out.println("No movie available");
            } else {
                System.out.println("____________________________________________________________________________________________________");
                System.out.printf("%-50s%20s%20s%10s\n", "Name", "Consumption Hour", "Consumption Days", "Rating");
                System.out.println("____________________________________________________________________________________________________");
            }
            for (int i = 0; i < movies.size(); i++) {
                Movie movie = movies.get(i);
                System.out.printf("%-50s%20s%20s%10s\n", movie.getName(), movie.getConsumtionHour(), movie.getConsumtionDays(), movie.getRating());
                System.out.println("____________________________________________________________________________________________________");

            }
        } else if (types.equals("Series")) {
            if (movies.size() == 0) {
                System.out.println("No series available");
            } else {
                System.out.println("____________________________________________________________________________________________________");
                System.out.printf("%-50s%20s%20s%10s\n", "Name", "Consumption Hour", "Consumption Days", "Rating");
                System.out.println("____________________________________________________________________________________________________");
            }
            for (int i = 0; i < series.size(); i++) {
                Series serieS = series.get(i);
                System.out.printf("%-50s%20s%20s%10s\n", serieS.getName(), serieS.getConsumtionHour(), serieS.getConsumtionDays(), serieS.getRating());
                System.out.println("____________________________________________________________________________________________________");

            }
        }

    }

    public void individualConsumable(String name, String types) {
        if (types.equals("Book")) {
            boolean flag = false;
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                if (book.getName().equals(name)) {
                    System.out.println("Name: " + book.getName());
                    System.out.println("Consumable type: " + types);
                    System.out.println("Consumption starting date: " + book.getStartingDate());
                    System.out.println("Consumption ending date: " + book.getEndingDate());
                    System.out.println("Total consumption time in hours: " + book.getConsumtionHour());
                    System.out.println("Total consumption time in days: " + book.getConsumtionDays());
                    System.out.println("Personal rating: " + book.getRating());
                    flag = true;
                    break;
                }

            }
            if (flag == false) {
                System.out.println("Type or Name not correct.");
            }

        } else if (types.equals("Movie")) {
            boolean flag = false;
            for (int i = 0; i < movies.size(); i++) {
                Movie movie = movies.get(i);
                if (movie.getName().equals(name)) {
                    System.out.println("Name: " + movie.getName());
                    System.out.println("Consumable type: " + types);
                    System.out.println("Consumption starting date: " + movie.getStartingDate());
                    System.out.println("Consumption ending date: " + movie.getEndingDate());
                    System.out.println("Total consumption time in hours: " + movie.getConsumtionHour());
                    System.out.println("Total consumption time in days: " + movie.getConsumtionDays());
                    System.out.println("Personal rating: " + movie.getRating());
                    flag = true;
                    break;
                }

            }
            if (flag == false) {
                System.out.println("Type or Name not correct.");
            }

        } else if (types.equals("Series")) {
            boolean flag = false;
            for (int i = 0; i < series.size(); i++) {
                Series serieS = series.get(i);
                if (serieS.getName().equals(name)) {
                    System.out.println("Name: " + serieS.getName());
                    System.out.println("Consumable type: " + types);
                    System.out.println("Consumption starting date: " + serieS.getStartingDate());
                    System.out.println("Consumption ending date: " + serieS.getEndingDate());
                    System.out.println("Total consumption time in hours: " + serieS.getConsumtionHour());
                    System.out.println("Total consumption time in days: " + serieS.getConsumtionDays());
                    System.out.println("Personal rating: " + serieS.getRating());
                    flag = true;
                    break;
                }

            }
            if (flag == false) {
                System.out.println("Type or Name not correct.");
            }

        }

    }

    public void seeOverall() {
        OverallInfo info = new OverallInfo();
        System.out.println("The total consumption time in hours across all types:" + info.getOverallConsumptionTime());
        System.out.println("The total consumption time in hours for all books:" + info.getBookConsumptionTime());
        System.out.println("The total consumption time in hours for all movie:" + info.getMovieConsumptionTime());
        System.out.println("The total consumption time in hours for all series:" + info.getSeriesConsumptionTime());

        System.out.println("The total consumption days across all types:" + info.getOverallConsumptionDays());
        System.out.println("The total consumption days for all books:" + info.getBookConsumptionDays());
        System.out.println("The total consumption days for all movie:" + info.getMovieConsumptionDays());
        System.out.println("The total consumption days for all series:" + info.getSeriesConsumptionDays());

        System.out.println("Average rating across all types:" + info.getAverageOverallRating());
        System.out.println("Average rating for all books:" + info.getAverageBookRating());
        System.out.println("Average rating for all movie:" + info.getAverageMovieRating());
        System.out.println("Average rating for all series:" + info.getAverageSeriesRating());

        System.out.println("Total number of consumable across all types:" + info.getTotalConsumable());
        System.out.println("Total number of books:" + info.getTotalBook());
        System.out.println("Total number of movie:" + info.getTotalMovie());
        System.out.println("Total number of series:" + info.getTotalSeries());
    }

}
