import java.util.Scanner;
interface SA
{
	abstract void signup();
}
interface Log
{
	abstract void login();
}
public class SignUp implements SA,Log  {
	
	
	static Scanner sc=new Scanner(System.in);
	
	static long accountno;
	static String firstName;
	static String middleName;
	static String lastName;
	private String Username="peter";
	private String Username1;
	private String Password;
	private String Password1;
	static String Email;
	static double balance=200000;
	static String Bank="HDFC";
	static String Bname="KhadakPada";
	static String IFSC="HDFC12345";
	private String phonenum="8169199340";
	static String UPIid="8169199340@bank";
	static long debit_Cardno;
	static long custid=9398482348l;
	static String birthdate="13-09-1999";
	static String phoneno;
	static String Uname;
	static String Pswd;
	static String Gender;
	
	SignUp()
	{
//		this.firstName=firstName;
	}
//	static string Name= (firstName+middleName+lastName);
	
//	public void setUserName(String Username) 
//	{
//		this.Username = Username;
//	}
	
	public String getUserName() 
	{
		return this.Username;
	}

//	public void setUserName1(String Username1)
//	{
//		this.Username1 = Username1;
//	}
	
	public String getUserName1()
	{
		return this.Username1;
	}
	
	
//	public void setPassword(String Password) 
//	{
//		this.Password = Password;
//	}
	
	public String getPassword() 
	{
		return Password;
	}
 
	
//	public void setPassword1(String Password1) 
//	{
//		this.Password1 = Password1;
//	}
	
	public String getPassword1() 
	{
		return this.Password;
	}
 
	

//	public void setPhoneNum(String phonenu) 
//	{
//		this.phonenum = phonenu;
//	}
	
	public String getPhoneNum() 
	{
		return phonenum;
	}

	@Override
	public String toString() 
	{	
	return "Username :- " + getUserName() +   "\n Phone Number :- " + getPhoneNum() ;
	}

	public void signup()
	{
		
		System.out.println("Enter Your Email:");
		Email=sc.nextLine();
		
		System.out.println("Enter Your First Name:");
	    firstName=sc.nextLine();
	    this.firstName=firstName;

	    System.out.println("Enter Your Middle Name:");
	    middleName=sc.nextLine();
	   
	    
	    System.out.println("Enter Your Last Name:");
	    lastName=sc.nextLine();
	    
	    System.out.println("Enter Phone Number:");//username:user

	    String phonenu = sc.nextLine();
//        setPhoneNum(phonenu);
	    
	    
        System.out.println("Create username:");//username:user

        Username = sc.nextLine();
//        setUserName(Username);

        System.out.println("Create password:");//password:user

        Password = sc.nextLine();

        System.out.println("Enter username:");//username:user

        Username1 = sc.nextLine();
//        setUserName(Username1);
        
        System.out.println("Enter password:");//password:user

        Password1 = sc.nextLine();
        
        System.out.println(getPhoneNum());
		System.out.println(getUserName1());
		System.out.println(getUserName());

        if(Username.equals(Username1) && Password.equals(Password1))
        	{
            System.out.println("Authentication Successful");
            Welcome ref1=new Welcome();
    		ref1.welcome();
        	}
        else
        	{
        		System.out.println("Authentication Failed");
        		signup();
        	}  	    
		
	}
	
	public void login()
	{
		
		
		System.out.println("Enter Your Phone Number:");
	    phoneno=sc.next();
	    
		System.out.println("Enter Your User Name:");
	    Uname=sc.next();
	    
	    System.out.println("Enter Your Password:");
	    Pswd=sc.next();
	    
//	    this.phoneno=phoneno;
//	    this.Uname=Uname;
//	    this.Pswd=Pswd;
	    
//	    Email=this.Email;
//	    Name=this.Name;
//	    Username=this.Username;
//	    Password=this.Password;
//	    if(Username.equals(ref.Username1) && Password.equals(ref.Password1))
//        {
//            System.out.println("Authentication Successful");
//            Welcome ref1=new Welcome();
//    		ref1.welcome();
//        }
//        else
//        	{
//        		System.out.println("Authentication Failed");
//        	}  	    
//        }
	}
}

