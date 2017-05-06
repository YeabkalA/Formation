
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
class proj_try{
    public static void main(String[] args)
    {
        Player[] playerz = sortOverall(auto_make_100Players());
	for(int j=0;j<100;j++)
	    {
		playerz[j].printHim();
		
	       
	    }
    }
    
    public static Player[] sortOverall(Player[] playerz) 
    {
        Player temp = new Player();
        for (int i = 0; i < playerz.length; i++) 
        {
            for (int j = i + 1; j < playerz.length; j++) 
            {
                if (playerz[i].overall() < playerz[j].overall()) 
                {
                    temp = playerz[i];
                    playerz[i] = playerz[j];
                    playerz[j] = temp;
                }
            }
        }
       return playerz;
    }
    
    
   
    static Player[] auto_make_100Players()
    {
        Player[] ret = new Player[100];
    	String name = "";
    	int BallSkills = 0; // Average of Ball Control and Dribbling
        int Defensive = 0; // Average of Sliding and Standing Tackles, Marking, and Interception
        int Mental = 0; // Average of Aggression, Reactions, Vision, Composure, and Att. Position
        int Passing = 0; // Average of Long and Short Passes as well as Crossing
        int Speed=0; // Average of Acceleration and Sprint Speed
        int Physical = 0; // Average of Stamina, Strength, Balance, and Agility
        int Heading = 0; // Average of Heading and Jumping
        int Attacking = 0; // Average of Shoot Power, Finishing, Long Shots, Volleys, and Curve
        int SetPieces = 0; // Average of Penalties as well as FK Acc.
        int GK = 0; // Average of GK Positioning, Diving, Handling, and Reactions
    	for(int i=0;i<100;i++)
    	{
    		name = namesArray("SourceTexts/names.txt")[i];
    		BallSkills = getRandoms(60,97);
            Defensive = getRandoms(60,97);
            Mental = getRandoms(60,97);
            Passing = getRandoms(60,97);
            Speed = getRandoms(60,97);
            Physical = getRandoms(60,97);
            Heading = getRandoms(60,97);
            Attacking =getRandoms(60,97);
            SetPieces = getRandoms(60,97);
            GK = getRandoms(60,97);
    		
    		ret[i] = new Player(name,"Unknown",BallSkills,Defensive,Mental,
 				   Passing,Speed,Physical,Heading,Attacking,SetPieces,GK);
    	}
    	return ret;
    }
    // for T number of times
    // this function asks all the 12 attributes of a Player
    // and creates a player at a time for T times
    // finally returns the Player[] containing
    // all the user created players
    
    // if PlayerMakerFromThisOutput.java is run and if its output is 
    // inputed for this function, it creates 100 players
    static Player[] make_n_Players(int T)
    {
	Scanner a = new Scanner(System.in);
	String Name ="";
    String Club_Country="";
    int BallSkills = 0; // Average of Ball Control and Dribbling
    int Defensive = 0; // Average of Sliding and Standing Tackles, Marking, and Interception
    int Mental = 0; // Average of Aggression, Reactions, Vision, Composure, and Att. Position
    int Passing = 0; // Average of Long and Short Passes as well as Crossing
    int Speed=0; // Average of Acceleration and Sprint Speed
    int Physical = 0; // Average of Stamina, Strength, Balance, and Agility
    int Heading = 0; // Average of Heading and Jumping
    int Attacking = 0; // Average of Shoot Power, Finishing, Long Shots, Volleys, and Curve
    int SetPieces = 0; // Average of Penalties as well as FK Acc.
    int GK = 0; // Average of GK Positioning, Diving, Handling, and Reactions
    Player[] players = new Player[T];
    for(int i=0;i<T;i++)
	{
		System.out.println("Who is the player called?");
		Name = a.next();
		System.out.println("Where is he from?");
		Club_Country = a.next();
		System.out.println("Enter his ball skills");
		BallSkills = a.nextInt();
		System.out.println("Enter his defensive skills");
		Defensive = a.nextInt();
		System.out.println("Enter his mental abilities");
		Mental = a.nextInt();
                System.out.println("Enter his passing skills");
		Passing = a.nextInt();
		System.out.println("Enter his speed rating");
		Speed = a.nextInt();
		System.out.println("Enter his Physical raing");
		Physical = a.nextInt();
		System.out.println("Enter his ball heading skills");
		Heading = a.nextInt();
		System.out.println("Enter his attacking skills");
		Attacking = a.nextInt();
		System.out.println("Enter his set piece ratings");
		SetPieces = a.nextInt();
		System.out.println("Enter his GK ratings");
		GK = a.nextInt();
	    
	Player player = new Player(Name,Club_Country,BallSkills,Defensive,Mental,
				   Passing,Speed,Physical,Heading,Attacking,SetPieces,GK);
	players[i]=player;
	}
    return players;
    }
	    
    static void makeMultiplePlayers()
    {
	Scanner mn = new Scanner(System.in);
	System.out.println("How many Players do you want to make?");
	int T = mn.nextInt();
	for(int i=1;i<=T;i++)
	    {
		make();
	    }
    }
    static void make()
    {
	int[] arr = new int[34];
	Scanner a = new Scanner(System.in);
	String name="";
	String cc="";
	System.out.println("Enter Name");
	name = a.nextLine();
	System.out.println("Enter CC");
	cc = a.nextLine();
	System.out.println("Enter the attributes as follows " + "\n");
	for(int i=0; i<34;i++)
	    {
		System.out.println(i);
		arr[i] = a.nextInt();
	    }
	int BallSkills = (arr[0]+arr[1])/2;
	int Defensive = (arr[2]+arr[3]+arr[4]+arr[8])/4;
	int Mental = (arr[5]+arr[6]+arr[7]+arr[9]+arr[10])/5;
	int Passing = (arr[11]+arr[12]+arr[13])/3;
	int Speed = (arr[14]+arr[18])/2;
	int Physical = (arr[15]+arr[16]+arr[17]+arr[19])/4;
	int Heading = (arr[20]+arr[21])/2;
	int Shooting = (arr[22]+arr[23]+arr[24]+arr[25]+arr[28])/5;
        int SetPieces = (arr[26]+arr[27])/2;
        int GK = (arr[29]+arr[30]+arr[31]+arr[32]+arr[33])/5;
	System.out.println("Player " + name+ " = new Player(" + name + "," + cc +
			   "," + BallSkills + ","+ Defensive + "," + Mental + "," +
			   Passing + "," + Speed + ","+Physical+","+Heading+","+
			   Shooting + ","+SetPieces+","+ GK +");");
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
		line = line.replaceAll(",", "");
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
		names[k] = line.substring(0,index); // gets the substring from the first character to the place
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