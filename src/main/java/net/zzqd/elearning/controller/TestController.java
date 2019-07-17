package net.zzqd.elearning.controller;

import net.zzqd.elearning.config.WeChatConfig;
import net.zzqd.elearning.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController
{
	@Autowired
	private WeChatConfig weChatConfig;

	@RequestMapping("/test_config")
	@ResponseBody
	public String testConfig()
	{
		System.out.println(weChatConfig.getAppId());
		return "hello learning";
	}

	@Autowired
	private VideoMapper videoMapper;
	@RequestMapping("/test_db")
	@ResponseBody
	public Object testDb()
	{
		return videoMapper.findAll();
	}
}	
