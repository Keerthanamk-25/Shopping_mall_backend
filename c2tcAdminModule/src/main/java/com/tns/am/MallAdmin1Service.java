package com.tns.am;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service       // used to add business functionality
@Transactional   // transaction from service end
public  class MallAdmin1Service {
	
	@Autowired
	private MallRepository repository;
	
	//Retrievel
	public List <MallAdmin> ListAll(){
		return repository.findAll();
		
	}
	public MallAdmin get(Integer id) {
		return repository.findById(id).get();
	}
	

	public void save( MallAdmin malladmin) {
	repository.save(malladmin);
}

	public void delete( Integer id) {
	repository.deleteById(id);


}
}
