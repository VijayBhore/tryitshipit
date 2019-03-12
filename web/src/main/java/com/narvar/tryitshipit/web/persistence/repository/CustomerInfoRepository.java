package com.narvar.tryitshipit.web.persistence.repository;

import com.narvar.tryitshipit.web.persistence.dao.CustomerInfoDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerInfoRepository extends CrudRepository<CustomerInfoDAO, Integer> {
}
