package pt.amane.integrations.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.amane.integrations.detos.EmailDTO;

@RestController
@RequestMapping(value = "/emails")
public class EmailResource {

//	@Autowired 
//	private 
	
	@PostMapping
	public ResponseEntity<Void> send(@RequestBody EmailDTO dto){
		return ResponseEntity.noContent().build();
	}
	
}
