package doweb.store.nanogear.service.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import doweb.store.nanogear.dto.BrandDTO;
import doweb.store.nanogear.entity.Brand;
import doweb.store.nanogear.repository.BrandRepository;
import doweb.store.nanogear.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	BrandRepository brandRepository;
	
	@Override
	public List<BrandDTO> findBrandByCategory(int idCategory) {
		return brandRepository.findBrandByCategory(idCategory);
	}

	@Override
	public List<Brand> findAllBrand() {
		return brandRepository.findAll();
	}

	@Override
	public Brand saveBrand(Brand brand) {
		return brandRepository.save(brand);
	}

	@Override
	public Brand findById(int idBrand) {
		return brandRepository.findById(idBrand).get();
	}

}
