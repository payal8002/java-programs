package cj3Program;
import java.io.IOException;

public class FileReader {
	
	    public static void main(String[] args) throws CloneNotSupportedException {
	        FileReader fileReader = new FileReader();
			int character;

			while ((character = fileReader.read()) != -1) {
			    System.out.print((char) character);
			}

			fileReader.clone();
	    }

		private int read() {
			// TODO Auto-generated method stub
			return 0;
		}

	
	}


