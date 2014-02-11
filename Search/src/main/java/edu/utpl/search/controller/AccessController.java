package edu.utpl.search.controller;

import edu.utpl.search.domain.Role;
import edu.utpl.search.domain.User;
import edu.utpl.search.repository.UserRepository;
import edu.utpl.search.response.UserDto;
import edu.utpl.search.util.RoleUtil;
import edu.utpl.search.util.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class AccessController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/login")
	public String login() {
		return "access/login";
	}

	@RequestMapping("/denied")
	public String denied(ModelMap model) {
		model.addAttribute("error", "access.denied");
		return "error";
	}

	@RequestMapping("/login/failure")
	public String loginFailure(ModelMap model) {
		model.addAttribute("status", "login.failure");
		return "access/login";
	}

	@RequestMapping("/logout/success")
	public String logoutSuccess(ModelMap model) {
		model.addAttribute("status", "logout.success");
		return "access/login";
	}
	
	@RequestMapping("/signup")
	public String signup() {
		return "access/signup";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String createAccount(UserDto dto, ModelMap model) {
		if (userRepository.findByUsername(dto.getUsername()) != null) {
			model.addAttribute("status", "signup.invalid.username.duplicate");
			return "access/signup";
		}
		
		if (dto.getPassword().equals(dto.getRepassword()) == false) {
			model.addAttribute("status", "signup.invalid.password.notmatching");
			return "access/signup";
		}
		
		User user = UserMapper.map(dto);
		user.setRole(new Role(RoleUtil.ROLE_USER, user));
		user = userRepository.save(user);
		return "redirect:/";
	}
}