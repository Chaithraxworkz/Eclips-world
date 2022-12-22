package com.xworkz.collections.boot;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AllDams {

	public static void main(String[] args) 
	{
		Collection<String> damsInAndhraPradesh = new ArrayList<String>();
		damsInAndhraPradesh.add("Akkapalem Dam");
		damsInAndhraPradesh.add("Andhra Dam ");
		damsInAndhraPradesh.add("Bahuda Dam");
		damsInAndhraPradesh.add("Chitravathi Dam");
		damsInAndhraPradesh.add("Dharmavaram Dam");
		damsInAndhraPradesh.add("Gundlamotu Dam");
		damsInAndhraPradesh.add("Haresamudram Big Dam");
		damsInAndhraPradesh.add("Jalakanur Dam");
		damsInAndhraPradesh.add("Kalyani Dam");
		System.out.println("Dam size in AndhraPradesh :" +damsInAndhraPradesh.size());
		
		Collection<String> damsInArunachalPradesh = new ArrayList<String>();
		damsInArunachalPradesh.add("Ranganadi Dam");
		damsInArunachalPradesh.add("Subansiri Dam");
		System.out.println("Size of Dam in ArunachalPradesh :" + damsInArunachalPradesh.size());
		
		Collection<String> damsInAssam = new ArrayList<String>();
		damsInAssam.add("Karbi Langpi Dam ");
		damsInAssam.add("Umrong Dam");
		damsInAssam.add("Khandong");
		damsInAssam.add("Pagladia Dam");
		System.out.println("Size of Dam in Assam :" +damsInAssam.size());
		
		Collection<String> damsInBihar = new ArrayList<String>();
		damsInBihar.add("Ajan Dam");
		damsInBihar.add("Badua Dam");
		damsInBihar.add("Barnar Dam");
		damsInBihar.add("Chandan Dam ");
		damsInBihar.add("Durgawati Dam");
		damsInBihar.add("Jalkund Dam");
		damsInBihar.add("Kohira Dam");
		damsInBihar.add("Nakti Dam");
		damsInBihar.add("Srikhandi Dam");
		System.out.println("Size of Dams in Bihar :" +damsInBihar.size());
		
		Collection<String> damsInChhattisgarh = new ArrayList<String>();
		damsInChhattisgarh.add("Aondhi Dam");
		damsInChhattisgarh.add("Badauli Dam");
		damsInChhattisgarh.add("Badra Dam");
		damsInChhattisgarh.add("Banki Dam");
		damsInChhattisgarh.add("Barat Sagar Dam");
		damsInChhattisgarh.add("Chandra Nagar Dam");
		damsInChhattisgarh.add("Chhirpani Dam");
		damsInChhattisgarh.add("Darki Dam");
		damsInChhattisgarh.add("Ganeshpur Dam");
		damsInChhattisgarh.add("Kadna Dam");
		System.out.println("Size of Dams in Chhattisgarh :"+ damsInChhattisgarh.size());
		
		Collection<String> damsInGoa = new ArrayList<String>();
		damsInGoa.add("Anjunam Dam");
		damsInGoa.add("M.I. Dam");
		damsInGoa.add("Salaulim Dam");
		System.out.println("Size of Dams in Goa :" +damsInGoa.size());
		
		Collection<String> damsInGujarat = new ArrayList<String>();
		damsInGujarat.add("Adhia Dam");
		damsInGujarat.add("Adpur Dam");
		damsInGujarat.add("Ajwa Dam");
		damsInGujarat.add("Anandpar Dam");
		damsInGujarat.add("Anida Dam");
		damsInGujarat.add("Bagad Dam");
		damsInGujarat.add("Bangawadi Dam");
		damsInGujarat.add("Isar Dam");
		System.out.println("Sie of Dams in Gujarat :" +damsInGujarat.size());
		
		Collection<String> damsInHaryana = new ArrayList<String>();
		damsInHaryana.add("Kaushalya Dam");
		damsInHaryana.add("Ottu barrage");
		damsInHaryana.add("Anagpur Dam");
		damsInHaryana.add("Masani barrage");
		damsInHaryana.add("Palla barrage ");
		System.out.println("Size of Dams in Hariyana :"+damsInHaryana.size());
		
		Collection<String> damsInHimachalPradesh = new ArrayList<String>();
		damsInHimachalPradesh.add("Bassi Dam");
		damsInHimachalPradesh.add("Bhakra Dam");
		damsInHimachalPradesh.add("Kol Dam");
		damsInHimachalPradesh.add("Pandoh Dam");
		damsInHimachalPradesh.add("Pong Dam");
		System.out.println("Size of Dams in HimachalPradesh :"+ damsInHimachalPradesh.size());
		
		Collection<String> damsInJammuAndKashmir = new ArrayList<String>();
		damsInJammuAndKashmir.add("Baglihar Dam");
		damsInJammuAndKashmir.add("Dulhasti Dam");
		damsInJammuAndKashmir.add("Kishenganga Dam");
		damsInJammuAndKashmir.add("Nimoo Bazgo Dam");
		damsInJammuAndKashmir.add("Pakal Dul Dam");
		System.out.println("Size of Dams in JammuAndKashmir :"+damsInJammuAndKashmir.size());
		
		
		Collection<String> damsInJharkhand = new ArrayList<String>();
		damsInJharkhand.add("Amanat Dam");
		damsInJharkhand.add("Barhi Dam");
		damsInJharkhand.add("Batre Dam");
		damsInJharkhand.add("Garhi Dam");
		damsInJharkhand.add("Hiru Dam");
		damsInJharkhand.add("Jaipur Dam");
		damsInJharkhand.add("Jenasai Dam");
		damsInJharkhand.add("Katri Dam");
		damsInJharkhand.add("Nakti Dam");
		System.out.println("Size of Dams in Jarkhand :"+ damsInJharkhand.size());
		
		Collection<String> damsInKarnataka = new ArrayList<String>();
		damsInKarnataka.add("Almatti Dam");
		damsInKarnataka.add("Basava Sagara Dam");
		damsInKarnataka.add("Bhadra Dam");
		damsInKarnataka.add("Gajnur Dam");
		damsInKarnataka.add("Tungabhadra Dam");
		damsInKarnataka.add("Linganamakki Dam");
		damsInKarnataka.add("Kodasalli Dam");
		damsInKarnataka.add("Kadra Dam");
		System.out.println("Size of Dams in karnataka :"+ damsInKarnataka.size());
		
		
		Collection<String> damsInKerala = new ArrayList<String>();
		damsInKerala.add("Mangalam Dam");
		damsInKerala.add(" Meenkara Dam");
		damsInKerala.add("Chulliar Dam");
		damsInKerala.add("Siruvani Dam");
		damsInKerala.add("Sholayar Dam");
		damsInKerala.add("Peechi Dam");
		damsInKerala.add("Neyyar Dam");
		damsInKerala.add("Idukki Dam");
		damsInKerala.add("Kundala Dam");
		System.out.println("Size of Dams in Kerala :" + damsInKerala.size());
		
		Collection<String> damsInMadhyaPradesh = new ArrayList<String>();
		damsInMadhyaPradesh.add("Adampura Dam");
		damsInMadhyaPradesh.add("Agar Dam");
		damsInMadhyaPradesh.add("Amadi Dam");
		damsInMadhyaPradesh.add("Ambari Dam");
		damsInMadhyaPradesh.add("Badera Dam");
		damsInMadhyaPradesh.add("Bagla Dam");
		damsInMadhyaPradesh.add("Bamera Dam");
		damsInMadhyaPradesh.add("Chainpur Dam");
		damsInMadhyaPradesh.add("Chinnod Dam");
		System.out.println("Size of Dams in MadhyaPradesh :" + damsInMadhyaPradesh.size());
		
		Collection<String> damsInMaharashtra = new ArrayList<String>();
		damsInMaharashtra.add("Bhivpuri dam");
		damsInMaharashtra.add("Dhom dam");
		damsInMaharashtra.add("Koyna dam");
		damsInMaharashtra.add("Panshet dam");
		damsInMaharashtra.add("Talaipalli dam");
		damsInMaharashtra.add("Walwan dam");
		damsInMaharashtra.add("Warna dam");
		damsInMaharashtra.add("Dhupgarh dam");
		damsInMaharashtra.add("Gargoti dam");
		damsInMaharashtra.add("Nira Dam");
		damsInMaharashtra.add("Jayakwadi Dam");
		damsInMaharashtra.add("Ujjani Dam");
		damsInMaharashtra.add("Isapur Dam");
		damsInMaharashtra.add("Totladoh Dam");
		System.out.println("Size of Dams in Maharastra :" + damsInMaharashtra.size());
		
		Collection<String> damsInManipur = new ArrayList<String>();
		damsInManipur.add("Khoupum Dam");
		damsInManipur.add("Khuga Dam");
		damsInManipur.add("Singda Dam");
		damsInManipur.add("Thoubal Dam");
		System.out.println("Size of Dams in Manipur :" + damsInManipur.size());
		
		
		Collection<String> damsInMeghalaya = new ArrayList<String>();
		damsInMeghalaya.add("Khandong Dam");
		damsInMeghalaya.add("Kyrdemkulai  Dam");
		damsInMeghalaya.add("Mawphlang Dam");
		damsInMeghalaya.add("Myntdu-Leshka Dam");
		damsInMeghalaya.add("Umiam Dam");
		System.out.println("Size of Dams in Meghalaya :" + damsInMeghalaya.size());
		
		
		Collection<String> damsInMizoram = new ArrayList<String>();
		damsInMizoram.add("Tuirial Dam");
		damsInMizoram.add("Serlui B Dam ");
		damsInMizoram.add("Bairabi Dam");
		System.out.println("Size of Dams in Mizoram :" + damsInMizoram.size());
		
		
		Collection<String> damsInNagaland = new ArrayList<String>();
		damsInNagaland.add("Doyang Hep Dam");
		System.out.println("Size of Dams in Nagaland :" + damsInNagaland.size());
		
		Collection<String> damsInOdisha = new ArrayList<String>();
		damsInOdisha.add("Aradei Dam");
		damsInOdisha.add("Badanalla Dam");
		damsInOdisha.add("Bedapada Dam");
		damsInOdisha.add("Chhamundia Dam");
		damsInOdisha.add("Deras Dam");
		damsInOdisha.add("Gohira Dam");
		damsInOdisha.add("Hirakud Dam");
		damsInOdisha.add("Indrawati Dam");
		damsInOdisha.add("Jhumuka Dam");
		damsInOdisha.add("Kanupur Dam");
		System.out.println("Size of Dams in Odisha :" + damsInOdisha.size());
		
		
		Collection<String> damsInPunjab = new ArrayList<String>();
		damsInPunjab.add("Chohal Dam");
		damsInPunjab.add("Damsal Dam");
		damsInPunjab.add("Jainti Dam");
		damsInPunjab.add("Janauri Dam");
		damsInPunjab.add("Mirzapur Dam");
		damsInPunjab.add("Patiari Dam");
		damsInPunjab.add("Perch Dam ");
		damsInPunjab.add("Ranjit Sagar Dam");
		damsInPunjab.add("Siswan Dam");
		damsInPunjab.add("Thana Dam");
		System.out.println("Size of Dams in Punjab :" + damsInPunjab.size());
		
		
		Collection<String> damsInRajasthan = new ArrayList<String>();
		damsInRajasthan.add("Abhaypura Dam");
		damsInRajasthan.add("Anwasa Dam");
		damsInRajasthan.add("Babara Dam");
		damsInRajasthan.add("Banakiya Dam");
		damsInRajasthan.add("Chandrana Dam");
		damsInRajasthan.add("Dhanta Dam");
		damsInRajasthan.add("Gadola Dam");
		damsInRajasthan.add("Jagpura Dam");
		damsInRajasthan.add("Kana Dam");
		System.out.println("Size of Dams in Rajastan :" + damsInRajasthan.size());
		
		
		Collection<String> damsInSikkim = new ArrayList<String>();
		damsInSikkim.add(" Rangit III Dam");
		damsInSikkim.add("Rangpo Dam");
		damsInSikkim.add("Rongli Dam");
		damsInSikkim.add("Teesta-III Dam");
		System.out.println("Size of Dams in Sikkim :" + damsInSikkim.size());
		
		
		Collection<String> damsInTamilNadu = new ArrayList<String>();
		damsInTamilNadu.add("Aliyar Dam");
		damsInTamilNadu.add("Amaravathi Dam");
		damsInTamilNadu.add("Barur Dam");
		damsInTamilNadu.add("Chinnar Dam");
		damsInTamilNadu.add("East Varahapallam dam");
		damsInTamilNadu.add("Gatana Dam");
		damsInTamilNadu.add("Kelavarapalli Dam");
		damsInTamilNadu.add("Krishnagiri Dam");
		damsInTamilNadu.add("Nagavathi Dam");
		damsInTamilNadu.add("Pillur Dam");
		System.out.println("Size of Dams in TamilNadu :" + damsInTamilNadu.size());
		
		Collection<String> damsInTelangana = new ArrayList<String>();
		damsInTelangana.add("Singur");
		damsInTelangana.add("Nagarjuna Sagar");
		damsInTelangana.add("Kadam");
		damsInTelangana.add("Ramagundam");
		damsInTelangana.add("Koilsagar");
		damsInTelangana.add("Nizam Sagar");
		System.out.println("Size of Dams in Telangana :" + damsInTelangana.size());
		
		
		Collection<String> damsInTripura = new ArrayList<String>();
		damsInTripura.add("Gumti Dam");
		System.out.println("Size of Dams in Tripura :" + damsInTripura.size());
		
		Collection<String> damsInStates = new ArrayList<String>();
		damsInStates.addAll(damsInAndhraPradesh);
		damsInStates.addAll(damsInArunachalPradesh);
		damsInStates.addAll(damsInAssam);
		damsInStates.addAll(damsInBihar);
		damsInStates.addAll(damsInChhattisgarh);
		damsInStates.addAll(damsInGoa);
		damsInStates.addAll(damsInGujarat);
		damsInStates.addAll(damsInHaryana);
		damsInStates.addAll(damsInHimachalPradesh);
		damsInStates.addAll(damsInJammuAndKashmir);
		damsInStates.addAll(damsInJharkhand);
		damsInStates.addAll(damsInKarnataka);
		damsInStates.addAll(damsInKerala);
		damsInStates.addAll(damsInMadhyaPradesh);
		damsInStates.addAll(damsInMaharashtra);
		damsInStates.addAll(damsInManipur);
		damsInStates.addAll(damsInMeghalaya);
		damsInStates.addAll(damsInMizoram);
		damsInStates.addAll(damsInNagaland);
		damsInStates.addAll(damsInOdisha);
		damsInStates.addAll(damsInPunjab);
		damsInStates.addAll(damsInRajasthan);
		damsInStates.addAll(damsInSikkim);
		damsInStates.addAll(damsInTamilNadu);
		damsInStates.addAll(damsInTelangana);
		damsInStates.addAll(damsInTripura);
		System.out.println("Dams :"+ damsInStates.size());
		
		for(String element : damsInStates)
		{
			System.out.println("Print :"+element);
		}
		
		Iterator<String> states = damsInStates.iterator();
		while(states.hasNext())
		{
			String element = states.next();
			if(element.startsWith("T"))
			{
				System.out.println("dams starts with T :"+element);
			}
			
			Iterator<String> dams = damsInStates.iterator();
			while(dams.hasNext())
			{
				String element1 = dams.next();
				if(element1.endsWith("ra"))
				{
					System.out.println("dams Ends with ra:"+ element1);
					dams.remove();
				}
			}
			
			Iterator<String> itr = damsInStates.iterator();
			System.out.println("String characters over 15");
			while(itr.hasNext())
			{
				String iterator=itr.next();
				if(iterator!=null &&iterator.length()>=15)
				{
					System.out.println("length is greator than 15 character" +iterator);
				}
			}
			
			System.out.println("upper case characters");
			Iterator<String> uppercase =damsInStates.iterator();
			while(uppercase.hasNext())
			{
				String upper=uppercase.next();
				System.out.println(upper.toUpperCase());
			}
			
			System.out.println("-----------------------------");
			System.out.println("lower case character");
			Iterator<String> lower = damsInStates.iterator();
			while(lower.hasNext())
			{
				String lowercase =lower.next();
				System.out.println(lowercase.toLowerCase());
			}
			System.out.println("-------------------------------");
			System.out.println("remove all element p :");
			Iterator<String> remove =damsInStates.iterator();
			while(remove.hasNext())
			{
				String delete = remove.next();
				if(delete.contains("p"))
				{
					System.out.println("remove dams of character p :"+ delete);
				}
			}
			System.out.println("================================================");
			System.out.println("data is palindrome or not");
			Iterator<String> palindrome =damsInStates.iterator();
			while(palindrome.hasNext())
			{
				String pal=palindrome.next();
				StringBuffer buf=new StringBuffer(pal);
				buf.reverse();
				String rev=buf.toString();
				if(pal.equalsIgnoreCase(rev))
				{
					System.err.println("palindrome"+rev);
				}
				else
				{
					System.out.println("It is not a palindrome");
				}
			}
		}
	}
	
	

}
