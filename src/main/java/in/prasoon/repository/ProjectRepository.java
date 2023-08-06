package in.prasoon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.prasoon.bo.ProjectBo;

public interface ProjectRepository extends JpaRepository<ProjectBo, Integer>  {

}
