package in.prasoon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.prasoon.bo.CustomerBo;

public interface CustomerRepository extends JpaRepository<CustomerBo, Integer>{

}
