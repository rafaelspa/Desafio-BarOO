package Bar;

public class Bill {

	char gender;
	int beer;
	int barbecue;
	int softDrink;

	
	
	public double cover() {
		if (feeding() <= 30.0) {
			return 4.0;
		} else {
			return 0.0;
		}
	}
	
	public double feeding() {
		return beer * 5.0 + softDrink * 3.0 + barbecue * 7.0;
	}
	
	public double ticket() {
		if (gender == 'F') {
			return 8.0;
		} else {
			return 10.0;
		}
	}
	
	public double total() {
		return ticket() + feeding() + cover();
	}
}
