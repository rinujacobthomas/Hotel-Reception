package Main;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import Data.Data;
import Booking.Booking;
import Customer.Customer;
import Registration.Registration;
public class Main {
	public static void main(String []args) throws IOException {
		int flag,exit=0,check,choice;
		String c;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner s= new Scanner(System.in);
	Customer rinu = new Customer();
	Registration r=new Registration();
	Booking book=new Booking();
	Data data = new Data();
	//Hotel a=new Hotel();
	System.out.println("please Register\n");
	while(true)
	{
	System.out.println("\tMenu\n1. Register\n2. Book\n3. Check Status\n4. Update Email\n5. ViewCustomers\n6. Booking Dates\n7. Customer Details\n8. Exit\nEnter your choice");
	choice=s.nextInt();
	switch(choice)
	{
	case 1:
	{
		r.registr();
		System.out.println("Do you want to book room");
	c=br.readLine();
	if(c.equals("no"))
		data.indexboo++;
	else
		System.out.println("Please Select option 2 from next menu");
	System.out.println();
	break;
	}
	case 2:
	{
		r.book();
	break;
	}
	case 3:
	{
		System.out.println("Enter Room number");
	check=s.nextInt();
	System.out.println();
	flag=0;
	for(int i=0;i<20;i++)
	{
		if(data.roomsarray[i]==check)
		{
			flag=1;
			System.out.println("Room number "+check+" is booked");
			break;
		}
	}
	System.out.println();
	if(flag==0)
		System.out.println("Room number "+check+" is not booked");
	break;
	}
	case 4:
	{System.out.println("Enter id");
	int a1=s.nextInt();
	for(int  i=0;i<20;i++)
	{
		if(data.idarray[i]==a1)
		{
			System.out.println("Old Email : "+data.email[i]);
		System.out.print("Enter new email  : ");
		rinu.setEmail(br.readLine());
		System.out.println("\n\t EMAIL UPDATED");
		data.email[i]=rinu.getEmail();
		System.out.println("New Email : "+data.email[i]);
	}}
	break;
	}
	case 5:
	{
System.out.println("\tThe registered customers are");
		for(int i=0;(i<20)&&(data.namearray[i]!=null);i++)
		{
			System.out.println("Customer ID	 Customer name");
			System.out.println("   "+data.idarray[i]+"         \t"+data.namearray[i]);
			System.out.println("Date   Room    Total amount");
			System.out.println(data.datearray[i]+"\t"+data.roomsarray[i]+"     \t"+data.total[i]);
		}
		break;
	}
	case 6:
	{
		System.out.print("Enter Date from  : ");
		int from= s.nextInt();
		System.out.print("\nEnter Date to  : ");
		int to =s.nextInt();
		System.out.println("id.    Rooms   Customer");
		for(int i=0;i<20;i++)
		{
			
		if((data.datearray[i]>=from)&&(data.datearray[i]<=to))
		{
			if(data.roomsarray[i]==0)
			{}
			else
			{
				System.out.println(data.idarray[i]+"\t"+data.roomsarray[i]+"\t"+data.namearray[i]);
			}
		}
		
	}
		break;
	}
	case 7:
	{
		System.out.println("Enter ID");
		int a=s.nextInt();
		data.customerDetails(a);
		break;
	}
	case 8:
	{
		
	}
	case 9:
	{
		data.display();
		break;
	}
	}
	}
}
}