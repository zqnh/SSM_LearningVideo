package net.zzqd.elearning.controller.admin;

import net.zzqd.elearning.domain.Video;
import net.zzqd.elearning.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zqnh
 * @date 2019/7/17 on 17:03.
 */
@RestController
@RequestMapping("/admin/api/vi/video")
public class VideoAdminController
{
    @Autowired
    private VideoService videoService;

    /**
     * 根据id删除视频
     * @param videoId
     * @return
     */
    @DeleteMapping("del_by_id")
    public Object delete(@RequestParam (value="video_id",required = true) int videoId)
    {
        return videoService.delete(videoId);
    }

    /**
     * 更新
     * @param video
     * @return
     */
    @PutMapping("update_by_id")
    public Object update(@RequestBody Video video)
    {
        return videoService.update(video);
    }

    /**
     * 保存视频对象
     * @param video
     * @return
     */
    @PostMapping("save")
    public Object save(@RequestBody Video video)
    {
        return videoService.save(video);
    }

}
