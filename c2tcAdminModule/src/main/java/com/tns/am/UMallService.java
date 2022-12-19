package com.tns.am;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UMallService {
	@Autowired
	private UMallRepository repository;
	
	//Retrievel
	public List<UMall> ListAll(){
		return repository.findAll();
		
	}
	public UMall get(Integer id) {
		return repository.findById(id).get();
	}
	
	public void save( UMall umall) {
	repository.save(umall);
	}

	public void delete( Integer id) {
	repository.deleteById(id);


}

}
