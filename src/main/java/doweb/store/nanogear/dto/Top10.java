package doweb.store.nanogear.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import doweb.store.nanogear.entity.Product;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Top10 implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	Product product;
	long sum;
}
