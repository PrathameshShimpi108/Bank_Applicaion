import java.util.Scanner;
class Home2 extends Welcome
{
	
	public static void home2()
	{
		System.out.println(" -------------------------------------------------------------");
		System.out.print("|");
		System.out.print("                           Accounts                           ");
		System.out.println("|");
		System.out.println(" -------------------------------------------------------------");
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("Savings Account:                                              ");
		System.out.println(accountno);
		System.out.println(balance);
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("1.Open Accounts");
		System.out.println("2.Show Account Details");
		System.out.println("3.Show Statements");
		System.out.println("4.Share Account Details");
		System.out.println("5.Due Bills");
		System.out.println("6.Back");
	    System.out.println("______________________________________________________________________");
	    System.out.println("Select Option:");
	    Welcome ref1=new Welcome();
	    Scanner s = new Scanner(System.in);
		int select = s.nextInt();
		switch(select)
		{
		case 1: 
				Accounts2 acc=new Accounts2(112434454,10000);
				acc.accounts2();
		break;
		case 2: 
			Details2 det=new Details2(82320293013902l);
			det.details2();
		break;
		case 3:
			Statements2 state=new Statements2();
			state.statements2();
		break;
		case 4:
			ShareDetails2 share=new ShareDetails2();
			share.sharedetails2();
		break;
		case 5:
			DueBills2 due=new DueBills2();
			due.duebills2();
		break;
		case 6: 
			ref1.welcome2();
		break;
		default:
			System.out.println("invalid input");
			home2();
		break;
		}
	}
}

class Accounts2 extends Home2
{
	
	Accounts2(long accountno,double balance)
	{
		this.accountno=accountno;
		this.balance=balance;
		
	}
	public void accounts2()
	{
		System.out.println("Savings Account");
		System.out.println(accountno);
		
		System.out.println("______________________________________________________________________");
		System.out.println("Available Balance");
		System.out.println(balance);
		System.out.println("______________________________________________________________________");
		System.out.println("1.Back");
		int A=sc.nextInt();
		switch(A)
		{
		case 1: home2();
		}
	}
}

class Details2 extends Home2
{
	Details2(long accountno)
	{
		
		this.Bname=Bname;
		this.accountno=accountno;
	}
	public void details2()
	{
		SignUp ref=new SignUp();
		System.out.println("Account Holders: "+" " +firstName+" "+middleName+" "+lastName);
		System.out.println("Branch: "+ Bname);
		System.out.println("IFSC: " +IFSC);
		System.out.println("Username: "+ Uname);
		System.out.println("Phone Number: "+phoneno);
		System.out.println("Account Number: "+accountno);
		System.out.println("1.Back");
		int D=sc.nextInt();
		switch(D)
		{
		case 1: home2();
		}
	}
}
class Statements2 extends Home2
{
	public void statements2()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("                                                                      ");
		System.out.println("                            Statements                                ");
		System.out.println("                                                                      ");
		System.out.println("______________________________________________________________________");
		System.out.println("Recent Transactions =");
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("1.Back");
		int St=sc.nextInt();
		switch(St)
		{
		case 1: home2();
		}
	}
}
class ShareDetails2 extends Home2
{
	public void sharedetails2()
	{
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Send to:-");
		System.out.println("WhatsApp");
		System.out.println("SMS");
		System.out.println("Telegram");
		System.out.println("Twitter");
		System.out.println("Gmail");
		System.out.println("Facebook");
		System.out.println("----------------------------------------------------------------------");

		System.out.println("1.Back");
		int Sh=sc.nextInt();
		switch(Sh)
		{
		case 1: home2();
		}
	}


}


class DueBills2 extends Home2
{
	public void duebills2()
	{
		System.out.println("Register your bills and pay all your bills with one click");
	    System.out.println(" -----------------");
	    System.out.print("|");
		System.out.print("  Add Due Bill   ");
		System.out.println("|");
		System.out.println(" -----------------");
		System.out.println("1.Back");
		int du=sc.nextInt();
		switch(du)
		{
		case 1: home2();
		}
	}
}

