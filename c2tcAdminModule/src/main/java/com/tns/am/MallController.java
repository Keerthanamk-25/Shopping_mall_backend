package com.tns.am;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController   //Used to map request data
public class MallController{
	@Autowired    // inject object dependency implicitly
	private MallAdmin1Service service;
	
	//Retrivel
	@GetMapping("/malladmin")       //otp process,maps Https request to specific method
	public List<MallAdmin> ListAll(){
		return service.ListAll();
		
		
	}
	//retrivel by id
	@GetMapping("/malladmin/{id}")
	public ResponseEntity  < MallAdmin> get(@PathVariable Integer id){    //to check the path availability
		try {
			MallAdmin malladmin= service.get(id);
			
			return new ResponseEntity <MallAdmin>(malladmin,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity <MallAdmin>(HttpStatus.NOT_FOUND);

		}
	}
	//create
	@PostMapping("/malladmin")    //to save new data to DB
	public void add(@RequestBody MallAdmin malladmin ) {    //maps http request to transfer
		service.save(malladmin);
	}
	
	//update
	@PutMapping("/malladmin/{id}")  //update/modify the data
	public ResponseEntity <?> update(@RequestBody MallAdmin malladmin,@PathVariable Integer id){
	try {
		MallAdmin existMallAdmin = service.get(id);
		service.save(malladmin);
		return new ResponseEntity <> (HttpStatus.OK);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		return new ResponseEntity <> (HttpStatus.NOT_FOUND);

	}
}
	
	//delete
	@DeleteMapping("/malladmin/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
