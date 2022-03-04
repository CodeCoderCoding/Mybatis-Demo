package com.supremepole.mybatisspringboot.controller;

import com.supremepole.mybatisspringboot.model.Website;
import com.supremepole.mybatisspringboot.service.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@RestController
public class WebsiteController {
    @Autowired
    private WebsiteService websiteService;

    @RequestMapping("website/{id}")
    public Website getWebsite(@PathVariable("id") Integer id){
        return websiteService.selectById(id);
    }
}
