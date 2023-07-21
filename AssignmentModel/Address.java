package AssignmentModel;

public class Address 
{
	String city;
	String area;
	String state;
	public Address() {}
	public Address(String city, String area, String state) 
	{
		this.city = city;
		this.area = area;
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
