package com.example.springboot.service.impl;

import com.example.springboot.entity.News;
import com.example.springboot.mapper.NewsMapper;
import com.example.springboot.service.INewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zlw
 * @since 2024-02-03
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements INewsService {

    @Resource
    NewsMapper newsMapper;
    @Override
    public void updateView(Integer id) {
        newsMapper.updateView(id);
    }
}
