package com.xworkz.java.boot;

public class ForestRunner {

	public static void main(String[] args)
	{
		System.out.println("Entering to the main methods");
		String[] primaryAnimals={"Beer","tiger","Lion","Girafe","Deer","Chitha"};
		String[] locations= {"Bangalore","Chamarajangar"};
		String[] birds= {"Crows","Owel","Parrots"};
		String[] trees= {"Pinus pinaster","Picea abies","Eucalyptus spp"};
		boolean[] rainForest= {true,false};
		
		Forest kaadu=new Forest("Amazon",6000,"National","South America",primaryAnimals,locations,birds,trees,rainForest);
		kaadu.display();
	}

}
