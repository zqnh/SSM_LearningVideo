package net.zzqd.elearning.mapper;

import net.zzqd.elearning.domain.Video;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zqnh
 * @date 2019/7/17 on 13:59.
 * video数据访问层
 */
public interface VideoMapper
{
    @Select("select * from video")
    List<Video> findAll();
}
