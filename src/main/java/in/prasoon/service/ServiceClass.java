package in.prasoon.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.prasoon.bo.CustomerBo;
import in.prasoon.bo.ManagerBo;
import in.prasoon.bo.ProjectBo;
import in.prasoon.repository.CustomerRepository;
import in.prasoon.repository.ManagerRepository;
import in.prasoon.repository.ProjectRepository;
import in.prasoon.vo.ProjectVo;

@Service
public class ServiceClass
{
	@Autowired
	ProjectRepository projectRepository;
	@Autowired
	ManagerRepository managerRepository;
	@Autowired
	CustomerRepository customerRepository;

	public List<CustomerBo> findAllCustomer()
	{

		return customerRepository.findAll();

	}
	public List<ManagerBo> findAllManager() {

		return managerRepository.findAll();
	}
	/*
	 * public Boolean save(ProjectVo projectVo) { ProjectBo projectBo = new
	 * ProjectBo(); CustomerBo customerBo = new CustomerBo(); ManagerBo managerBo =
	 * new ManagerBo();
	 * 
	 * try { org.apache.commons.beanutils.BeanUtils.copyProperties(projectBo,
	 * projectVo); org.apache.commons.beanutils.BeanUtils.copyProperties(managerBo,
	 * projectVo.getManagerVo());
	 * 
	 * org.apache.commons.beanutils.BeanUtils.copyProperties(customerBo,
	 * projectVo.getCustomerVo());
	 * 
	 * } catch (IllegalAccessException | InvocationTargetException e) {
	 * 
	 * e.printStackTrace(); } projectBo.setCustomerBo(customerBo);
	 * projectBo.setManagerBo(managerBo); projectRepository.save(projectBo); return
	 * true; }
	 */
	
	public void save(ProjectVo projectVo) {
		
		ProjectBo projectBo = new ProjectBo();
		CustomerBo customerBo = new CustomerBo();
		ManagerBo managerBo = new ManagerBo();
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(projectBo,projectVo);
			org.apache.commons.beanutils.BeanUtils.copyProperties(customerBo, projectVo.getCustomerVo());
			org.apache.commons.beanutils.BeanUtils.copyProperties(managerBo, projectVo.getManagerVo());
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		projectBo.setManagerBo(managerBo);
		projectBo.setCustomerBo(customerBo);
		projectRepository.save(projectBo);
		
	}
}
