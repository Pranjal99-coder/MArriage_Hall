package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Booking;

public interface BookingRepository extends JpaRepository<Booking,Integer> {

}
