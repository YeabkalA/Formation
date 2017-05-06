import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
public class Poet {

	public static void main(String[] args) {

		Word[] one_sad = new Word[688];
		Word[] two_sad = new Word[5187];
		Word[] three_sad = new Word[6924];
		Word[] four_sad = new Word[5301];
		Word[] one_sadv = new Word[168];
		Word[] two_sadv = new Word[769];
		Word[] three_sadv = new Word[1545];
		Word[] four_sadv = new Word[1428];
		Word[] one_sn = new Word[5865];
		Word[] two_sn = new Word[22110];
		Word[] three_sn = new Word[20602];
		Word[] four_sn = new Word[12247];
		Word[] one_sv = new Word[3719];
		Word[] two_sv = new Word[8568];
		Word[] three_sv = new Word[6365];
		Word[] four_sv = new Word[3986];


		Player[] Madridistas = new Player[33];

		
		
		//Sorter.make_Player("SourceTexts/Ronaldo.txt").printHim();
		//Sorter.make_Player("SourceTexts/Ramos.txt").printHim();
		//Sorter.make_Player("SourceTexts/Abad.txt").printHim();
		
		Madridistas[0] = Sorter.make_Player("SourceTexts/Ronaldo.txt");
		Madridistas[1] = Sorter.make_Player("SourceTexts/Abad.txt");
		Madridistas[2] = Sorter.make_Player("SourceTexts/Alex.txt");
		Madridistas[3] = Sorter.make_Player("SourceTexts/Asensio.txt");
		Madridistas[4] = Sorter.make_Player("SourceTexts/Bale.txt");
		Madridistas[5] = Sorter.make_Player("SourceTexts/Benzema.txt");
		Madridistas[6] = Sorter.make_Player("SourceTexts/Carvajal.txt");
		Madridistas[7] = Sorter.make_Player("SourceTexts/Casemiro.txt");
		Madridistas[8] = Sorter.make_Player("SourceTexts/Casilla.txt");
		Madridistas[9] = Sorter.make_Player("SourceTexts/Coentrao.txt");
		Madridistas[10] = Sorter.make_Player("SourceTexts/Danilo.txt");
		Madridistas[11] = Sorter.make_Player("SourceTexts/Enzo.txt");
		Madridistas[12] = Sorter.make_Player("SourceTexts/Febas.txt");
		Madridistas[13] = Sorter.make_Player("SourceTexts/Hakimi.txt");
		Madridistas[14] = Sorter.make_Player("SourceTexts/Isco.txt");
		Madridistas[15] = Sorter.make_Player("SourceTexts/James.txt");
		Madridistas[16] = Sorter.make_Player("SourceTexts/Kovacic.txt");
		Madridistas[17] = Sorter.make_Player("SourceTexts/Lienhart.txt");
		Madridistas[18] = Sorter.make_Player("SourceTexts/Marcelo.txt");
		Madridistas[19] = Sorter.make_Player("SourceTexts/Mariano.txt");
		Madridistas[20] = Sorter.make_Player("SourceTexts/Modric.txt");
		Madridistas[21] = Sorter.make_Player("SourceTexts/Morata.txt");
		Madridistas[22] = Sorter.make_Player("SourceTexts/Nacho.txt");
		Madridistas[23] = Sorter.make_Player("SourceTexts/Vergos.txt");
		Madridistas[24] = Sorter.make_Player("SourceTexts/Tejero.txt");
		Madridistas[25] = Sorter.make_Player("SourceTexts/Varane.txt");
		Madridistas[26] = Sorter.make_Player("SourceTexts/Vazquez.txt");
		Madridistas[27] = Sorter.make_Player("SourceTexts/Ramos.txt");
		Madridistas[28] = Sorter.make_Player("SourceTexts/Yanez.txt");
		Madridistas[29] = Sorter.make_Player("SourceTexts/Diaz.txt");
		Madridistas[30] = Sorter.make_Player("SourceTexts/Kroos.txt");
		Madridistas[31] = Sorter.make_Player("SourceTexts/Pepe.txt");
		Madridistas[32] = Sorter.make_Player("SourceTexts/Keylor.txt");
        String[] soccer_actions = new String[11];
        String[] spanish = new String[9];
		//		FileReader c = new FileReader("PoetrySources/adjectives/3sad.txt");
		//		BufferedReader thad = new BufferedReader(c);
		//		FileReader d = new FileReader("PoetrySources/adjectives/4sad.txt");
		//		BufferedReader fad = new BufferedReader(d);
		//		FileReader e = new FileReader("PoetrySources/adjectives/1sadv.txt");
		//		BufferedReader oadv = new BufferedReader(e);
		//		FileReader f = new FileReader("PoetrySources/adjectives/2sadv.txt");
		//		BufferedReader tadv = new BufferedReader(f);
		//		FileReader g = new FileReader("PoetrySources/adjectives/3sadv.txt");
		//		BufferedReader thadv = new BufferedReader(g);
		//		FileReader h = new FileReader("PoetrySources/adjectives/4sadv.txt");
		//		BufferedReader fadv = new BufferedReader(h);
		//		FileReader i = new FileReader("PoetrySources/adjectives/1sn.txt");
		//		BufferedReader on = new BufferedReader(i);
		//		FileReader j = new FileReader("PoetrySources/adjectives/2sn.txt");
		//		BufferedReader tn = new BufferedReader(j);
		//		FileReader k = new FileReader("PoetrySources/adjectives/3sn.txt");
		//		BufferedReader thn = new BufferedReader(k);
		//		FileReader l = new FileReader("PoetrySources/adjectives/4sn.txt");
		//		BufferedReader fn = new BufferedReader(l);
		//		FileReader m = new FileReader("PoetrySources/adjectives/1sv.txt");
		//		BufferedReader ov = new BufferedReader(m);
		//		FileReader n = new FileReader("PoetrySources/adjectives/2sv.txt");
		//		BufferedReader tv = new BufferedReader(n);
		//		FileReader o = new FileReader("PoetrySources/adjectives/3sv.txt");
		//		BufferedReader thv = new BufferedReader(o);
		//		FileReader p = new FileReader("PoetrySources/adjectives/4sv.txt");
		//		BufferedReader fv = new BufferedReader(p);

		//		String line="";
		int noad=0, ntad=0, nthad=0, nfad=0, noadv = 0, ntadv=0, nthadv=0, nfadv=0, non=0, ntn=0,
				nthn=0,nfn=0,nov=0,ntv=0,nthv=0,nfv=0;
		try{
			FileReader a = new FileReader("PoetrySources/vocab/soccer_actions.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				
				soccer_actions[count]=line;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}
		try{
			FileReader a = new FileReader("PoetrySources/vocab/spanish.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				
				spanish[count]=line;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}
		try{
			FileReader a = new FileReader("PoetrySources/adjectives/1sad.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				//line=oad.readLine();
				Word wone_sad = new Word(line,1,"adjective");
				one_sad[count]=wone_sad;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}

		try{
			FileReader a = new FileReader("PoetrySources/adjectives/2sad.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				//line=oad.readLine();
				Word temp = new Word(line,2,"adjective");
				two_sad[count]=temp;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}

		try{
			FileReader a = new FileReader("PoetrySources/adjectives/3sad.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				//line=oad.readLine();
				Word temp = new Word(line,3,"adjective");
				three_sad[count]=temp;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}

		try{
			FileReader a = new FileReader("PoetrySources/adjectives/4sad.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				//line=oad.readLine();
				Word temp = new Word(line,4,"adjective");
				four_sad[count]=temp;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}

		try{
			FileReader a = new FileReader("PoetrySources/adverbs/1sadv.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				//line=oad.readLine();
				Word wone_sad = new Word(line,1,"adverb");
				one_sadv[count]=wone_sad;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}

		try{
			FileReader a = new FileReader("PoetrySources/adverbs/2sadv.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				//line=oad.readLine();
				Word temp = new Word(line,2,"adverb");
				two_sadv[count]=temp;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}

		try{
			FileReader a = new FileReader("PoetrySources/adverbs/3sadv.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				//line=oad.readLine();
				Word temp = new Word(line,3,"adverb");
				three_sadv[count]=temp;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}

		try{
			FileReader a = new FileReader("PoetrySources/adverbs/4sadv.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				//line=oad.readLine();
				Word temp = new Word(line,4,"adverb");
				four_sadv[count]=temp;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}
		try{
			FileReader a = new FileReader("PoetrySources/nouns/1sn.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				//line=oad.readLine();
				Word wone_sad = new Word(line,1,"noun");
				one_sn[count]=wone_sad;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}

		try{
			FileReader a = new FileReader("PoetrySources/nouns/2sn.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				//line=oad.readLine();
				Word temp = new Word(line,2,"noun");
				two_sn[count]=temp;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}

		try{
			FileReader a = new FileReader("PoetrySources/nouns/3sn.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				//line=oad.readLine();
				Word temp = new Word(line,3,"noun");
				three_sn[count]=temp;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}

		try{
			FileReader a = new FileReader("PoetrySources/nouns/4sn.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				//line=oad.readLine();
				Word temp = new Word(line,4,"noun");
				four_sn[count]=temp;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}
		try{
			FileReader a = new FileReader("PoetrySources/verbs/1sv.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				//line=oad.readLine();
				Word wone_sad = new Word(line,1,"verb");
				one_sv[count]=wone_sad;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}

		try{
			FileReader a = new FileReader("PoetrySources/verbs/2sv.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				//line=oad.readLine();
				Word temp = new Word(line,2,"verb");
				two_sv[count]=temp;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}

		try{
			FileReader a = new FileReader("PoetrySources/verbs/3sv.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				//line=oad.readLine();
				Word temp = new Word(line,3,"verb");
				three_sv[count]=temp;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}

		try{
			FileReader a = new FileReader("PoetrySources/verbs/4sv.txt");
			BufferedReader oad = new BufferedReader(a);

			int count=0;
			String line=null;
			while((line=oad.readLine())!=null)
			{
				//line=oad.readLine();
				Word temp = new Word(line,4,"verb");
				four_sv[count]=temp;
				count+=1;
			}
		}
		catch (IOException x) {
			System.err.format("IOException", x);
		}


		//		for(int ui=0;ui<one_sv.length;ui++)
		//		{
		//			System.out.println(one_sv[ui].word);
		//		}
		int count=0;
		int length = one_sad.length + two_sad.length+three_sad.length+four_sad.length+
				one_sadv.length + two_sadv.length+three_sadv.length+four_sadv.length+
				one_sv.length + two_sv.length+three_sv.length+four_sv.length+
				one_sn.length + two_sn.length+three_sn.length+four_sn.length;
		Word[] words = new Word[length];


		for(int i1=0;i1<one_sad.length;i1++)
		{
			words[count]=one_sad[i1];
			count++;
		}
		for(int i1=0;i1<two_sad.length;i1++)
		{
			words[count]=two_sad[i1];
			count++;
		}
		for(int i1=0;i1<three_sad.length;i1++)
		{
			words[count]=three_sad[i1];
			count++;
		}
		for(int i1=0;i1<four_sad.length;i1++)
		{
			words[count]=four_sad[i1];
			count++;
		}
		for(int i1=0;i1<one_sadv.length;i1++)
		{
			words[count]=one_sadv[i1];
			count++;
		}
		for(int i1=0;i1<two_sadv.length;i1++)
		{
			words[count]=two_sadv[i1];
			count++;
		}
		for(int i1=0;i1<three_sadv.length;i1++)
		{
			words[count]=three_sadv[i1];
			count++;
		}
		for(int i1=0;i1<four_sadv.length;i1++)
		{
			words[count]=four_sadv[i1];
			count++;
		}
		for(int i1=0;i1<one_sn.length;i1++)
		{
			words[count]=one_sn[i1];
			count++;
		}
		for(int i1=0;i1<two_sn.length;i1++)
		{
			words[count]=two_sn[i1];
			count++;
		}
		for(int i1=0;i1<three_sn.length;i1++)
		{
			words[count]=three_sn[i1];
			count++;
		}
		for(int i1=0;i1<four_sn.length;i1++)
		{
			words[count]=four_sn[i1];
			count++;
		}

		for(int i1=0;i1<one_sv.length;i1++)
		{
			words[count]=one_sv[i1];
			count++;
		}
		for(int i1=0;i1<two_sv.length;i1++)
		{
			words[count]=two_sv[i1];
			count++;
		}
		for(int i1=0;i1<three_sv.length;i1++)
		{
			words[count]=three_sv[i1];
			count++;
		}
		for(int i1=0;i1<four_sv.length;i1++)
		{
			words[count]=four_sv[i1];
			count++;
		}



//		System.out.println("Modric " + one_sv[100].word + " " + one_sadv[100].word + ", " + "he " + four_sv[200].word);
//		System.out.println("He " + one_sv[100].word + " " + four_sadv[100].word + ", " + "and " + four_sv[300].word);
//		System.out.println("Modric " + one_sv[200].word + " " + one_sadv[100].word + ", " + "he " + four_sv[50].word);
//		System.out.println("Modric " + one_sv[1000].word + " " + one_sadv[90].word + ", " + "he " + four_sv[300].word);
		Player plyr = Madridistas[getRandoms(1,32)];
		
		String line1 = line_1(plyr);
		
		String line3 = line_3(plyr,one_sn, two_sn, three_sn, four_sn, one_sv, two_sv, three_sv, four_sv, one_sad, two_sad, three_sad, four_sad);
String line4 = line_4(plyr);
String line5=line_5(plyr, one_sad, two_sad);
String line6 = line_6(two_sad, one_sad, four_sadv,line5.substring(line5.length()-2));
String line7 = line_7(soccer_actions, one_sn, three_sad, three_sadv );
String line8 = line_8(plyr,spanish, one_sn, two_sn, three_sn, four_sn, one_sv, two_sv, line7.substring(line7.length()-1));
 String line2 = line5.split(" ")[9] + " and " + line6.split(" ")[6] + ", " + line8.split(" ")[3] + " and "+ line6.split(" ")[4].replaceAll(",", "");
 
 String[] poem = {line1, line2, line3, line4, line5, line6, line7, line8};
 for(int i=0; i<8;i++)
 {
	 System.out.println(poem[i]);
	 if(i==1 || i==5)
		 System.out.println("");
 }
//		System.out.println(line_1(Madridistas[10]));
//System.out.println(line_3(Madridistas[10],one_sn, two_sn, three_sn, four_sn, one_sv, two_sv, three_sv, four_sv, one_sad, two_sad, three_sad, four_sad));
//System.out.println(line_4(Madridistas[0]));
//
//System.out.println(line5);
//System.out.println(line_6(two_sad, one_sad, four_sadv,line5.substring(line5.length()-2)));
//String line7 = line_7(soccer_actions, one_sn, three_sad, three_sadv );
//System.out.println(line7);
//System.out.println(line_8(Madridistas[20],spanish, one_sn, two_sn, three_sn, four_sn, one_sv, two_sv, line7.substring(line7.length()-2)));
	}
	static String writeLine2(Word[] words)
	{
		//String player = a.Name;
		String firstpart = "";
		String secondpart = "";
		String ret="";
		boolean flag=false;
		int counter=7;
		while(counter!=0)
		{
			while(flag!=false)
			{


				int i=getRandoms(1,100000);
				if(words[i].pos.equals("noun"))
				{
					ret+=words[i].word+" ";
					counter-=words[i].syllables;
					flag=true;
				}
			}
			flag=false;
			if(counter>=5)
			{
				while(flag!=false)
				{
					int i2=getRandoms(1,100000);
					if(words[i2].pos.equals("verb")){
						ret+=words[i2].word + " ";
						counter-=words[i2].syllables;
						flag=true;
					}

					flag=false;
					while(flag!=false)
					{
						int n=getRandoms(1,10000);
						if(words[n].pos.equals("adverb") && words[n].syllables==counter){
							ret+=words[n].word+" ";
							flag=true;
						}
					}
				}
			}
			else
			{
				while(flag!=true)
				{
					int n=getRandoms(1,10000);
					if(words[n].pos.equals("verb") && words[n].syllables==counter){
						ret+=words[n].word+" ";
						flag=true;
					}

				}
			}



		}
		return ret;
	}
	 static String toNum(String Num)
	    {
		String N1 = Num.substring(0,1);
		String N2 = Num.substring(1);
		String firstPart = "", secondPart = "";

		if(Num.equals("10"))
		    return "ten";
		if(Num.equals("11"))
		    return "eleven";
		if(Num.equals("12"))
		    return "twelve";
		if(Num.equals("13"))
		    return "thirteen";
		if(Num.equals("14"))
		    return "fourteen";
		if(Num.equals("15"))
		    return "fifteen";
		if(Num.equals("16"))
		    return "sixteen";
		if(Num.equals("17"))
		    return "seventeen";
		if(Num.equals("18"))
		    return "eighteen";
		if(Num.equals("19"))
		    return "ninteen";
		
		if(N1.equals("2"))
		    firstPart = "twenty";
		else if(N1.equals("3"))
		    firstPart = "thirty";
		else if(N1.equals("4"))
		    firstPart = "fourty";
		else if(N1.equals("5"))
		    firstPart = "fifty";
		else if(N1.equals("6"))
		    firstPart = "sixty";
		else if(N1.equals("7"))
		    firstPart = "seventy";
		else if(N1.equals("8"))
		    firstPart = "eighty";
		else if(N1.equals("9"))
		    firstPart = "ninety";

		if(N2.equals("1"))
		    secondPart = "one";
		else if(N2.equals("2"))
		    secondPart = "two";
		else if(N2.equals("3"))
		    secondPart = "three";
		else if(N2.equals("4"))
		    secondPart = "four";
		else if(N2.equals("5"))
		    secondPart = "five";
		else if(N2.equals("6"))
		    secondPart = "six";
		else if(N2.equals("7"))
		    secondPart = "seven";
		else if(N2.equals("8"))
		    secondPart = "eight";
		else if(N2.equals("9"))
		    secondPart = "nine";

		return firstPart+" "+secondPart;
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
	static String get(Word[] arr, String a)
	{
		String ret="";
		String[] temp = null;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].word.endsWith(a))
			{
				count++;
			}
			
		}
		temp = new String[count];
		count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].word.endsWith(a))
			{
				temp[count]=arr[i].word;
				count++;
			}
			
		}
		return temp[getRandoms(0,temp.length-1)];
	}
	static String line_1(Player a)
	{
		return "For my poem about " + a.Name + ", here is my squad of words";
	
	}
	static String line_3(Player a, Word[] n1, Word[] n2, Word[] n3, Word[] n4, 
			Word[] v1, Word[] v2, Word[] v3, Word[] v4, Word[] a1, Word[] a2, Word[] a3, Word[] a4)
	{
		String ret = "Oh " + a.Name+", ";
		int in=getRandoms(1,2);
		if(in==1)
		{
			ret+=a1[getRandoms(1,688-1)].word + " " + n2[getRandoms(1,22110-1)].word + ", ";
		}
		else
			ret+=a2[getRandoms(1,5187-1)].word + " "+ n1[getRandoms(1,5865-1)].word + ", ";
		
		ret+="how could you ";
		int in2=getRandoms(1,3);
		if(in2 == 1)
		{
			ret+=v1[getRandoms(0,v1.length)].word;
			int f = getRandoms(1,2);
			if(f==1)
				ret+=" " + v1[getRandoms(0,v1.length)].word + " " + get(n1,"id");
			else
				ret+=" " + get(n2,"d");
		}
		else 
			ret+=" " + v2[getRandoms(0,v1.length)].word + " " + get(n1,"id");
		
		return ret;
		}
	
	static String line_4(Player a)
	{
		return "Just " + toNum(a.worstAtt("val")) +  " for " + a.worstAtt(" ") + " and you are in Real Madrid?";
	}
	static String line_5(Player a, Word[] a1, Word[] a2)
	{
		return "But " + a.Name + ", your " + a.bestAtt("") + " of " + toNum(a.bestAtt("val")) + " makes you " + 
	a2[getRandoms(0,a2.length-1)].word + " and " + a1[getRandoms(0,a1.length-1)].word;
	}
	static String line_6(Word[] a2, Word[] a1, Word[] av4, String match)
	{
		return "And that is ofcourse " + get(a1,"s") + ", and "+ av4[getRandoms(0,av4.length-1)].word + " " + get(a1,match);
	}
	static String line_7(String[] sv, Word[] n1, Word[] a3, Word[] av3 )
	{
		return "Your " + sv[getRandoms(0,sv.length-1)] + " are " + 
	av3[getRandoms(0,av3.length-1)].word + " " +  " and your " + 
				sv[getRandoms(0,sv.length-1)]+ " " + a3[getRandoms(0,a3.length-1)].word;
	}
	static String line_8(Player a, String[] sp, Word[] n1, Word[] n2, Word[] n3, Word[] n4, Word[] v1, Word[] v2, String match)
	{
	String ret= a.Name + " " + sp[getRandoms(0,sp.length-1)] + " " + sp[getRandoms(0,sp.length-1)] +  ", ";
	
		int in=getRandoms(1,3);
		if(in==1)
		{
			ret+=n1[getRandoms(1,n1.length-1)].word + " " + v2[getRandoms(1,v2.length-1)].word + " " + 
					get(n3,match) ;
		}
		else if(in==2)
			ret+=v2[getRandoms(1,v2.length-1)].word + " "+ get(n4,match);
		else
			ret+=n1[getRandoms(1,n1.length-1)].word + " " + v1[getRandoms(1,v1.length-1)].word + " and " + 
					v1[getRandoms(1,v1.length-1)].word+ " " + get(n2,match);
		
		return ret;
		
	}
	}

