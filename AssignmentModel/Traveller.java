package AssignmentModel;

import java.time.LocalDate;

public class Traveller 
{
	private String name;
	private double mobile;
	private String email;
	private String flightid;
	private LocalDate date;
	public Traveller() {}
	public Traveller(String name, double mobile, String email, String flightid, LocalDate date) {
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.flightid = flightid;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMobile() {
		return mobile;
	}
	public void setMobile(double mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
