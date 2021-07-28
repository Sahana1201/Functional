package www.xworkz.rogiexample.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import www.xworkz.rogiexample.dto.RogiDTO;
import www.xworkz.rogiexample.search.RogiSearch;

public class RogiDAOimpl implements RogiDAO {

	private List<RogiDTO> collection = new ArrayList<RogiDTO>();

	@Override
	public boolean save(RogiDTO dto) {
		boolean add = collection.add(dto);
		System.out.println(dto);

		return add;
	}

	@Override
	public Optional<RogiDTO> findone(RogiSearch search) {
		Iterator<RogiDTO> iterator = this.collection.iterator();
		Optional<RogiDTO> value = Optional.empty();

		while (iterator.hasNext()) {
			RogiDTO rogidto = iterator.next();

			if (search.huduku(rogidto))
				;

			{
				value = Optional.of(rogidto);

			}
		}

		return value;

	}

	@Override
	public Optional<Integer> totalSize() {
		Optional<Integer> value = Optional.of(collection.size());

		return value;

	}

	@Override
	public Optional<RogiDTO> findByMaxAge() {

		Optional<RogiDTO> opt = Optional.of(Collections.max(collection));
		return opt;
	}

	@Override
	public Collection<RogiDTO> findAll(RogiSearch search) {
		Iterator<RogiDTO> itr = this.collection.iterator();
		Collection<RogiDTO> temp = new ArrayList<RogiDTO>();
		while (itr.hasNext()) {
			RogiDTO rogiDTO = itr.next();
			if (search.huduku(rogiDTO)) {
				temp.add(rogiDTO);
			}
		}
		return temp;
	}

	@Override
	public Optional<RogiDTO> findByMinAge() {

		Optional<RogiDTO> opt = Optional.of(Collections.min(collection));
		return opt;
	}

}
