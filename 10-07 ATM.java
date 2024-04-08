
import java.util.Scanner;
 class ATM {
	private int id;
	private double balance;
	
	ATM(int newId, double newBalance){
		id = newId;
		balance = newBalance;
		
	}
	
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 ATM[] identity = new ATM[11];
			identity[1] = new ATM(1, 100.0);
			identity[2] = new ATM(2, 100.0);
			identity[3] = new ATM(3, 100.0);
			identity[4] = new ATM(4, 100.0);
			identity[5] = new ATM(5, 100.0);
			identity[6] = new ATM(6, 100.0);
			identity[7] = new ATM(7, 100.0);
			identity[8] = new ATM(8, 100.0);
			identity[9] = new ATM(9, 100.0);
			identity[10] = new ATM(10, 100.0);
			
			int i=0;
			do {
            System.out.print("\nEnter your ID: ");
            int id = input.nextInt();
            
            System.out.printf("ID Entered: "+id);
            System.out.println("\nCurrent Balance: " + identity[id].balance);
            System.out.println("1: withdraw");
            System.out.println("2: deposit");
            System.out.println("3: exit");
		 int exodus =0;
		 double removal = 0;
         double sublimate = 0;
            do {
            System.out.print("\nChoose an Option: ");
            int menuChoice = input.nextInt();
           
            if (menuChoice == 1) {
            	System.out.printf("\nEnter amount to withdraw: ");
            	 removal = input.nextInt();
            	 System.out.println("Your new balance is "+identity[id].withdraw(removal,sublimate));}
            
            if (menuChoice == 2) {
            	System.out.printf("\nEnter amount to deposit: ");
            	 sublimate = input.nextInt();
            	 System.out.println("Your new balance is "+identity[id].deposit(removal,sublimate));}
            
            if (menuChoice == 3) {
            	 exodus=exodus+1;}
            
            } while (exodus<1);
            } while (i<5);
	 }
	
	 
	 public double withdraw(double Withdraw, double Deposit){
		 balance = balance-Withdraw;
		    return balance;} 

     public double deposit(double Withdraw, double Deposit){
    	 balance = balance+Deposit;
    	 	return balance;} 
}