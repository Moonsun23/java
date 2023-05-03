package inter;

public interface PhoneInterface {				//phone 1
	public static final int TIMEOUT=10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	public default void printLogo() {				//
		System.out.println("===PHONE===");
	}
}
