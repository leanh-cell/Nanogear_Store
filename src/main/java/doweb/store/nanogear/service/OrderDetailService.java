package doweb.store.nanogear.service;
import java.util.List;

import doweb.store.nanogear.dto.OrderDetailDTO;
import doweb.store.nanogear.dto.RevenueByCategory;
import doweb.store.nanogear.dto.Top10;


public interface OrderDetailService {
	
	List<OrderDetailDTO> findByOrderDetailIdOrder(long idOrder);
	
	List<RevenueByCategory> RevenueByCategory();
	
	List<Top10> findAllProductTop10();
	
}
