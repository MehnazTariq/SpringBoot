package io.springbootquickstart.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolesRepository extends CrudRepository<UserRole, Long> {

	@Query("select r.role from UserRole r, User u wher u.userName=?1 and r.userid=u.userId")
	public List<String> findRoleByUserName(String username);

}
