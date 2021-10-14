package com.dealer.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dealer.model.Dealer;

@RestController
public class DealerController {

	@Autowired
	RestTemplate restTemplate = new RestTemplate();
	
	@Autowired
	DealerService dealerService = new DealerService();
	
	@RequestMapping("/getall")
	public List<Dealer> getAll(){
		return dealerService.getAll();
	}
	
	@GetMapping("/finddealer/{id}")
	public Optional<Dealer> getfarmer(@PathVariable String id) {
		return dealerService.findById(id);
	}
	
	@PostMapping("/add-dealer")
	public String addfarmer(@RequestBody Dealer dealer) {
		return dealerService.addDealer(dealer);
	}
	
	@DeleteMapping("delete/{id}")
	String deleteDealer(@PathVariable String id) {
		return dealerService.deleteDealer(id);
	}
	
	@RequestMapping("/get/{dealerUsername}")
	public Dealer getUsers(@PathVariable String dealerUsername) {
		return dealerService.getByUsername(dealerUsername);
	}
	
	@PostMapping("/update/{id}")
	public String update(@PathVariable String id , @RequestBody Dealer dealer) {
		dealer.setId(id);
		return dealerService.update(dealer);
	}
	
	
	@RequestMapping("/call")
	public String call() {
		
		return restTemplate.getForObject("http://farmer-app/getall", String.class).toString();
				
//		return "hi iam hard coded";
	}
	
	
	
	
	
	
	
}
