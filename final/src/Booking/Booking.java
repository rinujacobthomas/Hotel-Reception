package Booking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import Data.Data;
import Customer.Customer;

public class Booking {
	int b=0,total;
	static int  nonAcRoomSingle=1;
	static int acRoomSingle=6;
	static int nonAcRoomDouble=11;
	static int acRoomDouble=16;
	String c;
	String temp;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner s=new Scanner(System.in);
	Customer rinu = new Customer();
	Data data = new Data();
	public void booking() throws IOException
	{
		
		System.out.println("Enter Date");
	rinu.setDate(s.nextInt());
		total = 0;
	System.out.println("\nDo you need Ac");
	c=br.readLine();
	if(c.equals("yes")) {
		rinu.setAc("AC");
		System.out.println("1000");
		total=total+1000;
	}
	else if(c.equals("no"))
	{
		rinu.setAc("nAC");
		System.out.println("750");
		total=total+750;
	}
	temp=c;
	System.out.println("\nDo you need Double Cot");
	c=br.readLine();
	if(c.equals("yes")) {
		rinu.setCot("Double cot");
		System.out.println("350");
		total=total+350;
	}
	else if(c.equals("no"))
	{
		rinu.setCot("Single cot");
		System.out.println("0");
	}
	System.out.println("\nDo you need cable connection");
	if(temp.equals("yes")&&(c.equals("yes")))
	{
		rinu.setRoomNo(acRoomDouble);
		acRoomDouble++;
	}
	else if((temp.equals("yes"))&&(c.equals("no")))
	{
		rinu.setRoomNo(acRoomSingle);
		acRoomSingle++;
	}
	
else if(temp.equals("no")&&(c.equals("yes")))
	{
	rinu.setRoomNo(nonAcRoomDouble);
		nonAcRoomDouble++;
	}
	else if((temp.equals("no"))&&(c.equals("no")))
	{
		rinu.setRoomNo(nonAcRoomSingle);
		nonAcRoomSingle++;
	}
	c=br.readLine();
	
	if(c.equals("yes")) {
		rinu.setCable("With cable connection");
		System.out.println("50");
		total=total+50;
	}
	else if(c.equals("no"))
	{
		rinu.setCable("without cable connection");
		System.out.println("0");
	}
	System.out.println("\nDo you need Wi-Fi");
	c=br.readLine();
	if(c.equals("yes")) {
		rinu.setWifi("Wi-Fi needed");
		System.out.println("200");
		total=total+200;
	}
	else if(c.equals("no"))
	{
		rinu.setWifi("Wi-Fi not needed");
		System.out.println("0");
		
	}
	System.out.println("\nDo you need Laundry service");
	c=br.readLine();
	if(c.equals("yes")) {
		rinu.setLaundry("Laundry service needed");
		System.out.println("100");
		total=total+100;
	}
	else if(c.equals("no"))
	{
		rinu.setLaundry("Laundry service not needed");
		System.out.println("0");
	}
	
	rinu.setTotal(total);
	
	rinu.display();
	data.booking(rinu);
	
	}
	
}
