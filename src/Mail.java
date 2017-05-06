

    import java.util.Properties;    
    import javax.mail.*;    
    import javax.mail.internet.*;    
    class Mail{
    	
//    	final String senderEmail = "ywubshit@udallas.edu";
//    	final String password = "ethiopiaman123";
//    	final String emailSMTPserver = "smtp.gmail.com";
//    	final String emailServerPort = "465";
//    	String receiverEmailID = null;
//    	static String emailSubject = "Test Mail";
//    	static String emailBody = "Test Body";
    	
    	public static void main(String[] args)
    	{
    		final String username = "yeabkalaw@gmail.com";
    		final String password = "temppasswor";
    		
    		Properties props = new Properties();
    		props.put("mail.smtp.auth", "true");
    		props.put("mail.smtp.starttls.enable","true");
    		props.put("mail.smtp.host","smtp.gmail.com");
    		props.put("mail.smtp.port","587");
    		
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
    		
    		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
    			
    			protected PasswordAuthentication getPasswordAuthentication()
    			{
    				return new PasswordAuthentication(username,password);
    			}
    			
    			});
    		
    		try{
    			Message message = new MimeMessage(session);
    			message.setFrom(new InternetAddress("yeabkalaw@gmail.com"));
    			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("yeabkalassegid123@gmail.com"));
    			message.setSubject("My First Email");
    			message.setContent(Formation.Show_inString(Madridistas, "4-2-4", "6-6-4", "S"), "text/html; charset=utf-8");
    			Transport.send(message);
    			System.out.println("the email was sent");
    		} catch (MessagingException e)
    		{
    			throw new RuntimeException(e);
    		}
    	}
    }

    		
    		
  
