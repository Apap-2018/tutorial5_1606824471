package com.apap.tutorial5.service;

import java.util.List;
import java.util.Optional;

import com.apap.tutorial5.model.DealerModel;

/*
 * DealerService
 */
public interface DealerService {
	Optional<DealerModel> getDealerDetailById(Long id);
	
	void addDealer(DealerModel dealer);
	public List<DealerModel> findAll();
	void deleteDealer(Long idDealer);
	void updateDealer(Long idDealer, DealerModel dealer);
}
