package consumabletracker;


public class Consumable {
    String name;
    String startingDate;
    String endingDate;
    int consumtionHour;
    double rating;
    int consumtionDays;
    
    public Consumable(String name, String startingDate, String endingDate, int consumtionHour, double rating, int consumtionDays){
        this.name = name;
        this.startingDate=startingDate;
        this.endingDate=endingDate;
        this.consumtionHour=consumtionHour;
        this.rating=rating;
        this.consumtionDays=consumtionDays;
    }
    
    
    public String getName(){
        return name;
    }
    
    public String getStartingDate(){
        return startingDate;
    }
    
    public String getEndingDate(){
        return endingDate;
    }
    
    public int getConsumtionHour(){
        return consumtionHour;
    }
    
    public double getRating(){
        return rating;
    }
    
    public int getConsumtionDays(){
        return consumtionDays;
    }
    
    
}
