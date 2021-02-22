package com.hcl.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Account;
import com.hcl.service.AccountService;



@Controller
public class AccountController {
	private AccountService accountService;

	@Autowired(required = true)
	public void setUserService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	
	//loginpage
			@RequestMapping("/index")
			public ModelAndView loginpage() {
				ModelAndView model = new ModelAndView();
				model.setViewName("login");// jsp page
				return model;
			}
			@RequestMapping(value = "/login", method = {RequestMethod.POST,RequestMethod.GET})
			public String loginUser(@Valid @ModelAttribute("account") Account account, BindingResult result) {
				System.out.println("the user name is: "+account.getName());
				boolean checkBank = accountService.bank(account.getName());
				if (checkBank == true) {
					System.out.println("Correct Login credentials, redirected to welcome page");
					String name = account.getName();
		         //   return new ModelAndView("welcome", "username", username);

					return "redirect:/bankList"; // jsp
					
				} else {
						System.out.println("Incorrect Banker");
			         //   return new ModelAndView("welcome", "username", username);

						return "redirect:/login";
					}
			}

}
