import java.io.*;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class Formation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		Player[] randomPlayers = proj_try.sortOverall(proj_try.auto_make_100Players());
		//System.out.println(Madridistas[3].worstAtt("a"));
		//The following for loop gives the roster for a team in 4-4-3
//		for(int i=0;i<18;i++)
//		{
//			if(i<2)
//				System.out.print(i+1 +" G  ");
//			else if(i<8)
//				System.out.print(i+1 +" D  ");
//			else if(i<14)
//				System.out.print(i+1 +" M  ");
//			else if(i<18)
//				System.out.print(i+1 +" F  ");
//
//			getRoster(Madridistas)[i].printHim();
//		}
		for(int i=0;i<18;i++)
		{
			getRoster_forFormation(Madridistas, "3-4-3", "8-5-3", "Full")[i].printHim();

		}
		
		

	 Show(Madridistas, "2-2-6", "4-4-8", "Starting");

		System.out.println(Show_inString(Madridistas, "4-3-4", "6-6-4", "Full"));
//		
//		for(int i=0;i<6;i++)
//		{
//			Sorter.getRosterDefenses(Madridistas)[i].printHim();
//		}
		
		for(int i=0;i<20;i++){//sendMail(String sender, String pass, String receipent, String subject, Player[] arr, String formation, String dist, String full_or_starting)
		sendMail("yeabkalaw@gmail.com", "temppasswor", "yeabkalassegid123@gmail.com", "The_squad" + i, Madridistas,
				"4-3-4", "6-6-4", "Full");
		}
	}
	
	// gets the roster for a defined 4-4-3 formation and returns the array
	// of all 18 squad players
 public static Player[] getRoster(Player[] arr)
 {
	 Player[] roster_GK = new Player[2];
		Player[] roster_Def = new Player[6];
		Player[] roster_Mid = new Player[6];
		Player[] roster_Attack = new Player[4];
		Player[] roster = new Player[18];
	 int rcount=0;
		
		int count = 0;
		
		for(int a=0;a<2;a++)
		{
			roster_GK[count]=Sorter.sortGK(arr)[a];
			roster[rcount]=roster_GK[count];
			rcount++;
		}
		
		count=0;
		for(int i = 0;i<Sorter.sortDefense(arr).length;i++)
		{
			if(count>=6)
				break;
			if(Sorter.getIndex(Sorter.sortDefense(arr)[i],Sorter.sortDefense(arr)) <= Sorter.getIndex(Sorter.sortDefense(arr)[i],Sorter.sortMid(arr)) &&
					Sorter.getIndex(Sorter.sortDefense(arr)[i],Sorter.sortDefense(arr)) <= Sorter.getIndex(Sorter.sortDefense(arr)[i],Sorter.sortAttack(arr))
					&& Sorter.check_upTo(Sorter.sortDefense(arr)[i], roster, rcount) ==false)
			{
				roster_Def[count] = Sorter.sortDefense(arr)[i];
				//roster_Def[count].printHim();
				count++;
				roster[rcount]=Sorter.sortDefense(arr)[i];
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
		
		for(int l = 0;l<Sorter.sortMid(arr).length;l++)
		{
			if(count>=6)
				break;
			if(Sorter.getIndex(Sorter.sortMid(arr)[l],Sorter.sortMid(arr)) <= Sorter.getIndex(Sorter.sortMid(arr)[l],Sorter.sortDefense(arr)) &&
					Sorter.getIndex(Sorter.sortMid(arr)[l],Sorter.sortMid(arr)) <= Sorter.getIndex(Sorter.sortMid(arr)[l],Sorter.sortAttack(arr))
					&& Sorter.check_upTo(Sorter.sortMid(arr)[l], roster, rcount) ==false)
			{
				roster_Mid[count] = Sorter.sortMid(arr)[l];
				//roster_Mid[count].printHim();
				count++;
				roster[rcount]=Sorter.sortMid(arr)[l];
				rcount++;
			}
			
		}
		count=0;
		//----------------------------------------------
		for(int c = 0;c<Sorter.sortAttack(arr).length;c++)
		{
			if(count>=4)
				break;
			if(Sorter.getIndex(Sorter.sortAttack(arr)[c],Sorter.sortAttack(arr)) <= Sorter.getIndex(Sorter.sortAttack(arr)[c],Sorter.sortMid(arr)) &&
					Sorter.getIndex(Sorter.sortAttack(arr)[c],Sorter.sortAttack(arr)) <= Sorter.getIndex(Sorter.sortAttack(arr)[c],Sorter.sortDefense(arr))
					&& Sorter.check_upTo(Sorter.sortAttack(arr)[c], roster, rcount) ==false)
			{
				roster_Attack[count] = Sorter.sortAttack(arr)[c];
				//roster_Attack[count].printHim();
				count++;
				roster[rcount]=Sorter.sortAttack(arr)[c];
				rcount++;
			}
			
		}
		return roster;
 }
 
 // returns a Player[]
 // if the user chooses to see the full squad, then he/she can use "Full" for the field full_or_starting
 //if the user chooses to see the starting 11, then he/she can use "Starting" (or any other string, actually!) for the field full_or_starting
 // arr is the array of players on which the function is carried on
 // formation is a String given as "defs-mids-atts" where defs is the total number of defenders that start,
 // and mids and atts are the corresponding starting numbers for midfielders and attackers
 // dist shows the distribution of player roles in the whole squad
 // dist is given as a String of the form "tdefs-tmids-tatts", where tdefs shows the total # of defenders in the squad,
 // tmids - the total number of midfielders in the squad
 // tatts - the total number of attackers in the sqsuad
 
 public static Player[] getRoster_forFormation(Player[] arr, String formation, String dist, String full_or_starting)
 {
	 String[] form = formation.split("-");
	 int[] Formation = new int[3]; 
	 for(int u=0;u<3;u++)
	 {
		 Formation[u]=Integer.parseInt(form[u]);
	 }
	 
	 int defs = Formation[0];
	 int mids = Formation[1];
	 int atts = Formation[2];
	 
	 String[] distr = dist.split("-");
	 int[] Dist = new int[3];
	 for(int b=0;b<3;b++)
	 {
		 Dist[b]=Integer.parseInt(distr[b]);
	 }
	 
	 int tdefs = Dist[0];
	 int tmids = Dist[1];
	 int tatts = Dist[2];
	 
	 
	 
	 Player[] roster_GK = new Player[2];
		Player[] roster_Def = new Player[tdefs];
		Player[] roster_Mid = new Player[tmids];
		Player[] roster_Attack = new Player[tatts];
		Player[] roster = new Player[18];
	 int rcount=0;
		
		int count = 0;
		
		for(int a=0;a<2;a++)
		{
			roster_GK[count]=Sorter.sortGK(arr)[a];
			roster[rcount]=roster_GK[count];
			rcount++;
		}
		
		count=0;
		for(int i = 0;i<Sorter.sortDefense(arr).length;i++)
		{
			if(count>=tdefs)
				break;
			if(Sorter.getIndex(Sorter.sortDefense(arr)[i],Sorter.sortDefense(arr)) <= Sorter.getIndex(Sorter.sortDefense(arr)[i],Sorter.sortMid(arr)) &&
					Sorter.getIndex(Sorter.sortDefense(arr)[i],Sorter.sortDefense(arr)) <= Sorter.getIndex(Sorter.sortDefense(arr)[i],Sorter.sortAttack(arr))
					&& Sorter.check_upTo(Sorter.sortDefense(arr)[i], roster, rcount) ==false)
			{
				roster_Def[count] = Sorter.sortDefense(arr)[i];
				//roster_Def[count].printHim();
				count++;
				roster[rcount]=Sorter.sortDefense(arr)[i];
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
		
		for(int l = 0;l<Sorter.sortMid(arr).length;l++)
		{
			if(count>=tmids)
				break;
			if(Sorter.getIndex(Sorter.sortMid(arr)[l],Sorter.sortMid(arr)) <= Sorter.getIndex(Sorter.sortMid(arr)[l],Sorter.sortDefense(arr)) &&
					Sorter.getIndex(Sorter.sortMid(arr)[l],Sorter.sortMid(arr)) <= Sorter.getIndex(Sorter.sortMid(arr)[l],Sorter.sortAttack(arr))
					&& Sorter.check_upTo(Sorter.sortMid(arr)[l], roster, rcount) ==false)
			{
				roster_Mid[count] = Sorter.sortMid(arr)[l];
				//roster_Mid[count].printHim();
				count++;
				roster[rcount]=Sorter.sortMid(arr)[l];
				rcount++;
			}
			
		}
		count=0;
		//----------------------------------------------
		for(int c = 0;c<Sorter.sortAttack(arr).length;c++)
		{
			if(count>=tatts)
				break;
			if(Sorter.getIndex(Sorter.sortAttack(arr)[c],Sorter.sortAttack(arr)) <= Sorter.getIndex(Sorter.sortAttack(arr)[c],Sorter.sortMid(arr)) &&
					Sorter.getIndex(Sorter.sortAttack(arr)[c],Sorter.sortAttack(arr)) <= Sorter.getIndex(Sorter.sortAttack(arr)[c],Sorter.sortDefense(arr))
					&& Sorter.check_upTo(Sorter.sortAttack(arr)[c], roster, rcount) ==false)
			{
				roster_Attack[count] = Sorter.sortAttack(arr)[c];
				//roster_Attack[count].printHim();
				count++;
				roster[rcount]=Sorter.sortAttack(arr)[c];
				rcount++;
			}
			
		}
		
		if(full_or_starting.equals("Full"))
			return roster;
		else
		{
			int fix=0;
			Player[] Starting = new Player[11];
			Starting[0]=roster[0];
			for(int r=1;r<=defs;r++)
			{
				Starting[r]=roster[r+1];
			}
			for(int r=(defs+1);r<(mids+defs+1);r++)
			{
				Starting[r]=roster[tdefs+2+fix];
				fix++;
			}
			fix=0;
			for(int r=(defs+mids+1);r<11;r++)
			{
				Starting[r]=roster[tdefs+tmids+2+fix];
				fix++;
			}
return Starting;
		}
 }
 static void Show(Player[] arr, String formation, String dist, String full_or_starting)
 {
	 String[] form = formation.split("-");
	 int[] Formation = new int[3];
	 for(int u=0;u<3;u++)
	 {
		 Formation[u]=Integer.parseInt(form[u]);
	 }
	 
	 int defs = Formation[0];
	 int mids = Formation[1];
	 int atts = Formation[2];
	 
	 String[] distr = dist.split("-");
	 int[] Dist = new int[3];
	 for(int b=0;b<3;b++)
	 {
		 Dist[b]=Integer.parseInt(distr[b]);
	 }
	 
	 int tdefs = Dist[0];
	 int tmids = Dist[1];
	 int tatts = Dist[2];
	 
	 if(full_or_starting.equals("Full"))
	 {
		 Player[] ret = getRoster_forFormation(arr,formation,dist,"Full");
		 for(int i=0;i<18;i++)
				{
					if(i<2)
						System.out.print(i+1 +" G  ");
					else if(i<tdefs+2)
						System.out.print(i+1 +" D  ");
					else if(i<tdefs+tmids+2)
						System.out.print(i+1 +" M  ");
					else if(i<18)
						System.out.print(i+1 +" F  ");
		
					System.out.println(ret[i].Name);
				}
	 }
	 else
	 {
		 Player[] rett = getRoster_forFormation(arr,formation,dist,"Starting");
		 for(int i=0;i<11;i++)
				{
					if(i<1)
						System.out.print(i+1 +" G  ");
					else if(i<defs+1)
						System.out.print(i+1 +" D  ");
					else if(i<defs+mids+1)
						System.out.print(i+1 +" M  ");
					else if(i<11)
						System.out.print(i+1 +" F  ");
		
					System.out.println(rett[i].Name);
				}
	 }
 }
 
 static String Show_inString(Player[] arr, String formation, String dist, String full_or_starting)
 {
	 String[] form = formation.split("-");
	 int[] Formation = new int[3];
	 for(int u=0;u<3;u++)
	 {
		 Formation[u]=Integer.parseInt(form[u]);
	 }
	 
	 int defs = Formation[0];
	 int mids = Formation[1];
	 int atts = Formation[2];
	 
	 String[] distr = dist.split("-");
	 int[] Dist = new int[3];
	 for(int b=0;b<3;b++)
	 {
		 Dist[b]=Integer.parseInt(distr[b]);
	 }
	 
	 int tdefs = Dist[0];
	 int tmids = Dist[1];
	 int tatts = Dist[2];
	  String rett1 = "";
	 if(full_or_starting.equals("Full"))
	 {
		 Player[] ret = getRoster_forFormation(arr,formation,dist,"Full");
		 for(int i=0;i<18;i++)
				{
					if(i<2)
						rett1+=(i+1 +" G  ");
					else if(i<tdefs+2)
						rett1+=(i+1 +" D  ");
					else if(i<tdefs+tmids+2)
						rett1+=(i+1 +" M  ");
					else if(i<18)
						rett1+=(i+1 +" F  ");
		
					rett1+=ret[i].Name + "\n";
				}
		 return rett1;
	 }
	 else
	 {
		 String rett2 = "";
		 Player[] rett = getRoster_forFormation(arr,formation,dist,"Starting");
		 for(int i=0;i<11;i++)
				{
					if(i<1)
						rett2+=(i+1 +" G  ");
					else if(i<defs+1)
						rett2+=(i+1 +" D  ");
					else if(i<defs+mids+1)
						rett2+=(i+1 +" M  ");
					else if(i<11)
						rett2+=(i+1 +" F  ");
		
					rett2+=(rett[i].Name + "\n");
				}
		 return rett2;
	 }
 }
  static void change_to_txt(Player[] arr, String formation, String dist, String full_or_starting, String output)
  {
	  try{
		 File f = new File("ak.txt");
	      FileOutputStream fos = new FileOutputStream(f);

	      PrintWriter pw = new PrintWriter(fos);
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String str = Show_inString(arr, formation, dist, full_or_starting);
	         pw.write(str);;
	         pw.flush();
	         fos.close();
	         pw.close();
  }
	  catch (IOException x) {
		    System.err.format("IOException", x);
		}
 
  }
  static String Show_inString_forMail(Player[] arr, String formation, String dist, String full_or_starting)
  {
	  String[] form = formation.split("-");
		 int[] Formation = new int[3];
		 for(int u=0;u<3;u++)
		 {
			 Formation[u]=Integer.parseInt(form[u]);
		 }
		 
		 int defs = Formation[0];
		 int mids = Formation[1];
		 int atts = Formation[2];
		 
		 String[] distr = dist.split("-");
		 int[] Dist = new int[3];
		 for(int b=0;b<3;b++)
		 {
			 Dist[b]=Integer.parseInt(distr[b]);
		 }
		 
		 int tdefs = Dist[0];
		 int tmids = Dist[1];
		 int tatts = Dist[2];
		  String rett1 = "";
		 if(full_or_starting.equals("Full"))
		 {
			 Player[] ret = getRoster_forFormation(arr,formation,dist,"Full");
			 for(int i=0;i<18;i++)
					{
						if(i<2)
							rett1+=(i+1 +" G  -");
						else if(i<tdefs+2)
							rett1+=(i+1 +" D  -");
						else if(i<tdefs+tmids+2)
							rett1+=(i+1 +" M  -");
						else if(i<18)
							rett1+=(i+1 +" F  -");
		
						rett1+=ret[i].Name + ",  ";
		
					}
			 String the_mail = "";
			 the_mail = "The full squad is" + rett1 + "\n" + "                  Thanks!";
			 return the_mail;
		 }
		 else
		 {
			 String rett2 = "";
			 Player[] rett = getRoster_forFormation(arr,formation,dist,"Starting");
			 for(int i=0;i<11;i++)
					{
						if(i<1)
							rett2+=(i+1 +" G  ");
						else if(i<defs+1)
							rett2+=(i+1 +" D  ");
						else if(i<defs+mids+1)
							rett2+=(i+1 +" M  ");
						else if(i<11)
							rett2+=(i+1 +" F  ");
			
				
							rett2+=rett[i].Name + ",     ";
		
					}
			 String the_mail = "";
			 the_mail = "The starting 11 are" + rett2 + "\n" + "                  Thanks!";
			 return the_mail;
		 }
  }
  static void sendMail(String sender, String pass, String receipent, String subject, Player[] arr, String formation, String dist, String full_or_starting)
  {
	  final String username = sender;
		final String password = pass;
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.host","smtp.gmail.com");
		props.put("mail.smtp.port","587");
		
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			
			protected PasswordAuthentication getPasswordAuthentication()
			{
				return new PasswordAuthentication(username,password);
			}
			
			});
		
		try{
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(sender));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receipent));
			message.setSubject(subject);
			message.setContent(Formation.Show_inString(arr, formation, dist, full_or_starting), "text/html; charset=utf-8");
			Transport.send(message);
			System.out.println("Your email was sent to " + receipent);
		} catch (MessagingException e)
		{
			throw new RuntimeException(e);
		}
  }
}
