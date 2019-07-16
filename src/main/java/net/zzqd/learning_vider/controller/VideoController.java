package net.zzqd.learning_vider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VideoController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test()
	{
		return "hello learning";
	}
}	
