
	
	
	public class MyOperators {

		public static void main(String[] args) {
			
			

	        byte numOfSeats = 4;
	        byte numOfDoors = 2;
	        byte numOfVehicalOwner = 1;
	       
	        short power = 362;
	       
	        int price = 24586;
	       
	        int mileage = 12535;

	        long regNum = 123456789l;

	        float fuelConsuptionNum = 10.25f;

	        double fuelConsuptionAvg = 123.2456215;
	        int moneyInBank = 20000;

	        boolean isDamadge = true;

	        char energyEfficiencyCat = 'G';
	        
	        String carMod = "90's Wintage 258";
	        String newCarMod = new String("90's Wintage 258");

	        
	        System.out.println("2014 wintage car");
	        System.out.println("Vehical owner:" +numOfVehicalOwner);
	        System.out.println("Num of seats:" +numOfSeats);
	        System.out.println(" Num of doors:" +numOfDoors);
	        System.out.println("Power:" + power);
	     
	        System.out.println("Price:" +carMod+ "$" +price);
	        System.out.println("Mileage:" +mileage);
	        System.out.println("Reg Num:" +regNum);
	        System.out.println("Fuel Consuption:" +fuelConsuptionNum);
	        System.out.println(" Avg Fuel consuption:" +fuelConsuptionAvg);
	        System.out.println(" The car is damaged:" +isDamadge);
	        System.out.println("Energy Efficiency category:" +energyEfficiencyCat);
	        System.out.println("the car model:" +carMod);
	        System.out.println("the new car model:" +newCarMod.toLowerCase());
	        System.out.println("the new car model:" +newCarMod.toUpperCase());
	        System.out.println("the new car model:" +carMod.equals(newCarMod));
	        
	        
	        int incPrice = price + 5000;
	        System.out.println("Inc Price:" +carMod+ "$" +incPrice);
	        
	        int decPrice = price - 5000;
	        System.out.println("Dec Price:" +carMod+ "$" +decPrice);
	        
	        int twoPrice = price * 2;
	        System.out.println("Two Price:" +carMod+ "$" +twoPrice);
	        
	        int recMoneyInBank = moneyInBank / 2;
	        System.out.println("current amount in bank:" +recMoneyInBank);
	        
	        
	        
	        
	        
	        
	        
	        

		}

	}


