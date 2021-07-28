package www.xworkz.rogiexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import www.xworkz.rogiexample.dao.RogiDAO;
import www.xworkz.rogiexample.dao.RogiDAOimpl;
import www.xworkz.rogiexample.dto.RogiDTO;

public class RogiTester {

	public static void main(String[] args) {

		Collection<RogiDTO> collection = new ArrayList<RogiDTO>();

		RogiDTO dto = new RogiDTO(1, "Teju", 21, "Cough", true);
		RogiDTO dto1 = new RogiDTO(2, "Sahana", 25, "Cold", true);
		RogiDTO dto2 = new RogiDTO(3, "Priya", 24, "Fever", true);
		RogiDTO dto3 = new RogiDTO(2, "Sahana", 20, "Cold", true);

		RogiDAO dao = new RogiDAOimpl();

		dao.save(dto2);
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto3);

		System.out.println("**********************************************************");
		Optional<RogiDTO> dtoFound = dao.findone((a) -> a.getName().equals("Sahana"));
		if (dtoFound.isPresent()) {
			RogiDTO opt = dtoFound.get();
			System.out.println("dto" + opt);
		} else {
			System.out.println("Rogi not found");
		}

		System.out.println("**********************************************************");

		System.out.println(dao.totalSize());

		System.out.println("**********************************************************");
		Collection<RogiDTO> coll = dao.findAll((b) -> b.getName().equals("Sahana"));
		for (RogiDTO rogi : coll) {
			System.out.println(rogi);

		}
		System.out.println("**********************************************************");
		System.out.println("Max Age" + dao.findByMaxAge());
		System.out.println("**********************************************************");
		System.out.println("Min Age" + dao.findByMinAge());

	}
}
