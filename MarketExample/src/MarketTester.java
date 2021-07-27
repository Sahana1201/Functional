import java.util.Collection;

import com.xworkz.marketdao.MarketDAO;
import com.xworkz.marketdao.MarketDAOimpl;
import com.xworkz.marketdto.MarketDTO;

public class MarketTester {

	public static void main(String[] args) {
MarketDAO dao = new  MarketDAOimpl();
		
		MarketDTO name = dao.findby((a)->a.getName().equals("D-Mart"));
		System.out.println(name);
		
		System.out.println("******");
		Collection<MarketDTO> coll = dao.findAll((b)->b.getNoOfShops()>2);
		for (MarketDTO market : coll) {
			System.out.println(market);

	}

}
}
