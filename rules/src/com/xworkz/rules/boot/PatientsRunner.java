package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.HospitalRules;

public class PatientsRunner {

	public static void main(String[] args)
	{
		HospitalRules hospital=new HospitalRules();
		hospital.chairmanOfhospital();
		hospital.hospitalName();
		hospital.hospitalLocation();
		hospital.typeOfDoctors();
		hospital.rulesofHospital();
	}

}
