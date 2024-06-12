package com.example.springboot.mapper;

import com.example.springboot.entity.News;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zlw
 * @since 2024-02-03
 */
public interface NewsMapper extends BaseMapper<News> {

    @Update("update news set view = view + 1 where id=#{id}")
    void updateView(Integer id);
}
