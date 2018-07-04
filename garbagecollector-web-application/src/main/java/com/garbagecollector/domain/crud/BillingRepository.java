package com.garbagecollector.domain.crud;

import org.springframework.data.repository.CrudRepository;

import com.garbagecollector.domain.entity.Billing;

public interface BillingRepository extends CrudRepository<Billing, Integer> {

}
