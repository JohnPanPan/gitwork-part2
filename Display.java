package clock;

public class Display {
	
	private int value = 0;
	private int limit = 0;
	
	public Display( int limit ) {
		
		this.limit = limit;
	}
	
	public void increase() {
		value++;
		if ( value == limit ) {
			value = 0;
		}
	}
	
	public int getvalue() {
		return value;
	}

}
