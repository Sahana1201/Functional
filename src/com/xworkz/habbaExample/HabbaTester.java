package com.xworkz.habbaExample;

import java.util.Collection;

import com.xworkz.habbaExample.dao.HabbaDAO;
import com.xworkz.habbaExample.dao.HabbaDAOImpl;
import com.xworkz.habbaExample.dto.HabbaDTO;
import com.xworkz.habbaExample_enum.Religion;

public class HabbaTester {

	public static void main(String[] args) {

		HabbaDTO habba = new HabbaDTO("Gowri-Ganesh", Religion.Hindu, "Sourth-india", 2, "Kadbu", true, true);
		HabbaDTO habba1 = new HabbaDTO("varmahalakshmi", Religion.Hindu, "SOuth-Karnataka", 1, "Obatu", true, true);
		HabbaDTO habba2 = new HabbaDTO("Christmas", Religion.Chirtian, "Everywhere", 15, "Cake", true, true);
		HabbaDTO habba3 = new HabbaDTO("Bakrid", Religion.Muslim, "Everywhere", 7, "Non-veg", true, true);

		HabbaDAO dao = new HabbaDAOImpl();
		dao.save(habba3);
		dao.save(habba);
		dao.save(habba1);
		dao.save(habba2);

		System.out.println("**********************************************************");

		HabbaDTO dtoFound = dao.ondunsHuduku((a) -> a.getSpcialFood().equals("Kadbu"));
		System.out.println(dtoFound);

		System.out.println("**********************************************************");
		Collection<HabbaDTO> coll = dao.yalavanuHuduku((b) -> b.getNoOfDays() > 1);

		for (HabbaDTO h1 : coll) {
			System.out.println(h1);
		}

	}
}