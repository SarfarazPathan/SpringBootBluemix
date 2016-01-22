package apples.bluemix.ctp.spring.repositories;

import apples.bluemix.ctp.spring.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long>
{
}
