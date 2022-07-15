package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Entity.Customer;
import dto.OrderResponse;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	
	@Query("SELECT new dto.OrderResponse (c.name, p.bookingName) FROM customer c JOIN c.booking p")
	public List<OrderResponse> getJoinInformation();

}
