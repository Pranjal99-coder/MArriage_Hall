package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Booking {
	@Id
	private int venue_id;
	private String venue;
	private int seats_available;
	private String dining;
	private String music;
	private int price;
	

}
