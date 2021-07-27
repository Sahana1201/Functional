package com.xworkz.marketdao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.marketdto.MarketDTO;

public class MarketDAOimpl implements MarketDAO {

	private Collection<MarketDTO> collection = new ArrayList<MarketDTO>();

	public MarketDAOimpl() {

		MarketDTO marketdto = new MarketDTO("Malleshwarum Market", "Malleshwarum", 12, "Vegetable Market");
		MarketDTO marketdto1 = new MarketDTO("Malleshwarum Market", "Malleshwarum", 22, "Cloth Market");
		MarketDTO marketdto2 = new MarketDTO("KR Market", "KR purum", 10, "Fruits");
		MarketDTO marketdto3 = new MarketDTO("Sunday Market", "Arcot Srinivas cross st", 15, "All Type Market");

		this.collection.add(marketdto3);
		this.collection.add(marketdto2);
		this.collection.add(marketdto1);
		this.collection.add(marketdto);

	}

	@Override
	public MarketDTO findby(Marketsearch marketSearch) {

		Iterator<MarketDTO> iterator = this.collection.iterator();
		MarketDTO temp = null;
		while (iterator.hasNext()) {
			MarketDTO marketdto = iterator.next();
			if (marketSearch.test(marketdto));			{
				temp = marketdto;
				break;
			}
		}

		return temp;
	}
	
	@Override
	public Collection<MarketDTO> findAll(Marketsearch search) {
		Iterator<MarketDTO> itr = this.collection.iterator();
		Collection<MarketDTO> temp = new ArrayList<MarketDTO>();
		while(itr.hasNext()) {
			MarketDTO marketDTO = itr.next();
			if(search.test(marketDTO)) {
				temp.add(marketDTO);
			}
		}
		return temp;
	}

}
