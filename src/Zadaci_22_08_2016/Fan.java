package Zadaci_22_08_2016;

public class Fan {
	// Pravimo 3 staticne konstate slow medium i fast za odredjivanje brzine
	// fana
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	// Cetiri privatna data fielda
	private int mSpeed;
	private boolean mOn;
	private double mRadius;
	private String mColor;

	// No args konstruktor
	public Fan() {
		// Brzina je 1 radius je 5 i boja je bijela
		mSpeed = 1;
		mRadius = 5;
		mColor = "white";
	}

	// Pravimo gettere i settere za sve privatne data fieldove kako bi ih mogli
	// implementirati u test klasi
	public int getSpeed() {
		return mSpeed;
	}

	public void setSpeed(int speed) {
		mSpeed = speed;
	}

	public boolean isOn() {
		return mOn;
	}

	public void setOn(boolean on) {
		mOn = on;
	}

	public double getRadius() {
		return mRadius;
	}

	public void setRadius(double radius) {
		mRadius = radius;
	}

	public String getColor() {
		return mColor;
	}

	public void setColor(String color) {
		mColor = color;
	}

	// Zatim pravimo metodu tostring koja sve pretvara u string te tako
	// ispisujemo
	public String toString() {
		if (isOn()) {
			return "Speed: " + getSpeed() + " Color: " + getColor() + " Radius: " + getRadius();
		} else {
			return "Color: " + getColor() + " Radius: " + getRadius() + ". The fan is OFF.";
		}
	}
}
