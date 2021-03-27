
package consumabletracker;


public class Series extends Consumable{
    
    String type;
    
    public Series(String name, String startingDate, String endingDate, int consumtionHour, double rating, int consumtionDays, String type) {
        super(name, startingDate, endingDate, consumtionHour, rating, consumtionDays);
        this.type=type;
        
        OverallInfo info = new OverallInfo();
        info.addOverallConsumptionTime(consumtionHour);
        info.addOverallConsumptionDays(consumtionDays);
        info.addOverallRating(rating);
        info.addConsumable(1);
        
        info.addSeriesConsumptionTime(consumtionHour);
        info.addSeriesConsumptionDays(consumtionDays);
        info.addSeriesRating(rating);
        info.addSeries(1);
    }
    
    public void addConsumtionHour(int consumtionHour){
        this.consumtionHour+=consumtionHour;
        OverallInfo info = new OverallInfo();
        info.addOverallConsumptionTime(consumtionHour);
        info.addSeriesConsumptionTime(consumtionHour);
    }
    
    public void addConsumtionDays(int consumtionDays){
        this.consumtionDays+=consumtionDays;
        OverallInfo info = new OverallInfo();
        info.addOverallConsumptionDays(consumtionDays);
        info.addSeriesConsumptionDays(consumtionDays);
    }
    
    public void changeRating(double rating){
        OverallInfo info = new OverallInfo();
        info.addOverallRating(-this.rating);
        info.addOverallRating(rating);
        info.addSeriesRating(-this.rating);
        info.addSeriesRating(rating);
        this.rating=rating;
    }
    
    public void changeEndingDate(String endingDate){
        this.endingDate = endingDate;
    }
    
}
