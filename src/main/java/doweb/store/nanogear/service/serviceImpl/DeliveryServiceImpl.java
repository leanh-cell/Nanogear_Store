package doweb.store.nanogear.service.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import doweb.store.nanogear.entity.DeliveryAddress;
import doweb.store.nanogear.repository.DeliveryAddressRepository;
import doweb.store.nanogear.service.DeliveryAddressService;


@Service
public class DeliveryServiceImpl implements DeliveryAddressService{

	@Autowired
	DeliveryAddressRepository deliveryAddressRepository;

	@Override
	public DeliveryAddress findByIdDeliveryAddress(String idUser) {
		return deliveryAddressRepository.findByIdDeliveryAddress(idUser);
	}
	
}
