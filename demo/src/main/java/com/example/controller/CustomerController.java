package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Customer;
import com.example.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
/*	@RequestMapping(value={ "/displaycustomer"}, method = RequestMethod.GET)
	public ModelAndView displaycustomer(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displaycustomer");
		return modelAndView;
	}*/
	  @RequestMapping(value = {"/admin/displaycustomer"}, method = RequestMethod.GET)
	   public ModelAndView displaycustomer(Model model) {
	 
		  ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("displaycustomer");
			return modelAndView;
	   }
	/*@RequestMapping(value="/savecustomer", method = RequestMethod.GET)
	public ModelAndView savecustomer(){
		ModelAndView modelAndView = new ModelAndView();
		Customer customer = new Customer();
		modelAndView.addObject("customer", customer);
		modelAndView.setViewName("savecustomer");
		return modelAndView;
	}
	
	@RequestMapping(value = "/savecustomer", method = RequestMethod.POST)
	public ModelAndView createNewCustomer(@Valid Customer customer, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		Customer customerExists = customerService.findCustomerByName(customer.getName());
		if (customerExists != null) {
			bindingResult
					.rejectValue("name", "error.cutomer",
							"There is already a customer present with the name provided");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("savecustomer");
		} else {
			customerService.saveCustomer(customer);
			modelAndView.addObject("successMessage", "Customer has been add successfully");
			modelAndView.addObject("customer", new Customer());
			modelAndView.setViewName("savecustomer");
			
		}
		return modelAndView;
	}
	*/
}
