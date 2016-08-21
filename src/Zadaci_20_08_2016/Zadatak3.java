package Zadaci_20_08_2016;

public class Zadatak3 {
	private long mStartTime;
	private long mEndTime;

	private boolean mIsOn;

	public Zadatak3() {
		mStartTime = System.currentTimeMillis();
	}

	// Getter za startno vrijeme
	public long getStartTime() {
		return mStartTime;
	}

	// Getter za krajnje vrijeme
	public long getEndTime() {
		return mEndTime;
	}

	// Metoda start koja krece sa stopericom
	public void start() {
		mIsOn = true;
		mStartTime = System.currentTimeMillis();
	}

	// Metoda stop koja tavrsava stopericu
	public void stop() {
		mEndTime = System.currentTimeMillis();
		mIsOn = false;
	}

	// Metoda koja izracunava vrijeme izmedju kraja i pocetka
	public long getElapsedTime() {
		return mEndTime - mStartTime;
	}
}
