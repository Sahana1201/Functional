package com.xworkz.fishdto;

public class FishDTO {

	String name;
	String colour;
	String type;
	String lifeSpanInYears;
	String cost;
	String gender;

	public FishDTO() {
		super();
	}

	public FishDTO(String name, String colour, String type, String lifeSpan, String cost, String gender) {
		super();
		this.name = name;
		this.colour = colour;
		this.type = type;
		this.lifeSpanInYears = lifeSpan;
		this.cost = cost;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLifeSpan() {
		return lifeSpanInYears;
	}

	public void setLifeSpan(String lifeSpan) {
		this.lifeSpanInYears = lifeSpan;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		return 455;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FishDTO other = (FishDTO) obj;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (cost != other.cost)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (lifeSpanInYears != other.lifeSpanInYears)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FishDTO [name=" + name + ", colour=" + colour + ", type=" + type + ", lifeSpan=" + lifeSpanInYears
				+ ", cost=" + cost + ", gender=" + gender + "]";
	}

}
