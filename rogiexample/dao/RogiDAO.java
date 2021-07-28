package www.xworkz.rogiexample.dao;

import java.util.Collection;
import java.util.Optional;

import www.xworkz.rogiexample.dto.RogiDTO;
import www.xworkz.rogiexample.search.RogiSearch;

public interface RogiDAO {

	boolean save(RogiDTO dto);

	Optional<RogiDTO> findone(RogiSearch search);

	Optional<Integer> totalSize();

	Optional<RogiDTO> findByMaxAge();

	Optional<RogiDTO> findByMinAge();

	Collection<RogiDTO> findAll(RogiSearch search);

}
