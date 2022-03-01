package interfacetest;

public class usbtest {
	public static void main(String[] args) {
		
	}

}

class Computer{
	public void transferData(USB usb) {
		usb.start();
	}
}

interface USB{
	public void start();
}