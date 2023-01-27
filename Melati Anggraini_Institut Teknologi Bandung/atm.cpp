#include<iostream>
#include<conio.h>
#include<string>
using namespace std;

// Mini Project - ATM
// > Check Balance 
// > Cash withdraw 
// > User Details 
// Update Mobile No.

class atm{
private :										// variabel privat pengguna
	long int account_No; 
	string name;
	int PIN;
	double balance;
	string mobileNo;
	
public : 									// public member functions 
 	// setData function is setting the Data into the privat member variables
 	void setData (long int account_No_a, char string[4] name_a, int PIN_a, double balance_a, char string[8] mobileNo_a)
 	{
 		account_No = account_No_a   // assigment the formal argument to the privat member variable
 		name = name_a
 		PIN = PIN_a
 		balance = balance_a
 		mobile_No = mobile_No_a
	}
	
	
	// getAccountNo function is returning the user's account no.
	long int getAccountNo()
	{
		return account_No;
	}
	
	// getAccountNo function is returning the user's  Name 
	string getName()
	{
		return name;
	}
	// getPIN function is returning the user's PIN
	int getPIN()
	{
		return PIN ;
	}
	// getBalance function is returning the user's Bank Balance
	double getBalance()
	{
		return balance;
	}
 	// getMobileNo is returning the user's Mobile No. 
 	string getMobileNo()
 	{
 		return mobileNo;
	}
	
	//setMobile function is updating the user mobile no.
	void setMobile(string mob_prev, string mob_new)
	{
		if (mob_prev = mobileNo)    // it will check the old mobile no
		{
			mobileNo = mob_new   // Updated with new, if old matches
			cout<< " Succesfully Update Mobile no. ";
			_getch();				// getch is to hold screen (until user press any key)
		
		}
		
		else {
			cout<< "Incorrect!!! Old Mobile no.";
			_getch(); // getch is to hold the screen (until user press any key)
		}
	}
	
	//cashWithDraw function is used to withdraw money from ATM 
	void casWithDraw(int amount_a){
		if (amount_a>0) && (amount_a< balance) 	// check entered validity 
		{
			balance -= amount_a ;       		/// balance = balance-amount
			cout<<endl<<  "Please Collect Your Cash";
			cout<< endl<< "Available Balance"<< balance;
			_getch();// getch is to hold the screen (until user press any key)
			
		}
		
		else{
			cout<< "Invalid Input or Insufficient Balance ";
			_getch();// getch is to hold the screen (until user press any key)
		}
	}
};

///////////////////////////////////////////////////////////////////////////////////////////////////

int main(){
	/// User Autentication
	int choice = 0, enterPIN;
	long int enterAccountNo;
	
	system("cls");
	
	
	// Created user(Object)
	atm user1;
	//Set User Details (into object )      (Setting Default Data)
	user1.setData(1234567, "Melati", 1111, 45000.09, "9087654321");
	
	
	do {
		system("cls");
		
		cout<<endl << "***Welcome to ATM***"<<endl;
		cout<< endl<< "Enter Your Account No ";
		cin>> enterAccountNo;						// asking user to enter account no 
		
		cout<< endl<< "Enter PIN";
		cin>> enterPIN;								// asking user to enter PIN
		
		// check wether enter values matches with user details
		if ((enterAccountNo = user1.getAccountNo()) && (enterPIN = user1.getPIN()))
		{
			do{
				int amount = 0;
				string oldMobieNo, newMobileNo;
				
				system("cls");
				// user Interface
				cout << endl<< ***Welcome to AMT***<< endl;
				cout<< endl<< "Select Options "<<endl;
				cout<< endl<< "1. Check Balance "<<endl;
				cout<< endl<< "2. Cash WithDraw"<<endl;
				cout<< endl<< "3. Show User Details"<<endl;
				cout<< endl<< "4. Update Mobile No"<<endl;
				cout<< endl<< "5. Exit "<<endl;
				cin>> choice;						// taking user choice
				
				
				switch (choice)
				{
					case 1 :						// if user presses 1
						cout<< endl<< "Your Bank Balance is : "<< user1.getBalance();
						
					case 2 :
						cout << "Enter the amount : ";
						user1.casWithDraw(amount); 			// calling cashwithDraw function
						
						break ; // passing the withdraw amount
						
					case 3 :
						cout<< "The Users Details are :-";
						cout<< endl << "-> Account no "<< user1.getAccountNo();
						cout <<endl<< "-> Name "<< user1.getName();
						cout<< endl << "-> Balance"<< user1.getBalance();
						cout<< endl << "-> Mobile No."<< user1.getMobileNo();
						/// getting and printing user details
						_getch(); 
						break ; 
					
					case 4 :
						cout<< "Enter Old Mobile No. ";
						cin>> oldMobileNo;  			// take old mobile no
					
					case 5 : 
						exit(0);						// exit application
						
					default :
						cout<< endl<< "Enter Data Valid !!!!";
				}
			}while (1);						// MENU // condition will always TRUE and loop is capable of running
				// infinite times
				
		}
		else 
		{
			cout << endl << "User Details are Invalid !!!";
			_getch();
		}
		
	}while(1);					// LOGIN // MENU // condition will always TRUE and loop is capable of running
				// infinite times...
}

