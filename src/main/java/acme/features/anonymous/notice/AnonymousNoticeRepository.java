
package acme.features.anonymous.notice;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.Notices;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousNoticeRepository extends AbstractRepository {

	@Query("select n from Notices n where n.id = ?1")
	Notices findOneById(int id);

	@Query("select n from Notices n")
	Collection<Notices> findManyAll();

}
