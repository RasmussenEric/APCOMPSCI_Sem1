import java.util.ArrayList;
public class Satellite
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));
		
       double[] home = {0, 0};
	   
       String printout = "\n\n" +
               "==========================" + "\nStarting locations...";


       for (Location l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }


       printout += "\n\n" + "==========================" +
                   "\nDistance from home...";


       for (Location l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }


       System.out.println(printout);
	   
	   
	   
	   
	   
	   
	   
	   System.out.println("\n==========================");
	  
	  for(Location l : locate)
		{
			
			double d1 = (int)(Math.random() * 100) + 1;
			double d2 = (int)(Math.random() * 100) + 1;
			
			double[] location = l.getLoc();
			
			System.out.println("\nAfter " + l.getID() + " moved (" + d1 + ", " + d2 + ")");
			
			(l).move(d1, d2);
			
			System.out.println("New Location: (" + location[0] + ", " + location[1] + ")");
		}
		
		System.out.println("\n==========================");
		System.out.println("\nDistance from home...");
		
	   for(Location l : locate)
	    {
			
			System.out.println("	Distance for " + l.getID() + ": " + getDistance(l.getLoc() , home));

		 
	    }
	   
	   
	   
   }

   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}