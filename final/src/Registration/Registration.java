package Registration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Data.Data;
import Booking.Booking;
import Customer.Customer;

public class Registration {
	static int b=0;
	static int idar=0;
	static boolean reg=false;
	Customer rinu= new Customer();
	Booking book= new Booking();
	Data data=new Data();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void registr() throws IOException
	{
	b++;
	System.out.println("Customer number  : "+b);
System.out.print("Enter Name  : ");
rinu.setName(br.readLine());
System.out.print("\nEnter Address  : ");
rinu.setAddress(br.readLine());
System.out.print("\nEnter Contact Number  : ");
rinu.setContactNumber(br.readLine());
System.out.print("\nEnter Email  : ");
rinu.setEmail(br.readLine());
System.out.print("\nProof Type  : ");
rinu.setProofType(br.readLine());
System.out.print("\nProof Id  : ");
rinu.setProofId(br.readLine());
rinu.setCustomerid(b);
data.registration(rinu);
rinu.register();
System.out.println();
System.out.println("\nThank you for registering. Your id is "+b);
idar++;
reg=true;
}
	public void book() throws IOException {
		if(reg==true)
		{
			book.booking();
		}
		else
		{
			System.out.println("\tRegister First\nAs per the Hotel policy you can only book one room");
		}
	reg=false;	
	}
}
