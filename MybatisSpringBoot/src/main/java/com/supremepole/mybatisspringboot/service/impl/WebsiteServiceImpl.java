package com.supremepole.mybatisspringboot.service.impl;

import com.supremepole.mybatisspringboot.mapper.WebsiteMapper;
import com.supremepole.mybatisspringboot.model.Website;
import com.supremepole.mybatisspringboot.service.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author CodeCoderCoding
 */
@Service
public class WebsiteServiceImpl implements WebsiteService {
    @Autowired
    private WebsiteMapper websiteMapper;

    @Override
    public Website selectById(Integer id){
        return websiteMapper.selectById(id);
    }
}
