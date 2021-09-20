package Car;

public class CarProgram {
	private String noOfDoor;
	private String noOfSeats;
	private String Stepnee;
	
	public CarProgram(String noOfDoor, String noOfSeats, String Stepnee )
	{
		this.noOfDoor = noOfDoor;
		this.noOfSeats = noOfSeats;
		this.Stepnee = Stepnee;
	}
	public void printDetail() {
		System.out.println("noOfDoor:" + noOfDoor);
		System.out.println("noOfSeats:" + noOfSeats);
		System.out.println("Stepnee:" + Stepnee);
	}
	public void CarProgramDetail() {
		
		
	}
}
  
class CarUtilities extends CarProgram{
	public CarUtilities(String noOfDoor, String noOfSeats, String Stepnee) {
		super(noOfDoor, noOfSeats, Stepnee);

	}
	private String musicSystem;
	private String radio;
	private String bumpper;
	private String numberPlates;
	
	public void CarUtilities(String musicSystem, String radio, String bumpper, String numberPlates )
	{
		this.musicSystem = musicSystem;
		this.radio = radio;
		this.bumpper = bumpper;
		this.numberPlates = numberPlates;	
	}
	public void CarUtilitiesDetail() {
		printDetail();
		System.out.println("musicSystem:" + musicSystem);
		System.out.println("radio:" + radio);
		System.out.println("bumpper:" + bumpper);
		System.out.println("numberPlates:" + numberPlates);
	}
   }
class CarInterior extends CarProgram{
	public CarInterior(String noOfDoor, String noOfSeats, String Stepnee) {
		super(noOfDoor, noOfSeats, Stepnee);

	}
	private String SeatCover;
	private String SeatCoverColour;
	public void CarInterior(String SeatCover , String SeatCoverColour )
	{
		this.SeatCover = SeatCover;
		this.SeatCoverColour = SeatCoverColour;
			
	}
	public void CarInteriorDetail() {
		printDetail();
		System.out.println("SeatCover:" + SeatCover);
		System.out.println("SeatCoverColour:" + SeatCoverColour);
	}
	
}	
class Main {

	  public static void main(String args[]) {
		  CarProgram Hundai = new CarProgram("Hometheater", "FM",  "bumpper"); 
		    Hundai.CarProgramDetail(); 
	  }
}
