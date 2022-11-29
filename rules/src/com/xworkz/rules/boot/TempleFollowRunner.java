package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.TempleRuleFollow;

public class TempleFollowRunner {

	public static void main(String[] args) 
	{
		TempleRuleFollow rule=new TempleRuleFollow();
		rule.nameOfTemple();
		rule.locationOfTemple();
		rule.nameOfTemple();
		rule.rulesOfTemple();
		rule.openOrNot();
	}

}
