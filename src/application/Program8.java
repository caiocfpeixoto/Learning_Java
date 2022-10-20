package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program8 {

	public static void main(String[] args) {
		
		Account acc =  new Account(1001, "Alex", 1000.0);
		BusinessAccount bacc = new  BusinessAccount(1002, "Pedro", 0.0, 10.0);
		
		acc.withDraw(200.0);
		System.out.println(acc.getBalance());
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "João", 1000.0, 500.0);
		Account acc3 = new SavingsAccount(1004, "Maria", 1000.0, 0.01);
		acc3.withDraw(200.0);
		System.out.println(acc3.getBalance());
		acc2.withDraw(200.0);
		System.out.println(acc2.getBalance());
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5  = (BusinessAccount)acc3;
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
