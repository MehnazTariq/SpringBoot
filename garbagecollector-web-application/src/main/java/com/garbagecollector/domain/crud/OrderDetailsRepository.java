package com.garbagecollector.domain.crud;

import org.springframework.data.repository.CrudRepository;

import com.garbagecollector.domain.entity.OrderDetails;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Integer> {

}
