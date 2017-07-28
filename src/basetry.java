import java.util.Random;
public class basetry {
	public static void main(String[] args){
		
for(int i=0;i<10;i++)
{
	System.out.println(randInt(80,90));
}
    HTMLtoString.make_Player("SourceTexts/Ronaldo.txt").printHim();
	}
	public static int randInt(int min, int max) {
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
}

