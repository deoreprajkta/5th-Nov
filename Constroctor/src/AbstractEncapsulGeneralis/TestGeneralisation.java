package AbstractEncapsulGeneralis;

public class TestGeneralisation {
	public static void main(String[]args) {
		System.out.println("******Specification of Airtel******");
		Airtel x = new Airtel();
		x.Audiocalling();
		x.TextMessages();
		x.UnlimitedData();
		x.AmazonPrime();
		
		System.out.println("******Specification of Jio******");
		Jio y = new Jio();
		y.AudioCalling();
		y.TextMessages();
		y.UnlimitedData();
		
		System.out.println("******specification of Vi******");
		Vi z = new Vi();
		y.AudioCalling();
		y.TextMessages();
		y.UnlimitedData();
		y.Hotstar();
	}
}
		