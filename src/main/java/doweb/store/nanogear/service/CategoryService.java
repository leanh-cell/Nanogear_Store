package doweb.store.nanogear.service;
import java.util.List;

import doweb.store.nanogear.entity.Category;

public interface CategoryService {
	
	List<Category> getAllCategory();
	
	void saveCategory(Category category);
	
	Category findById(int id);
}
