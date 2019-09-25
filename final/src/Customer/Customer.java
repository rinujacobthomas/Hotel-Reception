package Customer;

public class Customer {
	private String name;
	private String address;
	private String contactNumber;
	private String email;
	private String  proofType;
	private String proofId;	
	private String ac;
	private int total;
	private int roomNo;
	private int date;
	private int customerid;
	private String cot;
	private String cable;
	private String wifi;
	private String laundry;
	public String getCot() {
		return cot;
	}
	public void setCot(String cot) {
		this.cot = cot;
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getLaundry() {
		return laundry;
	}
	public void setLaundry(String laundry) {
		this.laundry = laundry;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofId() {
		return proofId;
	}
	public void setProofId(String proofId) {
		this.proofId = proofId;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
	public void register()
	{
		System.out.println("\tDetails\nName  : "+this.getName()+"\nAddress  : "+this.getAddress()+"\nContact Number  : "+this.getContactNumber()+"\nEmail  : "+getEmail()+"\nProof Type  : "+getProofType()+"\nProof Id  : "+getProofId());
		
	}
	public void display()
	{
		System.out.println("The service selected are "+this.getAc()+"\n"+this.getCot()+"\n"+this.getCable()+"\n"+this.getWifi()+"\n"+this.getLaundry()+"\nTotal Amount = "+this.getTotal());
	//System.out.println("Room number is "+getRoomNo());
	}
	
}
