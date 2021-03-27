
package consumabletracker;


public class Movie extends Consumable{
    
    String type;
    
    public Movie(String name, String startingDate, String endingDate, int consumtionHour, double rating, int consumtionDays, String type) {
        super(name, startingDate, endingDate, consumtionHour, rating, consumtionDays);
        this.type = type;
        
        OverallInfo info = new OverallInfo();
        info.addOverallConsumptionTime(consumtionHour);
        info.addOverallConsumptionDays(consumtionDays);
        info.addOverallRating(rating);
        info.addConsumable(1);
        
        info.addMovieConsumptionTime(consumtionHour);
        info.addMovieConsumptionDays(consumtionDays);
        info.addMovieRating(rating);
        info.addMovie(1);
    }
    
    public void addConsumtionHour(int consumtionHour){
        this.consumtionHour+=consumtionHour;
        OverallInfo info = new OverallInfo();
        info.addOverallConsumptionTime(consumtionHour);
        info.addMovieConsumptionTime(consumtionHour);
    }
    
    public void addConsumtionDays(int consumtionDays){
        this.consumtionDays+=consumtionDays;
        OverallInfo info = new OverallInfo();
        info.addOverallConsumptionDays(consumtionDays);
        info.addMovieConsumptionDays(consumtionDays);
    }
    
    public void changeRating(double rating){
        OverallInfo info = new OverallInfo();
        info.addOverallRating(-this.rating);
        info.addOverallRating(rating);
        info.addMovieRating(-this.rating);
        info.addMovieRating(rating);
        this.rating=rating;
    }
    
    public void changeEndingDate(String endingDate){
        this.endingDate = endingDate;
    }
    
}
