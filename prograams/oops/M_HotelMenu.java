package prograams.oops;

public class M_HotelMenu implements M_Hotel,M_Menu{

	
	//Explicit Overriding

	@Override
	public void vegFood() {
		System.out.println("Veg Foods");
		
	}

	@Override
	public void nonVegFood() {
		System.out.println("Non Veg Foods");
		
	}

	@Override
	public void hotelTypes() {
		System.out.println("Hotel Types");
		
	}

	@Override
	public void hotelRecipies() {
		System.out.println("Hotel Recipies");
	}

	public static void main(String[] args) {
		M_HotelMenu hm = new  M_HotelMenu();
		hm.vegFood();
		hm.nonVegFood();
		hm.hotelTypes();
		hm.hotelRecipies();
		
	}
}
