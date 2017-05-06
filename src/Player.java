class Player{
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

	public Player(String Name, String Club_Country, int BallSkills, int Defensive,  int Mental, int Passing,
			int Speed, int Physical, int Heading, int Attacking, int SetPieces, int GK){
		this.Name = Name;
		this.Club_Country = Club_Country;
		this.BallSkills = BallSkills;
		this.Defensive = Defensive;
		this.Mental = Mental;
		this.Passing = Passing;
		this.Speed = Speed;
		this.Physical = Physical;
		this.Heading = Heading;
		this.Attacking = Attacking;
		this.SetPieces = SetPieces;
		this.GK = GK;
	}

	public Player()
	{
		this("");
	}

	public Player(String name)
	{
		this(name,"",0,0,0,0,0,0,0,0,0,0);
	}
	public Player(String name, String Club_Country){
		this(name,Club_Country,0,0,0,0,0,0,0,0,0,0);
	}
	public double overall()
	{
		return (this.BallSkills + this.Defensive + this.Mental + this.Passing + this.Speed + this.Physical + this.Heading +
				this.Attacking + this.SetPieces)/9;
	}
	public void printHim()
	{
		System.out.println("Name: "+this.Name +  "\tBallSkills: " + this.BallSkills +
				" /Defensive:" + this.Defensive + " /Mental:" + this.Mental + " /Passing:" + this.Passing +
				" /Speed:" + this.Speed + " /Physical:" + this.Physical + " /Heading:" + this.Heading +
				" /Attacking:" + this.Attacking + " /SetPieces:" + this.SetPieces + " /GK:" + this.GK + "------> Overall = " + this.overall() + "\n");
	}
	public String bestAtt(String a)
	{
		int[] arr = new int[5];
		arr[0] = this.BallSkills;
		arr[1] = this.Mental;
		arr[2]=this.Passing;
		arr[3]=this.Speed;
		arr[4]=this.Heading;
		int temp = -1;
		String temps="";
//		for(int i=0;i<arr.length-1;i++)
//		    {
//			temp = Math.max(temp,arr[i+1]);
//		    }
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>temp)
			{
				temp = arr[i];
				if(i==0)
					temps="Skills";
				else if(i==1)
					temps="Mentality";
				else if(i==2)
					temps="Passing";
				else if(i==3)
					temps="Speed";
				else if(i==4)
					temps="Heading";
			}

		}
		if(a.equals("val"))
			return Integer.toString(temp);
		else
			return temps;
	}
	public String worstAtt(String a)
	{
		int[] arr = new int[5];
		arr[0] = this.BallSkills;
		arr[1] = this.Mental;
		arr[2]=this.Passing;
		arr[3]=this.Speed;
		arr[4]=this.Heading;
		int temp = arr[0];
		String temps="";
//		for(int i=0;i<arr.length-1;i++)
//		    {
//			temp = Math.max(temp,arr[i+1]);
//		    }
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<temp)
			{
				temp = arr[i];
				if(i==0)
					temps="Skills";
				else if(i==1)
					temps="Mentality";
				else if(i==2)
					temps="Passing";
				else if(i==3)
					temps="Speed";
				else if(i==4)
					temps="Heading";
			}

		}
		if(a.equals("val"))
			return Integer.toString(temp);
		else
			return temps;
	}
}