package com.xworkz.habbaExample.dto;

import java.io.Serializable;

import com.xworkz.habbaExample_enum.Religion;

public class HabbaDTO implements Serializable{
	
	private String name;
	private Religion religion;
	private String region ;
	private int noOfDays;
	private String spcialFood;
	private boolean shouldBath;
	private boolean wakeupEarly;
	public HabbaDTO() {
		super();
	}
	public HabbaDTO(String name, Religion religion, String region, int noOfDays, String spcialFood, boolean shouldBath,
			boolean wakeupEarly) {
		super();
		this.name = name;
		this.religion = religion;
		this.region = region;
		this.noOfDays = noOfDays;
		this.spcialFood = spcialFood;
		this.shouldBath = shouldBath;
		this.wakeupEarly = wakeupEarly;
	}
	@Override
	public String toString() {
		return "HabbaDTO [name=" + name + ", religion=" + religion + ", region=" + region + ", noOfDays=" + noOfDays
				+ ", spcialFood=" + spcialFood + ", shouldBath=" + shouldBath + ", wakeupEarly=" + wakeupEarly + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Religion getReligion() {
		return religion;
	}
	public void setReligion(Religion religion) {
		this.religion = religion;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getSpcialFood() {
		return spcialFood;
	}
	public void setSpcialFood(String spcialFood) {
		this.spcialFood = spcialFood;
	}
	public boolean isShouldBath() {
		return shouldBath;
	}
	public void setShouldBath(boolean shouldBath) {
		this.shouldBath = shouldBath;
	}
	public boolean isWakeupEarly() {
		return wakeupEarly;
	}
	public void setWakeupEarly(boolean wakeupEarly) {
		this.wakeupEarly = wakeupEarly;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfDays;
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((religion == null) ? 0 : religion.hashCode());
		result = prime * result + (shouldBath ? 1231 : 1237);
		result = prime * result + ((spcialFood == null) ? 0 : spcialFood.hashCode());
		result = prime * result + (wakeupEarly ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HabbaDTO other = (HabbaDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfDays != other.noOfDays)
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (religion != other.religion)
			return false;
		if (shouldBath != other.shouldBath)
			return false;
		if (spcialFood == null) {
			if (other.spcialFood != null)
				return false;
		} else if (!spcialFood.equals(other.spcialFood))
			return false;
		if (wakeupEarly != other.wakeupEarly)
			return false;
		return true;
	}
	
	

}
