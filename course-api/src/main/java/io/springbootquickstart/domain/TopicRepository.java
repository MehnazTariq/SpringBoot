package io.springbootquickstart.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional

public interface TopicRepository extends CrudRepository<Topic, String> {

}
