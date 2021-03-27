
package consumabletracker;


public class OverallInfo {
    private static int totalOverallConsumptionTime = 0;
    private static int totalBookConsumptionTime = 0;
    private static int totalMovieConsumptionTime = 0;
    private static int totalSeriesConsumptionTime = 0;
    
    private static int totalOverallConsumptionDays = 0;
    private static int totalBookConsumptionDays = 0;
    private static int totalMovieConsumptionDays = 0;
    private static int totalSeriesConsumptionDays = 0;
    
    private static double totalOverallRating = 0.0;
    private static double totalBookRating = 0.0;
    private static double totalMovieRating = 0.0;
    private static double totalSeriesRating = 0.0;
    
    private static int totalConsumable =0 ;
    private static int totalBook =0 ;
    private static int totalMovie =0 ;
    private static int totalSeries =0 ;
    
   
    public OverallInfo(){
        
    }
    
    public void addOverallConsumptionTime(int overallConsumptionTime){
        totalOverallConsumptionTime+=overallConsumptionTime;
    }
    
    public void addBookConsumptionTime(int bookConsumptionTime){
        totalBookConsumptionTime+=bookConsumptionTime;
    }
    public void addMovieConsumptionTime(int movieConsumptionTime){
        totalMovieConsumptionTime+=movieConsumptionTime;
    }
    public void addSeriesConsumptionTime(int seriesConsumptionTime){
        totalSeriesConsumptionTime+=seriesConsumptionTime;
    }
    
    
    public void addOverallConsumptionDays(int overallConsumptionDays){
        totalOverallConsumptionDays+=overallConsumptionDays;
    }
    
    public void addBookConsumptionDays(int bookConsumptionDays){
        totalBookConsumptionDays+=bookConsumptionDays;
    }
    public void addMovieConsumptionDays(int movieConsumptionDays){
        totalMovieConsumptionDays+=movieConsumptionDays;
    }
    public void addSeriesConsumptionDays(int seriesConsumptionDays){
        totalSeriesConsumptionDays+=seriesConsumptionDays;
    }
    
    
    public void addOverallRating(double overallRating){
        totalOverallRating+=overallRating;
    }
    
    public void addBookRating(double bookRating){
        totalBookRating+=bookRating;
    }
    public void addMovieRating(double movieRating){
        totalMovieRating+=movieRating;
    }
    public void addSeriesRating(double seriesRating){
        totalSeriesRating+=seriesRating;
    }
    
    public void addConsumable(int num){
        totalConsumable+=num;
    }
    
    public void addBook(int num){
        totalBook+=num;
    }
    public void addMovie(int num){
        totalMovie+=num;
    }
    public void addSeries(int num){
        totalSeries+=num;
    }
    
    
    
    public int getOverallConsumptionTime(){
        return totalOverallConsumptionTime;
    }
    
    public int getBookConsumptionTime(){
        return totalBookConsumptionTime;
    }
    public int getMovieConsumptionTime(){
        return totalMovieConsumptionTime;
    }
    public int getSeriesConsumptionTime(){
        return totalSeriesConsumptionTime;
    }
    
    
    public int getOverallConsumptionDays(){
        return totalOverallConsumptionDays;
    }
    
    public int getBookConsumptionDays(){
        return totalBookConsumptionDays;
    }
    public int getMovieConsumptionDays(){
        return totalMovieConsumptionDays;
    }
    public int getSeriesConsumptionDays(){
        return totalSeriesConsumptionDays;
    }
    
    
    public double getAverageOverallRating(){
        return totalOverallRating/(double)totalConsumable;
    }
    
    public double getAverageBookRating(){
        return totalBookRating/(double)totalBook;
    }
    public double getAverageMovieRating(){
        return totalMovieRating/(double)totalMovie;
    }
    public double getAverageSeriesRating(){
        return totalSeriesRating/(double)totalSeries;
    }
    
    
    public int getTotalConsumable(){
        return totalConsumable;
    }
    
    public int getTotalBook(){
        return totalBook;
    }
    public int getTotalMovie(){
        return totalMovie;
    }
    public int getTotalSeries(){
        return totalSeries;
    }
    
}
