package APComputerScience;

public class mysteryMixMain {

	public static void main(String[] args) {
		mysteryMix("la-la-la!");
	}
	public static void mysteryMix(String str) {
		int len = str.length();
		if(len >= 3) {
			mysteryMix(str.substring(0, len/3));
			System.out.print(str.substring(len/3, 2*len / 3));
			mysteryMix(str.substring(2*len/3));
		}
	}
}
