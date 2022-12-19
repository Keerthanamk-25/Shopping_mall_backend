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

@RestController
public class UMallController {

	@Autowired

	private UMallService service;
	
	//Retrivel
	@GetMapping("/mall")
	public List<UMall> ListAll(){
		return service.ListAll();
		
		
	}
	//retrivel by id
	@GetMapping("/mall/{id}")
	public ResponseEntity  < UMall> get(@PathVariable Integer id){
		try {
			UMall umall= service.get(id);
			
			return new ResponseEntity <UMall>(umall,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity <UMall>(HttpStatus.NOT_FOUND);
		}
	}
	//create
	@PostMapping("/mall")
	public void add(@RequestBody UMall umall ) {
		service.save(umall);
	}
	
	//update
	@PutMapping("/mall/{id}")
	public ResponseEntity <?> update(@RequestBody UMall umall,@PathVariable Integer id){
	try {
		UMall existUMall = service.get(id);
		service.save(umall);
		return new ResponseEntity <> (HttpStatus.OK);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		return new ResponseEntity <> (HttpStatus.NOT_FOUND);

	}
}
	
	//delete
	@DeleteMapping("/mall/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
