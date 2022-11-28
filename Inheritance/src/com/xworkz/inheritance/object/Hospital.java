package com.xworkz.inheritance.object;

public class Hospital
{
	private String name;
	private String loction;
	private long phoneNo;
	private boolean appointment;
	private String doctoeName;
	private String type;
	private double fee;
	private String patientName;
	private int age;
	private String disease;
	private int noOfPatients;
	
	public Hospital() 
	{
		System.out.println("details of hospital");
	}
	
	public Hospital(String name, String loction, long phoneNo, boolean appointment, String doctoeName, String type,
			double fee, String patientName, int age, String disease, int noOfPatients) {
		super();
		this.name = name;
		this.loction = loction;
		this.phoneNo = phoneNo;
		this.appointment = appointment;
		this.doctoeName = doctoeName;
		this.type = type;
		this.fee = fee;
		this.patientName = patientName;
		this.age = age;
		this.disease = disease;
		this.noOfPatients = noOfPatients;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Hospital)
		{
			Hospital hospital=(Hospital)obj;
			if(this.disease.equals(hospital.disease) && this.doctoeName.equals(hospital.doctoeName) && this.age==hospital.age &&
				this.type.equals(hospital.type) && this.appointment==hospital.appointment && this.patientName.equals(hospital.patientName) && this.loction.equals(hospital.loction))
			{
				System.out.println("Patient details are true, it will be print");
				return true;
			}
			else
			{
				System.out.println("it will not print the details");
			}
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Hospital [name=" + name + ", loction=" + loction + ", phoneNo=" + phoneNo + ", appointment="
				+ appointment + ", doctoeName=" + doctoeName + ", type=" + type + ", fee=" + fee + ", patientName="
				+ patientName + ", age=" + age + ", disease=" + disease + ", noOfPatients=" + noOfPatients + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoction() {
		return loction;
	}

	public void setLoction(String loction) {
		this.loction = loction;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public boolean isAppointment() {
		return appointment;
	}

	public void setAppointment(boolean appointment) {
		this.appointment = appointment;
	}

	public String getDoctoeName() {
		return doctoeName;
	}

	public void setDoctoeName(String doctoeName) {
		this.doctoeName = doctoeName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getNoOfPatients() {
		return noOfPatients;
	}

	public void setNoOfPatients(int noOfPatients) {
		this.noOfPatients = noOfPatients;
	}
	
	
	
	
	
	
	
}
