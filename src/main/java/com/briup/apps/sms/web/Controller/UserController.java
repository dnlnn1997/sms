package com.briup.apps.sms.web.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 用户控制
 * */
@RestController
@RequestMapping("/user")
public class UserController {
	@GetMapping("findAll")
	public String findAll(){
		return "hello springboot";
	}

}
