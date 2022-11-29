package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.TrainRulesFollow;

public class PassengerRunner {

	public static void main(String[] args) 
	{
		TrainRulesFollow train=new TrainRulesFollow();
		train.nameOfTrain();
		train.goingToLocation();
		train.trainTicketPrice();
		train.rulesOfTrain();
		train.chargerPlug();
	}

}
