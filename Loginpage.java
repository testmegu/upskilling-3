import java.util.Scanner;

public class Loginpage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String sp=" ";
        System.out.println("Enter the Username ");
        String username = sc.nextLine();
        if((username.contains(sp)) || username.length()<4){
            System.out.println("Invalid Username");
            return;
        }

        System.out.println("Enter the Password");
        String userpass = sc.nextLine();
        if((userpass.contains(sp)) || userpass.length()<8){
            System.out.println("Invalid Password");
            return;
        }

        System.out.println(username+" you are Registered Successfully...");

        System.out.println("Enter the Username");
        String uname = sc.nextLine();
        System.out.println("Enter the Password");
        String upass = sc.nextLine();

        if(username.equals(uname) && userpass.equals(upass)){
            System.out.println("Welcome "+uname+" you have Logged_in Successfully...");
        }
        else{
            System.out.println("Username or password MissMatch");
        }

	}

	}


