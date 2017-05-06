import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Sorter {
	static Player[] Madridistas = new Player[33];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		make_it("SourceTexts/Ronaldo.txt");
System.out.println(removeTags2("SourceTexts/FifaIndex.txt"));
		for(int i =0;i<34;i++)
		{
			System.out.println(make_an_array_of_all_attributes("SourceTexts/Ronaldo.txt")[i]);
		}

		
	 Player[] Madridistas = new Player[33];

		
		
		//make_Player("SourceTexts/Ronaldo.txt").printHim();
		//make_Player("SourceTexts/Ramos.txt").printHim();
		//make_Player("SourceTexts/Abad.txt").printHim();
		
		Madridistas[0] = make_Player("SourceTexts/Ronaldo.txt");
		Madridistas[1] = make_Player("SourceTexts/Abad.txt");
		Madridistas[2] = make_Player("SourceTexts/Alex.txt");
		Madridistas[3] = make_Player("SourceTexts/Asensio.txt");
		Madridistas[4] = make_Player("SourceTexts/Bale.txt");
		Madridistas[5] = make_Player("SourceTexts/Benzema.txt");
		Madridistas[6] = make_Player("SourceTexts/Carvajal.txt");
		Madridistas[7] = make_Player("SourceTexts/Casemiro.txt");
		Madridistas[8] = make_Player("SourceTexts/Casilla.txt");
		Madridistas[9] = make_Player("SourceTexts/Coentrao.txt");
		Madridistas[10] = make_Player("SourceTexts/Danilo.txt");
		Madridistas[11] = make_Player("SourceTexts/Enzo.txt");
		Madridistas[12] = make_Player("SourceTexts/Febas.txt");
		Madridistas[13] = make_Player("SourceTexts/Hakimi.txt");
		Madridistas[14] = make_Player("SourceTexts/Isco.txt");
		Madridistas[15] = make_Player("SourceTexts/James.txt");
		Madridistas[16] = make_Player("SourceTexts/Kovacic.txt");
		Madridistas[17] = make_Player("SourceTexts/Lienhart.txt");
		Madridistas[18] = make_Player("SourceTexts/Marcelo.txt");
		Madridistas[19] = make_Player("SourceTexts/Mariano.txt");
		Madridistas[20] = make_Player("SourceTexts/Modric.txt");
		Madridistas[21] = make_Player("SourceTexts/Morata.txt");
		Madridistas[22] = make_Player("SourceTexts/Nacho.txt");
		Madridistas[23] = make_Player("SourceTexts/Vergos.txt");
		Madridistas[24] = make_Player("SourceTexts/Tejero.txt");
		Madridistas[25] = make_Player("SourceTexts/Varane.txt");
		Madridistas[26] = make_Player("SourceTexts/Vazquez.txt");
		Madridistas[27] = make_Player("SourceTexts/Ramos.txt");
		Madridistas[28] = make_Player("SourceTexts/Yanez.txt");
		Madridistas[29] = make_Player("SourceTexts/Diaz.txt");
		Madridistas[30] = make_Player("SourceTexts/Kroos.txt");
		Madridistas[31] = make_Player("SourceTexts/Pepe.txt");
		Madridistas[32] = make_Player("SourceTexts/Keylor.txt");
		
	
//		File f = new File("SourceTexts/");
//		File[] x = f.listFiles();
//		
//		int ii = 0;
//		String file = "";
//		for(File g : x){
//			file="SourceTexts/RM/"+g.getName();
//			Madridistas[ii] = make_Player(file);
//			ii++;
//		}

		Player[] Defenders =sortDefense(Madridistas);
		Player[] Midfielders = sortMid(Madridistas);
		Player[] Attackers = sortAttack(Madridistas);
	
		Player[] roster_GK = new Player[2];
		Player[] roster_Def = new Player[6];
		Player[] roster_Mid = new Player[6];
		Player[] roster_Attack = new Player[4];
		Player[] roster = new Player[18];
		int rcount=0;
		
		int count = 0;
		for(int i = 0;i<sortDefense(Madridistas).length;i++)
		{
			if(count>=6)
				break;
			if(getIndex(sortDefense(Madridistas)[i],sortDefense(Madridistas)) < getIndex(sortDefense(Madridistas)[i],sortMid(Madridistas)) &&
					getIndex(sortDefense(Madridistas)[i],sortDefense(Madridistas)) < getIndex(sortDefense(Madridistas)[i],sortAttack(Madridistas)) &&
							check_upTo(sortDefense(Madridistas)[i], roster, rcount) ==false)
			{
				roster_Def[count] = sortDefense(Madridistas)[i];
				roster_Def[count].printHim();
				count++;
				roster[rcount]=sortDefense(Madridistas)[i];
				rcount++;
			}
		}
		
		
	//-------------------------------------------------
		count=0;
//		System.out.println("Trying the function");
//		for(int y=0;y<6;y++)
//		{
//			roster[y].printHim();
//		}
		System.out.println("And now for the mids...");
		for(int l = 0;l<sortMid(Madridistas).length;l++)
		{
			if(count>=6)
				break;
			if(getIndex(sortMid(Madridistas)[l],sortMid(Madridistas)) < getIndex(sortMid(Madridistas)[l],sortDefense(Madridistas)) &&
					getIndex(sortMid(Madridistas)[l],sortMid(Madridistas)) <= getIndex(sortMid(Madridistas)[l],sortAttack(Madridistas))
					&& check_upTo(sortMid(Madridistas)[l], roster, rcount) ==false)
			{
				roster_Mid[count] = sortMid(Madridistas)[l];
				roster_Mid[count].printHim();
				count++;
				roster[rcount]=sortMid(Madridistas)[l];
				rcount++;
			}
			
		}
		count=0;
		//----------------------------------------------
		for(int c = 0;c<sortAttack(Madridistas).length;c++)
		{
			if(count>=4)
				break;
			if(getIndex(sortAttack(Madridistas)[c],sortAttack(Madridistas)) < getIndex(sortAttack(Madridistas)[c],sortMid(Madridistas)) &&
					getIndex(sortAttack(Madridistas)[c],sortAttack(Madridistas)) <= getIndex(sortAttack(Madridistas)[c],sortDefense(Madridistas))
					&& check_upTo(sortAttack(Madridistas)[c], roster, rcount) ==false)
			{
				roster_Attack[count] = sortAttack(Madridistas)[c];
				roster_Attack[count].printHim();
				count++;
				roster[rcount]=sortAttack(Madridistas)[c];
				rcount++;
			}
			
		}
		
		System.out.println("Trying the function");
		for(int y=0;y<16;y++)
		{
			roster[y].printHim();
		}
		for(int i=0;i<Madridistas.length;i++)
		{
			System.out.println(sortGK(Madridistas)[i].Name + "          " + sortDefense(Madridistas)[i].Name + "       " + sortMid(Madridistas)[i].Name + "       "  + sortAttack(Madridistas)[i].Name);
		}
		
	}
	public static Player[] getRosterDefenses(Player[] p)
	{
		Player[] roster_Def = new Player[6];
		
		
		for(int i = 0;i<6;i++)
		{
			if(getIndex(sortDefense(p)[i],sortDefense(p)) < getIndex(sortDefense(p)[i],sortMid(p)) &&
					getIndex(sortDefense(p)[i],sortDefense(p)) < getIndex(sortDefense(p)[i],sortAttack(p)))
			{
				roster_Def[i] = sortDefense(p)[i];
				//roster_Def[count].printHim();
			}
		}
		return roster_Def;
		
	}
	public static Player[] sortGK(Player[] playerz) 
    {
        Player temp = new Player();
        for (int i = 0; i < playerz.length; i++) 
        {
            for (int j = i + 1; j < playerz.length; j++) 
            {
                if (playerz[i].GK < playerz[j].GK) 
                {
                    temp = playerz[i];
                    playerz[i] = playerz[j];
                    playerz[j] = temp;
                }
            }
        }
       return playerz;
    }
	
	public static Player[] sortAttack(Player[] playerz) 
    {
        Player temp = new Player();
        for (int i = 0; i < playerz.length; i++) 
        {
            for (int j = i + 1; j < playerz.length; j++) 
            {
                if (playerz[i].Attacking < playerz[j].Attacking) 
                {
                    temp = playerz[i];
                    playerz[i] = playerz[j];
                    playerz[j] = temp;
                }
            }
        }
       return playerz;
    }
	
	public static Player[] sortMid(Player[] playerz) 
    {
        Player temp = new Player();
        for (int i = 0; i < playerz.length; i++) 
        {
            for (int j = i + 1; j < playerz.length; j++) 
            {
                if ((0.1*playerz[i].Physical +0.1 *playerz[i].Heading + 0.1*playerz[i].Defensive + playerz[i].BallSkills + 0.4*playerz[i].Mental + playerz[i].Passing + 0.1*playerz[i].Attacking) < 
                		(0.1*playerz[j].Physical +0.1 *playerz[j].Heading + 0.1*playerz[j].Defensive + playerz[j].BallSkills + 0.4*playerz[j].Mental + playerz[j].Passing + 0.1*playerz[j].Attacking)) 
                {
                    temp = playerz[i];
                    playerz[i] = playerz[j];
                    playerz[j] = temp;
                }
            }
        }
       return playerz;
    }
	public static Player[] sortDefense(Player[] playerz) 
    {
        Player temp = new Player();
        for (int i = 0; i < playerz.length; i++) 
        {
            for (int j = i + 1; j < playerz.length; j++) 
            {
                if ((0.2*playerz[i].Physical +0.2 *playerz[i].Heading + playerz[i].Defensive) < (0.2*playerz[j].Physical +0.2 *playerz[j].Heading + playerz[j].Defensive)) 
                {
                    temp = playerz[i];
                    playerz[i] = playerz[j];
                    playerz[j] = temp;
                }
            }
        }
       return playerz;
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
	public static Player make_Player(String filename)
	{
		String name = filename.replaceAll("SourceTexts/","");
		name = name.replaceAll(".txt", "");
		int[] arr = make_an_array_of_all_attributes(filename);
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
	    Player ret = new Player(name, "Port", BallSkills, Defensive, Mental, Passing,
	    		Speed, Physical, Heading, Shooting, SetPieces, GK);
	    return ret;
	    		
	}
	static int getInt_of_getValue(String getval)
	{
		int pointer = 0;
		for(int i = 0; i < getval.length(); i++)
		{
			if(Character.isDigit(getval.charAt(i)))
			{
				pointer = i;
				break;
			}
		}
		return (Integer.parseInt(getval.substring(pointer)));
				
		}
	static String getValueret(String line, String attribute)
	{
		
		String value = line.substring(line.length()-20,line.length()-18);
		if(value.contains(">"))
			value = value.replaceAll(">", "");
		return attribute + " " + value;
	}
	static void getValue(String line, String attribute)
	{
		
		String value = line.substring(line.length()-20,line.length()-18);
		if(value.contains(">"))
			value = value.replaceAll(">", "");
		System.out.println(attribute + " " + value);
	}
	
	static int[] make_an_array_of_all_attributes(String filename)
	{
		int arr[] = new int[34];
		try{
		    String line = "";
		    String line2="";
		    
		    int i=0;
		    FileReader f = new FileReader(filename);
		    BufferedReader reader = new BufferedReader(f);
		//while((line = reader.readLine()) != null){
		    while(i<1700){
			line = reader.readLine();
			i++;
			if(line.contains("Ball Control") && line.contains("<p>"))
			    arr[0] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Dribbling") && line.contains("<p>"))
				arr[1] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Marking") && line.contains("<p>"))
				arr[2] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Slide Tackle") && line.contains("<p>"))
				arr[3] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Stand Tackle") && line.contains("<p>"))
				arr[4] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Aggression") && line.contains("<p>"))
				arr[5] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Reactions") && line.contains("<p>"))
				arr[6] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Att. Position") && line.contains("<p>"))
				arr[7] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Interceptions") && line.contains("<p>"))
				arr[8] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Vision") && line.contains("<p>"))
				arr[9] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Composure") && line.contains("<p>"))
				arr[10] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Crossing") && line.contains("<p>"))
				arr[11] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Short Pass") && line.contains("<p>"))
				arr[12] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Long Pass") && line.contains("<p>"))
				arr[13] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Acceleration") && line.contains("</p>"))
				arr[14] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Stamina") && line.contains("<p>"))
				arr[15] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Strength") && line.contains("<p>"))
				arr[16] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Balance") && line.contains("<p>"))
				arr[17] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Sprint Speed") && line.contains("<p>"))
				arr[18] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Agility") && line.contains("<p>"))
				arr[19] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Jumping") && line.contains("<p>"))
				arr[20] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Heading") && line.contains("<p>"))
				arr[21] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Shot Power") && line.contains("<p>"))
				arr[22] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Finishing") && line.contains("<p>"))
				arr[23] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Long Shots") && line.contains("<p>"))
				arr[24] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Curve") && line.contains("<p>"))
				arr[25] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("FK Acc.") && line.contains("<p>"))
				arr[26] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Penalties") && line.contains("<p>"))
				arr[27] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("Volleys") && line.contains("<p>"))
				arr[28] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("GK Positioning") && line.contains("<p>"))
				arr[29] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("GK Diving") && line.contains("<p>"))
				arr[30] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("GK Handling") && line.contains("<p>"))
				arr[31] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("GK Kicking") && line.contains("<p>"))
				arr[32] = getInt_of_getValue(getValueret(line,"Ball Control"));
			if(line.contains("GK Reflexes") && line.contains("<p>"))
				arr[33] = getInt_of_getValue(getValueret(line,"Ball Control"));
			}
		}
			catch (IOException x) {
			    System.err.format("IOException", x);
			}
		/*for(int i=0;i<arr.length;i++){
			if(arr[i].contains("Acceleration") && arr[i].contains("<p>"))
			    getValue(arr[i],"Acceleration");
	}*/
		return arr;
	}
	
	
	//Gets the file for the HTML source code of a player and
	// prints out like 
	// Balance 90
	// Shot Power 90
	static void make_it(String filename)
	{
		String ret="";
		String[] arr = new String[1775];
		try{
		    String line = "";
		    String line2="";
		    
		    int i=0;
		    FileReader f = new FileReader(filename);
		    BufferedReader reader = new BufferedReader(f);
		//while((line = reader.readLine()) != null){
		    while(i<1700){
			line = reader.readLine();
			arr[i]=line;
			i++;
			if(line.contains("Ball Control") && line.contains("<p>"))
			    getValue(line,"Ball Control");
			if(line.contains("Dribbling") && line.contains("<p>"))
				getValue(line,"Driblling");
			if(line.contains("Marking") && line.contains("<p>"))
				getValue(line,"Marking");
			if(line.contains("Slide Tackle") && line.contains("<p>"))
				getValue(line,"Slide Tackle");
			if(line.contains("Stand Tackle") && line.contains("<p>"))
				getValue(line,"Stand Tackle");
			if(line.contains("Aggression") && line.contains("<p>"))
				getValue(line,"Aggression");
			if(line.contains("Reactions") && line.contains("<p>"))
				getValue(line,"Reactions");
			if(line.contains("Att. Position") && line.contains("<p>"))
				getValue(line,"Att. Position");
			if(line.contains("Interceptions") && line.contains("<p>"))
				getValue(line,"Interceptions");
			if(line.contains("Vision") && line.contains("<p>"))
				getValue(line,"Vision");
			if(line.contains("Composure") && line.contains("<p>"))
				getValue(line,"Composure");
			if(line.contains("Crossing") && line.contains("<p>"))
				getValue(line,"Crossing");
			if(line.contains("Short Pass") && line.contains("<p>"))
				getValue(line,"Short Pass");
			if(line.contains("Long Pass") && line.contains("<p>"))
				getValue(line,"Long Pass");
			if(line.contains("Acceleration") && line.contains("</p>"))
				getValue(line,"Acceleration");
			if(line.contains("Stamina") && line.contains("<p>"))
				getValue(line,"Stamina");
			if(line.contains("Strength") && line.contains("<p>"))
				getValue(line,"Strength");
			if(line.contains("Balance") && line.contains("<p>"))
				getValue(line,"Balance");
			if(line.contains("Sprint Speed") && line.contains("<p>"))
				getValue(line,"Sprint Speed");
			if(line.contains("Agility") && line.contains("<p>"))
				getValue(line,"Agility");
			if(line.contains("Jumping") && line.contains("<p>"))
				getValue(line,"Jumping");
			if(line.contains("Heading") && line.contains("<p>"))
				getValue(line,"Heading");
			if(line.contains("Shot Power") && line.contains("<p>"))
				getValue(line,"Shot Power");
			if(line.contains("Finishing") && line.contains("<p>"))
				getValue(line,"Finishing");
			if(line.contains("Long Shots") && line.contains("<p>"))
				getValue(line,"Long Shots");
			if(line.contains("Curve") && line.contains("<p>"))
				getValue(line,"Curve");
			if(line.contains("FK Acc.") && line.contains("<p>"))
				getValue(line,"FK Acc.");
			if(line.contains("Penalties") && line.contains("<p>"))
				getValue(line,"Penalties");
			if(line.contains("Volleys") && line.contains("<p>"))
				getValue(line,"Volleys");
			if(line.contains("GK Positioning") && line.contains("<p>"))
				getValue(line,"GK Positioning");
			if(line.contains("GK Diving") && line.contains("<p>"))
				getValue(line,"GK Diving");
			if(line.contains("GK Handling") && line.contains("<p>"))
				getValue(line,"GK Handling");
			if(line.contains("GK Kicking") && line.contains("<p>"))
				getValue(line,"GK Kicking");
			if(line.contains("GK Reflexes") && line.contains("<p>"))
				getValue(line,"GK Reflexes");
			}
		}
			catch (IOException x) {
			    System.err.format("IOException", x);
			}
		/*for(int i=0;i<arr.length;i++){
			if(arr[i].contains("Acceleration") && arr[i].contains("<p>"))
			    getValue(arr[i],"Acceleration");
	}*/
	}
	
	
	
	
	// This checks if Tackle is in the line
	// and <p> is in the line
	// to get the lines with the main values for Tackling
	static void getTxtString_printing(String filename)
	{
		String ret="";
		try{
		    String line = "";
		    String line2="";
		    int index=0;
		    FileReader f = new FileReader(filename);
		    BufferedReader reader = new BufferedReader(f);
		while((line = reader.readLine()) != null){
			line = reader.readLine();
			if(line.contains("Tackle") && line.contains("<p>"))
			System.out.println(line + "\n");
		}
					
			}
			catch (IOException x) {
			    System.err.format("IOException", x);
			}
	}
	
	static String removeTags2(String filename)
	{
		String ret="";
		try{
		    String line = "";
		    String line2="";
		    int index=0;
		    FileReader f = new FileReader(filename);
		    BufferedReader reader = new BufferedReader(f);
		while((line = reader.readLine()) != null){
			line = reader.readLine();
			ret+=line + "\n";
			
			
			
		}
					
			}
			catch (IOException x) {
			    System.err.format("IOException", x);
			}
		return ret;
		/*boolean switcher = false;
		int y = ret.length();
		String retn="";
		for(int i=0;i<1000;i++)
		{
			
			if(ret.charAt(i)=='<')
			{
				switcher = true;
				continue;
			}
			if(switcher==true)
			{
				while(switcher==true)
				{
				ret = deleteCharAt(ret,i);
			if(ret.charAt(i)=='>')
			{
				switcher = false;
			 break;
			}
			 
		}
			}
		}
		return ret;*/
	}
	// gets the whole html file to String called ret in the first half of the code
	// tries to remove everything in < ... > but not work because of existence of functions
	// which are written outside <>
	static String removeTags(String filename)
	{
		String ret="";
		try{
		    String line = "";
		    String line2="";
		    int index=0;
		    FileReader f = new FileReader(filename);
		    BufferedReader reader = new BufferedReader(f);
		while((line = reader.readLine()) != null){
			line = reader.readLine();
			ret+=line + "\n";
		}
					
			}
			catch (IOException x) {
			    System.err.format("IOException", x);
			}
		boolean switcher = false;
		int y = ret.length();
		String retn="";
		for(int i=0;i<10000;i++)
		{
			
			if(ret.charAt(i)=='<')
			{
				switcher = true;
				continue;
			}
			if(switcher==true)
			{
				while(switcher==true)
				{
				ret = deleteCharAt(ret,i);
			if(ret.charAt(i)=='>')
			{
				switcher = false;
			 break;
			}
			 
		}
			}
		}
		return ret;
	}
	 static String  deleteCharAt(String a, int k)
	    {
		String ret = "";
		ret = a.substring(0,k)+a.substring(k+1,a.length());
		return ret;
	    }
	 static int getIndex(Player a,Player[] arr)
		{
			int index = 0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==a)
				{
					index = i;
					break;
				}
			}
			return index;
		}
	 static Player[] giveMadridistas()
	 {
		 return Madridistas;
	 }
	 static boolean check_upTo(Player p, Player[] arr, int a)
	 {
		 boolean ret = false;
		 for(int i=0;i<=a;i++)
		 {
			 if(arr[i]==p)
				 ret = true;
		 }
		 return ret;
	 }
	 

}
