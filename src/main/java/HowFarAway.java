import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
       double startLatitude;
       double endLatitude;
       double startLongitude;
       double endLongitude;

       Scanner in = new Scanner(System.in);
       System.out.println("Enter the latitude of the starting location: ");
       startLatitude = in.nextDouble();
       System.out.println("Enter the longitude of the starting location: ");
       startLongitude = in.nextDouble();
       System.out.println("Enter the latitude of the ending location: ");
       endLatitude = in.nextDouble;
       System.out.println("Enter the longitude of the ending location: ");
       endLongitude = in.nextDouble();
       
       GeoLocation startingLocation = new GeoLocation(startLatitude, startLongitude);
       GeoLocation endingLocation = new GeoLocation(endLatitude, endLongitude);

       distanceMiles = startingLocation.distanceFrom(endingLocation);
       System.out.print("The distance is " + distanceMiles + " miles.");
    }
}