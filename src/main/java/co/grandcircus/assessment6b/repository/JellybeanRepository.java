package co.grandcircus.assessment6b.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.assessment6b.model.Jellybean;

public interface JellybeanRepository extends JpaRepository<Jellybean, Long>  {

}
