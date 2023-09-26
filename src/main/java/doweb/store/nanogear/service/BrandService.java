package doweb.store.nanogear.service;
import java.util.List;

import doweb.store.nanogear.dto.BrandDTO;
import doweb.store.nanogear.entity.Brand;


public interface BrandService {
	
	List<BrandDTO> findBrandByCategory(int idCategory);
	
	List<Brand> findAllBrand();
	
	Brand saveBrand(Brand brand);
	
	Brand findById(int idBrand);
}
