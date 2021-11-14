package com.zaahid.employee.controller;

import java.util.List;

import com.zaahid.employee.model.Employee;
import com.zaahid.employee.services.EmployeeServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Autowired
    EmployeeServices services;

    @RequestMapping("/")
    public String ViewHomePage(Model model){

        List<Employee> listEmployee = services.listAll();
        model.addAttribute("listEmployee",listEmployee);
        return "index";

    }

    @RequestMapping("/new")
    public String newEmployeePage(Model model){

        Employee employee = new Employee();
        model.addAttribute(employee);
        return "new_employee";
    }

    @RequestMapping(value = "/save", method =RequestMethod.POST)
    public String saveEmployee(@ModelAttribute Employee employee){
        services.save(employee);
        return "redirect:/";
    }

    @RequestMapping("edit/{sid}")
    public ModelAndView showEditEmployeePage(@PathVariable (name="sid") Long sid){
        ModelAndView mav=new ModelAndView("edit_employee");
        Employee employee=services.get(sid);
        mav.addObject("employee", employee);
        return mav;
    }

    @RequestMapping("/delete/{sid}")
	public String deleteEmployeePage(@PathVariable (name="sid") Long sid) {
		services.delete(sid);
		return "redirect:/";
	}

}

