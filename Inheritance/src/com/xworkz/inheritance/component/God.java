package com.xworkz.inheritance.component;

public class God 
{
	private String name;
	private String gender;
	private String weapon;
	private String mainPower;
	private String usage;
	private double weight;
	
	public God()
	{
		System.out.println("details of god");
	}

	public God(String name, String gender, String weapon, String mainPower, String usage, double weight) {
		super();
		this.name = name;
		this.gender = gender;
		this.weapon = weapon;
		this.mainPower = mainPower;
		this.usage = usage;
		this.weight = weight;
	}
	@Override
	public boolean equals(Object other)
	{
		if(other instanceof God)
		{
			God god=(God)other;
			if(this.gender.equals(god.gender) && this.name.equals(god.name) && this.mainPower.equals(god.mainPower)
				this.usage.equals(god.usage) && this.weapon.equals(god.weapon))
					{
						System.out.println("god weapons are strong");
						return true;
					}
			else
			{
				System.out.println("It is not a god");
			}
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "God [name=" + name + ", gender=" + gender + ", weapon=" + weapon + ", mainPower=" + mainPower + ", use="
				+ use + ", weight=" + weight + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getMainPower() {
		return mainPower;
	}

	public void setMainPower(String mainPower) {
		this.mainPower = mainPower;
	}

	public String getUsage() {
		return usage;
	}

	public void setUse(String usage) {
		this.usage = usage;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
}
