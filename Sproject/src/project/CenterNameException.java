package project;

public class CenterNameException extends Exception {
	public CenterNameException(String centerName) {
		if(centerName.length()==0) {
			System.out.println("Center Name Shouldn't be Blank.");
	}
}
}