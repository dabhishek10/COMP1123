//********************************************************************
//  FlightTest.java       Author: Luxing Huang (100113287)
//
//  This is for the bouns question
//********************************************************************

public class FlightTest
{
   //-----------------------------------
   // Bonus Question
   //
   // Flight | PP 4.6 | p.202
   //-----------------------------------
   public static void main(String[] args)
   {
      Flight flight = new Flight("AirCanada", 123, "Halifax", "Toronto");
      System.out.println(flight);
 
      /* Setting Airline name */
      flight.setAirline("Virgin Atlantic");
      System.out.println("Changed Airline");
      System.out.println(flight);

      /* Setting Flight Number */
      flight.setFlightNum(250);
      System.out.println("Changed flight number");
      System.out.println(flight);

      /* Setting flight's origion */
      flight.setOriginCity("London");
      System.out.println("Change Origin City");
      System.out.println(flight);

      /* Setting flight's destination city */
      flight.setDestCity("Shanghai");
      System.out.println("Changed Destination city");
      System.out.println(flight);

      /* Getting flight information */
      System.out.println("Get Airline: " + flight.getAirline());
      System.out.println("Get Flight Number: " + flight.getFlightNum());
      System.out.println("Get Originate from: " + flight.getOriginCity());
      System.out.println("Get Destination city: " + flight.getDestCity());

   }
}

