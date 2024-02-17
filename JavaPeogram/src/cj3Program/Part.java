package cj3Program;

public class Part {

	public static void main(String[] args) {
		int row =4;
		int str =0;
		int spc =0;
		for(int i=0; i<=row;i++) {
			for(int j=0; j<=str;j++) {
				System.out.println();
			}
			for(int j=0; j<=str;j++) {
				System.out.print("*");
				
			}
			System.out.println();
			spc++;
			str--;
		}

	}

}
