
public class theater extends movie{
	 private int theaterNo;
	   public theater(String id, String name, director director, int theaterNo) {
	       super(id, name, director);
	       this.theaterNo = theaterNo;
	   }
	   
	   public theater() {
	       super("", "", new director("", "", ' '));
	       this.theaterNo = 0;
	   }
	   public String getTheaterName() {
		   
	       if (theaterNo >= 1 && theaterNo <= 11) {
	           return "Basic Theater:";
	           
	       } 
	       else if (theaterNo >= 12 && theaterNo <= 14) {
	           return "Sweet Theater:";
	           
	       } 
	       else if (theaterNo == 15) {
	           return "Premium Theater:";
	           
	       } 
	       else {
	           return null;
	       }
	   }
	   public String toString() {
	       return getTheaterName() + " " + super.toString();
	   }
	}