package spring.mvc.bms.dao;

import java.util.Map;

public interface GuestDao {
	public int purchaseBook(Map<String, String> map);
	public int refundBook(String order_code);
	
}
