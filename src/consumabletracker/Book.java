
package consumabletracker;


public class Book extends Consumable{
    
    String type;
    
    public Book(String name, String startingDate, String endingDate, int consumtionHour, double rating, int consumtionDays, String type) {
        super(name, startingDate, endingDate, consumtionHour, rating, consumtionDays);
        this.type = type;
        
        OverallInfo info = new OverallInfo();
        info.addOverallConsumptionTime(consumtionHour);
        info.addOverallConsumptionDays(consumtionDays);
        info.addOverallRating(rating);
        info.addConsumable(1);
        
        info.addBookConsumptionTime(consumtionHour);
        info.addBookConsumptionDays(consumtionDays);
        info.addBookRating(rating);
        info.addBook(1);
    }
    
    public void addConsumtionHour(int consumtionHour){
        this.consumtionHour+=consumtionHour;
        OverallInfo info = new OverallInfo();
        info.addOverallConsumptionTime(consumtionHour);
        info.addBookConsumptionTime(consumtionHour);
    }
    
    public void addConsumtionDays(int consumtionDays){
        this.consumtionDays+=consumtionDays;
        OverallInfo info = new OverallInfo();
        info.addOverallConsumptionDays(consumtionDays);
        info.addBookConsumptionDays(consumtionDays);
    }
    
    public void changeRating(double rating){
        OverallInfo info = new OverallInfo();
        info.addOverallRating(-this.rating);
        info.addOverallRating(rating);
        info.addBookRating(-this.rating);
        info.addBookRating(rating);
        this.rating=rating;
    }
    
    public void changeEndingDate(String endingDate){
        this.endingDate = endingDate;
    }
    
    
    
}
