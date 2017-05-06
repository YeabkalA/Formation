import java.util.Scanner;
public class Console {

	public static void main(String[] args) {
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
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("This is the interactive page for myFormation. Please, select your option." + "\n");
		System.out.println("1.  See all the players in Real Madrid");
		System.out.println("2.  See all the players in Real Madrid with their ratings");
		System.out.println("3.  See the whole ratings of a Real Madrid player");
		System.out.println("4.  Sort Real Madrid's players by their attacking abilities");
		System.out.println("5.  See the ranking of Real Madrid's players based on their defensive abilities");
		System.out.println("6.  Get squad for desired formation and distribution");
		System.out.println("7.   Email your desired squad to your friend");
		String formation = "", dist = "", depth="", from="", to="", pass="", subject="";

		int op=0;
		while(op!=-1){
			System.out.println("--");
			op = a.nextInt();
			if(op==1)
			{
				for(int i=1;i<Madridistas.length;i++)
				{
					System.out.println(Madridistas[i].Name);
				}
				System.out.println(" \n\n\n");
			}
			else if(op==2)
			{
				for(int i=1;i<Madridistas.length;i++)
				{
					Madridistas[i].printHim();
				}
				System.out.println(" \n\n\n");
			}
			else if(op==3)
			{
				System.out.println("Whose ratings do you want to see");
				String player = a.nextLine();
				Sorter.make_Player("SourceTexts/" + player + ".txt");
			}
			else if(op==4)
			{
				System.out.println("Rankings by attacking abilities");
				for(int i=0;i<Madridistas.length;i++)
				{
					Sorter.sortAttack(Madridistas)[i].printHim();
				}
			}
			else if(op==5)
			{
				System.out.println("Rankings by defensive abilities");
				for(int i=0;i<Madridistas.length;i++)
				{
					Sorter.sortDefense(Madridistas)[i].printHim();
				}
			}
			else if(op==6)
			{
				System.out.println("What starting formation do you want? (Insert with - separations)");
				formation = a.next();
				System.out.println("What squad distribution do you want? (Insert with - separations)");
				dist = a.next();
				
				System.out.println("\n\n" + "The full squad will be ..." + "\n");
				Formation.Show(Madridistas, formation, dist, "Full");
				System.out.println("\n\n" + "Your starting 11 are" + "\n");
				Formation.Show(Madridistas, formation, dist, "Starting");
			}
			else if(op==7)
			{
				System.out.println("Emailing system running..." + "\n\n\n");
				System.out.println("What starting formation do you want? (Insert with - separatinos");
				formation = a.next();
				System.out.println("What squad distribution do you want? (Insert with - separatinos");
				dist = a.next();
				System.out.println("Do you want to email the full squad or just the starting 11?");
			    depth = a.next();
				System.out.println("Your formation has been generated! Please enter your email address");
				System.out.print("Email address:   ");
				from = a.next();
				System.out.println("\n" + "Please enter your email password");
				System.out.print("Password:   ");
				pass = a.next();
				System.out.println("\n" + "Please enter your receiver's email address");
				System.out.print("To:   ");
				to = a.next();
				System.out.println("\n" + "What do you like the subject to be?");
				subject = a.next();
		
				Formation.sendMail(from, pass, to, subject, Madridistas,
						formation, dist, depth);
			}
			
			
		}
		
			
		
		

	}

}
