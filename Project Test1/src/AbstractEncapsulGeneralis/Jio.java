package AbstractEncapsulGeneralis;

public class Jio implements Simcard {
	
	public void AudioCalling() {
		
		System.out.println("Unlimited audio Calling");
		
	}
	
	public void TextMessage() {
		
		System.out.println("Daily 100 SMS");
		
	}

	public void Internet() {
		
		System.out.println("Daily 2 GB Data");
	
	}

	public void NewFeature() { // not common and important
		
		System.out.println("2 OTT Subscription");
	
	}

}
