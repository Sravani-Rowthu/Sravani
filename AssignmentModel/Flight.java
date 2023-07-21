package AssignmentModel;

public class Flight 
{
	private String id;
	private String source;
	private String dest;
	private double fare;
	private int totalseats;
	private int availableseats;
	private String departuretime;
	private String compname;
	public Flight() {}
	public Flight(String id, String source, String dest, double fare, int totalseats, int availableseats,
			String departuretime, String compname) {
		this.id = id;
		this.source = source;
		this.dest = dest;
		this.fare = fare;
		this.totalseats = totalseats;
		this.availableseats = availableseats;
		this.departuretime = departuretime;
		this.compname = compname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public int getTotalseats() {
		return totalseats;
	}
	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}
	public int getAvailableseats() {
		return availableseats;
	}
	public void setAvailableseats(int availableseats) {
		this.availableseats = availableseats;
	}
	public String getDeparturetime() {
		return departuretime;
	}
	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}
	public String getCompname() {
		return compname;
	}
	public void setCompname(String compname) {
		this.compname = compname;
	}
	
	
}
