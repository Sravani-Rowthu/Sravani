package AssignmentModel;

import java.util.ArrayList;

public class Airport extends Flight
{
	Address address;
	ArrayList<Flight> flights=new ArrayList<> ();
	ArrayList<Traveller> travellers=new ArrayList<> ();
	public Airport() {}
	public Airport(Address address, ArrayList<Flight> flights, ArrayList<Traveller> travellers,String id, String source, String dest, double fare, int totalseats, int availableseats,
			String departuretime, String compname) 
	{
		super(id,source,dest,fare,totalseats,availableseats,departuretime,compname);
		this.address = address;
		this.flights = flights;
		this.travellers = travellers;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ArrayList<Flight> getFlights() {
		return flights;
	}
	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	}
	public ArrayList<Traveller> getTravellers() {
		return travellers;
	}
	public void setTravellers(ArrayList<Traveller> travellers) {
		this.travellers = travellers;
	}
	public boolean addFlight(Flight flight)
    {   
		flights.add(flight);
        return true;
    }
    public boolean searchFlightBySourceAndDestination(String source,String dest) 
    {
    	if(flights.contains(source) && flights.contains(dest))
    		return true;
		return false;
    }
    public void bookTicket(String flightId,Traveller traveller)
    {
    	for(int i=0;i<flights.size();i++)
    	{
    		if(flights.contains(flightId) && (flights.get(i)).getAvailableseats()>0)
    		{
    		travellers.add(traveller);
    		flights.get(i).setAvailableseats(flights.get(i).getAvailableseats()-1);
    		}
        }
    }
	
}
