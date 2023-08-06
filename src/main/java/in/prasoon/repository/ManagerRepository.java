package in.prasoon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.prasoon.bo.ManagerBo;

public interface ManagerRepository extends JpaRepository<ManagerBo, Integer>
{

}
