package Controller;

import java.util.List;

import javax.management.loading.ClassLoaderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Entity.Customer;
import Repository.BookingRepository;
import Repository.CustomerRepository;
import dto.BookingRequest;
import dto.OrderResponse;

@RestController
public class BookingController {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@PostMapping("/placeorder")
	public Customer placeOrder(@RequestBody BookingRequest request) {
		return customerRepository.save(request.getCustomer());
		
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders(){
		return customerRepository.findAll();
		
	}
	
	@GetMapping("/getInfo")
	public List<OrderResponse> getJoinInformation(){
		return customerRepository.getJoinInformation();
		
	}

}
