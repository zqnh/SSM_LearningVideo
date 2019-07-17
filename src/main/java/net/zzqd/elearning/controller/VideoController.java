package net.zzqd.elearning.controller;

import net.zzqd.elearning.domain.Video;
import net.zzqd.elearning.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vi/video")
public class VideoController {

	@Autowired
	private VideoService videoService;

	/**
	 * 分页接口
	 * @param page 当前第几页，默认是第一页
	 * @param size	每页显示几条
	 * @return
	 */
	@GetMapping("page")
	public Object pageVideo(@RequestParam(value="page",defaultValue = "1")int page,
							@RequestParam(value="size",defaultValue="10")int size)
	{
		return videoService.findAll();
	}

	/**
	 *	根据id找视频
	 * @param videoId
	 * @return
	 */
	@GetMapping("find_by_id")
	public Object findById(@RequestParam (value="video_id",required = true) int videoId)
	{
		return videoService.findById(videoId);
	}
}	
