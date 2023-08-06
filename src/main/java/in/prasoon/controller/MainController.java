package in.prasoon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.prasoon.bo.CustomerBo;
import in.prasoon.bo.ManagerBo;
import in.prasoon.bo.ProjectBo;
import in.prasoon.service.ServiceClass;
import in.prasoon.vo.ProjectVo;


@Controller
public class MainController
{
	@Autowired
	ServiceClass serviceClass;
	
	@GetMapping("/")
	private String welcomePage(Model model)
	{
		return "index";
	}
	@GetMapping("/addProject")
	public String addProject(Model model)
	{
		ProjectBo projectBo = new ProjectBo();
		List<CustomerBo> customerList=serviceClass.findAllCustomer();
		List<ManagerBo> managerList=serviceClass.findAllManager();
		
		model.addAttribute("customers", customerList);
		model.addAttribute("managers", managerList);
		model.addAttribute("project", projectBo);
		return "addProject";
	}
	@PostMapping("/saveProject")
	@ResponseBody
	public String saveProject(ProjectVo projectVo,Model model)
	{
		System.out.println("-----------======"+projectVo);
		serviceClass.save(projectVo);
		
		/*
		 * Boolean save = serviceClass.save(projectVo); if(save==true) {
		 * model.addAttribute("message", "successfully save"); } else {
		 * model.addAttribute("error", "not saved"); }
		 */
		return "success";
	}
}
