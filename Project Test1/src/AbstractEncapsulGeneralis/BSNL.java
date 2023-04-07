package AbstractEncapsulGeneralis;

public class BSNL implements Simcard{
	
	public void AudioCalling() {
		
		System.out.println("Daily 16hr Audio Calling");
		
	}
	
	public void TextMessage() {
		
		System.out.println("Monthly 200 SMS");
		
	}

	public void Internet() {
		
		System.out.println("Daily 3 GB Data");
	
	}
	
	public void NewFeature2() { // not common and important
		
		System.out.println("Remaing data Carry forward to weekend");
	
	}

}
