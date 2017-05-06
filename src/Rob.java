import java.io.File;

public class Rob {

	public static void main(String[] args) {
		File f = new File("SourceTexts/");
		File[] x = f.listFiles();
		
		int i = 0;
		String file = "";
		for(File g : x){
			System.out.println("SourceTexts/"+g.getName());
			//Madridistas[i] = make_Player(g.getName());
		}

	}

}
