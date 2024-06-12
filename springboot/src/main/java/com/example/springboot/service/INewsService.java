package com.example.springboot.service;

import com.example.springboot.entity.News;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zlw
 * @since 2024-02-03
 */
public interface INewsService extends IService<News> {

    void updateView(Integer id);

}
