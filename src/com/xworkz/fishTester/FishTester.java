package com.xworkz.fishTester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.xworkz.fishdto.FishDTO;

public class FishTester {

	public static void main(String[] args) {

		FishDTO dto = new FishDTO("GoldFish", "GolidhOrange", "Oranda", "3years", "385", "Male");
		FishDTO dto1 = new FishDTO("Cat Fish", "Olive Brown", "Channel fish", "14years", "1000", "Female");

		List<FishDTO> coll = new ArrayList<FishDTO>();
		coll.add(dto1);
		coll.add(dto);

		Comparator<FishDTO> fishName = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("     ");
				System.out.println("Name Sorting in Ascending order");
				return o1.getName().compareTo(o2.getName());
			}
		};

		Collections.sort(coll, fishName);

		Iterator<FishDTO> itr = coll.iterator();
		while (itr.hasNext()) {
			FishDTO fishdto = (FishDTO) itr.next();
			System.out.println(fishdto.getName());
		}

		Comparator<FishDTO> fishNameDesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("     ");
				System.out.println("Name sorting in Deseding order");

				return o2.getName().compareTo(o1.getName());
			}

		};

		Collections.sort(coll, fishNameDesc);

		Iterator<FishDTO> itr1 = coll.iterator();
		while (itr1.hasNext()) {
			FishDTO fishdto = (FishDTO) itr1.next();
			System.out.println(fishdto.getName());
		}

		Comparator<FishDTO> fishColour = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("     ");
				System.out.println("Colour sorting ");

				return o1.getColour().compareTo(o2.getColour());
			}

		};

		Collections.sort(coll, fishColour);

		Iterator<FishDTO> itr2 = coll.iterator();
		while (itr2.hasNext()) {
			FishDTO fishdto = (FishDTO) itr2.next();
			System.out.println(fishdto.getColour());
		}

		Comparator<FishDTO> lifeSpan = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("     ");
				System.out.println("Lifespan Desending");

				return o1.getLifeSpan().compareTo(o2.getLifeSpan());
			}
		};

		Collections.sort(coll, lifeSpan);

		Iterator<FishDTO> itr3 = coll.iterator();
		while (itr3.hasNext()) {
			FishDTO fishdto = (FishDTO) itr3.next();
			System.out.println(fishdto.getLifeSpan());
		}

		Comparator<FishDTO> fishlife = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("     ");
				System.out.println("LifeSpan Asending");

				return o2.getLifeSpan().compareTo(o1.getLifeSpan());
			}

		};

		Collections.sort(coll, fishlife);

		Iterator<FishDTO> itr4 = coll.iterator();
		while (itr4.hasNext()) {
			FishDTO fishdto = (FishDTO) itr4.next();
			System.out.println(fishdto.getLifeSpan());
		}

		Comparator<FishDTO> cost = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("     ");
				System.out.println("cost Desending");

				return o1.getCost().compareTo(o2.getCost());
			}

		};

		Collections.sort(coll, cost);

		Iterator<FishDTO> itr5 = coll.iterator();
		while (itr5.hasNext()) {
			FishDTO fishdto = (FishDTO) itr5.next();
			System.out.println(fishdto.getCost());
		}

	}

}
