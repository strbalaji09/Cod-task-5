import java.util.Scanner;
class bank{
    public static void main(String[] args) {
        System.out.println("Welcome to Indian bank service");
        System.out.println("1.Create account");
        System.out.println("2.Deposit");
        System.out.println("3.Transfer money");
        System.out.println("4.view transaction");
        System.out.println("5.personal details");
        Scanner in=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        int choice,CashInaccount,X,Y,Z,balance,R,S;
        System.out.println("Enter the choice 1 to 5");
        choice = in.nextInt();
        switch (choice) {
            case 1:
            System.out.println("Enter your name :");
            String name=sc.nextLine();
            System.out.println("Enter your father name :");
            String  fathername=sc.nextLine();
            System.out.println("Enter your aadhar number:");
            String aadharnumber=sc.nextLine();
            System.out.println("Enter your phone number :");
            String phonenumber=sc.nextLine();
            System.out.println("Enter your address :");
            String address=sc.nextLine();
            System.out.println("\n your account has been created");
            System.out.println("your Account number: 45623798");
            System.out.println("Name:"+name);
            System.out.println("Father Name:"+ fathername);
            System.out.println("phone number:"+phonenumber);
            System.out.println("Address:"+address);
            break;
            case 2:
            System.out.println("Enter the account number");
            X=in.nextInt();
            if(X ==12345678){
                System.out.println("");
            }else{
                System.out.println("Wrong account number");
            }
            System.out.println("Enter the password");
            Y=in.nextInt();
            if(Y ==1234){
                System.out.println("");

            }else{
                System.out.println("Wrong pin number");
            }
            System.out.println("Enter the amount");
            Z =in.nextInt();
            CashInaccount =20000;
            if(Z <=20000){
                balance = CashInaccount + Z;
                System.out.println("balance in account :"+balance);
                break;
            }
            case 3:
            CashInaccount =20000;
            System.out.println("Enter the account number");
            R=in.nextInt();
            System.out.println("Enter the amount to transfer ");
            S=in.nextInt();
            if(S <= 20000){
                balance= CashInaccount -S;
                System.out.println("balance in account:"+balance);
            }
            else{
                System.out.println("OOps...insufficient balance.");
            }
            case 4:
            System.out.println("Enter the account number");
            X=in.nextInt();
            if(X ==12345678){
                System.out.println("");
            }else{
                System.out.println("Wrong account number");
            }
            System.out.println("Enter the password");
            Y=in.nextInt();
            if(Y ==1234){
                System.out.println("");

            }else{
                System.out.println("Wrong pin number");
            }
            System.out.println("01/03/2024-withdrawl-3000-balance:27000");
            System.out.println("20/03/2024-withdrawl-2000-balance:25000");
            System.out.println("25/03/2024-deposited-5000-balance:30000");
            System.out.println("02/04/2024-tranfered-10000-balance:20000");
            case 5:
            System.out.println("Enter the account number");
            X=in.nextInt();
            if(X ==12345678){
                System.out.println("");
            }else{
                System.out.println("Wrong account number");
            }
            System.out.println("Enter the password");
            Y=in.nextInt();
            if(Y ==1234){
                System.out.println("");

            }else{
                System.out.println("Wrong pin number");
           }
           System.out.println("....Welcome to Indian bank service...");
            System.out.println("Bank name           :Indian bank");
            System.out.println("Bank branch         :chennai");
            System.out.println("Account number      :12345678");
            System.out.println("Account holder name :Elumalai");
            System.out.println("Available balance   :20000");
            break; 
        }

    }
}