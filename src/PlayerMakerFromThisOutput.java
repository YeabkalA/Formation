import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class PlayerMakerFromThisOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<100;i++)
{
	System.out.println(namesArray("SourceTexts/names.txt")[i]);
	System.out.println("Unknown");
	for(int j=0;j<10;j++)
	{
		System.out.println(getRandoms(65,89));
	}
}

	}

	public static int getRandoms(int min, int max) {

	    // NOTE: This will (intentionally) not run as written so that folks
	    // copy-pasting have to think about how to initialize their
	    // Random instance.  Initialization of the Random instance is outside
	    // the main scope of the question, but some decent options are to have
	    // a field that is initialized once and then re-used as needed or to
	    // use ThreadLocalRandom (if using at least Java 1.7).
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	// this creates the array of all the male names from the
	// names.txt, even though it is set up as a general function
	static String[] namesArray(String filename){
		String[] names = new String[100];
		try{
	    String line = "";
	    int index=0;
	    FileReader f = new FileReader(filename);
	    BufferedReader reader = new BufferedReader(f);
	    int k = 0;
	while( k< 100){
		boolean first = false;
		int secondindex = 0, firstindex = 0;
		line = reader.readLine();
		line = line.replaceAll("\\s","");
		line = line.replaceAll("[0-9]",""); //this and the above line remove numbers and spaces from each line
		for(int i=1;;i++) //starts from 1 because it purposely ommits the first uppercase letter of the 
			// line, which is the first letter of the man's name
		{
			if(Character.isUpperCase(line.charAt(i)))
			{
			index= i; // gets the place where the firstuppercase, i.e, the beginning of a girl's name, is
			break;
			}
		}
		names[k] = line.substring(0,index-1); // gets the substring from the first character to the place
		// where the second uppercase letter was found, i.e gets the man's name
				k++;	
	}
				
		}
		catch (IOException x) {
		    System.err.format("IOException", x);
		}
		return names;
	}
}

