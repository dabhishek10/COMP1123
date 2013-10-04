//********************************************************************
//  FlightTest.java       Author: Luxing Huang (100113287)
//
//  Constructor Class for Flight.java
//********************************************************************

public class Flight
{
   private String airline, originCity, destCity;
   private int flightNum;
   
   /* Creates instant data */
   public Flight(String airlineInstant, int flightNumberInstant, 
                 String originCityInstant, String destCityInstant)
   {
      airline = airlineInstant;
      flightNum = flightNumberInstant;
      originCity = originCityInstant;
      destCity = destCityInstant;
   }

   /* Set Airline Name */
   public void setAirline(String newAirline)
   {
      airline = newAirline;
   }

   /* Set Flight Number */
   public void setFlightNum(int newFlightNum)
   {
      flightNum = newFlightNum;
   }
   
   /* Set Originate City */
   public void setOriginCity(String newOriCity)
   {
      originCity = newOriCity;
   }

   /* Set Destination City */
   public void setDestCity(String newDestCity)
   {
      destCity = newDestCity;
   }

   /* Get airline info below */
   public String getAirline()
   {
      return airline;
   }
   /* get Originate city */
   public String getOriginCity()
   {
      return originCity;
   }

   /* get flight number */
   public int getFlightNum()
   {
      return flightNum;
   }
   
   /* get Destination */
   public String getDestCity()
   {
      return destCity;
   }
   
   /* toString method to return overall info */
   public String toString()
   {
      String info = "Overall info is: \nAirline: " + airline + 
         "\nFlight Number: " + Integer.toString(flightNum) + "\nFrom: " + 
         originCity + "\nDestination: " + destCity + "\n \n";
      return info;
   }
}

