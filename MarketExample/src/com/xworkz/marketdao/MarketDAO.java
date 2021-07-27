package com.xworkz.marketdao;

import java.util.Collection;

import com.xworkz.marketdto.MarketDTO;

public interface MarketDAO {

	MarketDTO findby( Marketsearch marketSearch);
	Collection<MarketDTO> findAll(Marketsearch search);
}
