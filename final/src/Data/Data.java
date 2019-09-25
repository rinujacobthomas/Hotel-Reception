package Data;
import Customer.Customer;
import Registration.Registration;;
public class Data {
	static int indexreg=0;
	public static int indexboo=0;
	public static String namearray[]=new String[20];
	public static int [] roomsarray=new int[20];
	public static int [] idarray=new int[20];
	public static int[] datearray= new int[20];
	public static String [] phone= new String[20];
	public static String [] address= new String[20];
	public static String [] idType= new String[20];
	public static String [] idno= new String[20];
	public static String [] email= new String[20];
	public static int [] total=new int[20];

	public void registration(Customer rinu)
	{
		namearray[indexreg]=rinu.getName();
		address[indexreg]=rinu.getAddress();
		phone[indexreg]=rinu.getContactNumber();
		idType[indexreg]=rinu.getProofType();
		email[indexreg]=rinu.getEmail();
		idno[indexreg]=rinu.getProofId();
		idarray[indexreg]=rinu.getCustomerid();
		indexreg++;
	}
	public void booking(Customer rinu)
	{
		datearray[indexboo]=rinu.getDate();
		roomsarray[indexboo]=rinu.getRoomNo();
		total[indexboo]=rinu.getTotal();
		System.out.println("Room number is "+roomsarray[indexboo]);
		indexboo++;
	}
	public void display() {
		for(int i=0;i<20;i++)
		{
			System.out.println(namearray[i]+" "+idarray[i]+"  "+roomsarray[i]+" "+datearray[i]+" "+email[i]);
		}
	}
	public void customerDetails(int a) {
		for(int i=0;i<20;i++)
		{
			if(idarray[i]==a)
			System.out.println("Customer ID : "+idarray[i]+"\tName : "+namearray[i]+"\nRoom : "+roomsarray[i]+"\tBooking Date : "+datearray[i]+"\nPhone No. : "+phone[i]+"\tEmail : "+email[i]+"\nID Type : "+idType[i]+"\tID no. : "+idno[i]);
			break;
		}
	}
}