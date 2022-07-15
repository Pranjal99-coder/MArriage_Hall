package Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String gender;
	
	@OneToMany(targetEntity = Booking.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "cb_fk",referencedColumnName = "id" )
	private List<Booking> booking;

}
