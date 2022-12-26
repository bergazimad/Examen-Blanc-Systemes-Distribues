package ma.enset.infractionservice.infractionQuery.repositories;


import ma.enset.infractionservice.infractionQuery.entities.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfractionRepository extends JpaRepository<Infraction,String> {

}
