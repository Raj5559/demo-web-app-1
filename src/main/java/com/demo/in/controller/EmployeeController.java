package com.demo.in.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.in.entity.Employee;
import com.demo.in.service.EmployeeService;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Value("${my.header}")
	private String title;

	private EmployeeService eService;

	@Autowired
	public void seteService(EmployeeService eService) {
		this.eService = eService;
	}

	@ModelAttribute
	public void headerMessage(Model model) {
		model.addAttribute("title",title);
		model.addAttribute("dt",new Date());
	}
	
	
	
	@GetMapping(value = "/register")
	public ModelAndView saveEmployee() {
		ModelAndView mav = new ModelAndView("registration");

		return mav;

	}

	@PostMapping(value = "/register")
	public ModelAndView postSaveEmployee(@ModelAttribute Employee employee) {
		ModelAndView mav = new ModelAndView("registration");
		Employee savedEmployee = eService.saveEmployee(employee);
		mav.addObject("employeeId", savedEmployee.getEid());
		return mav;

	}
	
	
	@GetMapping(value = "/allEmployees")
	public ModelAndView getAllEmployees() {
		
		ModelAndView mav = new ModelAndView("allemployees");
		List<Employee> employees=eService.getAllEmployees();
		mav.addObject("employees", employees);
		return mav;
	}
	

}
