package www.xworkz.groceryexample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import www.xworkz.groceryexample.dao.GroceryDAO;
import www.xworkz.groceryexample.dao.GroceryDAOimpl;
import www.xworkz.groceryexample.dto.GroceryDTO;

public class GroceryTester {

	public static void main(String[] args) {

		GroceryDTO gt = new GroceryDTO("Biscuit", 45f, "Snacks", 1, true, "MariGold", "25/12/2021", "31/03/2015 ", true,
				true, "1245793451222");
		GroceryDTO gt1 = new GroceryDTO("Chocolate", 450.5f, "Snacks", 55, true, "Cadbury", "25/2/2021", "1/03/2015 ",
				true, true, "1245793331222");
		GroceryDTO gt2 = new GroceryDTO("Chocolate", 650.5f, "Snacks", 25, true, "Cadbury=Silk", "22/2/2021",
				"12/03/2015 ", true, true, "1245793331222");
		GroceryDTO gt3 = new GroceryDTO("ToorDal", 35f, "Pulse", 1, true, "Goodness", "25/2/2022", "1/03/2015 ", true,
				true, "1245793451222");
		GroceryDTO gt4 = new GroceryDTO("Bread", 25f, "Snacks", 1, true, "Bakery", "25/12/2021", "26/12/2021 ", true,
				true, "1245793451222");
		GroceryDTO gt5 = new GroceryDTO("oil", 175f, "Cooking oil", 1, true, "GoldWiner", "25/12/2021", "31/03/2015 ",
				true, true, "1245793451222");

		System.out.println("ALL DTO");
		GroceryDAO dao = new GroceryDAOimpl();
		dao.create(gt);
		dao.create(gt1);
		dao.create(gt2);
		dao.create(gt4);
		dao.create(gt3);
		dao.create(gt5);

		Collection<GroceryDTO> list = Arrays.asList(gt, gt1, gt2);

		System.out.println("**********************************************************");
		System.out.println("Find One");
		Optional<GroceryDTO> dtoFound = list.stream().filter(t -> t.getName().equals("Biscuit")).findFirst();
		if (dtoFound.isPresent()) {
			GroceryDTO opt = dtoFound.get();
			System.out.println("dto" + opt);
		} else {
			System.out.println("Grocery not found");
		}

		System.out.println("**********************************************************");
		System.out.println("Find All ");
		Collection<GroceryDTO> coll = dao.findAll((b) -> b.getName().equals("Chocolate"));
		for (GroceryDTO gro : coll) {
			System.out.println(gro);

		}
		System.out.println("**********************************************************");
		System.out.println("Find By Manufacturing Date");
		Optional<GroceryDTO> dtofound1 = list.stream().filter(q -> q.getManufactureDate().equals("1/03/2015 "))
				.findAny();
		if (dtofound1.isPresent()) {
			GroceryDTO opt1 = dtofound1.get();
			System.out.println(opt1);
		} else {
			System.out.println("Grocery not found");
		}

		System.out.println("**********************************************************");
		System.out.println("Find By Max Quantity");
		System.out.println(dao.findbyMaxQuantity());

		System.out.println("**********************************************************");
		System.out.println("Find By Expiry date ");
		Optional<GroceryDTO> dtofound2 = list.stream().filter(q -> q.getExpireDate().equals("22/2/2021")).findAny();
		if (dtofound1.isPresent()) {
			GroceryDTO opt1 = dtofound2.get();
			System.out.println(opt1);
		} else {
			System.out.println("Grocery not found");
		}
	}

}
