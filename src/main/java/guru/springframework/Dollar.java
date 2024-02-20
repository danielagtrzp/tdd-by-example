package guru.springframework;

public class Dollar {

	public int ammount;

	public Dollar(int ammount) {
		this.ammount = ammount;
	}

	public void times(int times) {
	    ammount *= times;
	}

}
