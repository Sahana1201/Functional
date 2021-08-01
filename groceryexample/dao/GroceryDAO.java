package www.xworkz.groceryexample.dao;

import java.util.Collection;

import java.util.Optional;

import www.xworkz.groceryexample.dto.GroceryDTO;
import www.xworkz.groceryexample.search.GrocerySearch;

public interface GroceryDAO {

	boolean create(GroceryDTO dto);

	Optional<GroceryDTO> findone(String name);

	Collection<GroceryDTO> findAll(GrocerySearch search);

	Optional<GroceryDTO> findbyMaxQuantity();

	Optional<GroceryDTO> findbyManufacturingDate(String date);

	Optional<GroceryDTO> findAllByExpiredDate(String date);

}
