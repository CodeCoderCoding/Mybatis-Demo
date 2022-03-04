package com.supremepole.mybatisspringboot.service;

import com.supremepole.mybatisspringboot.mapper.WebsiteMapper;
import com.supremepole.mybatisspringboot.model.Website;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author CodeCoderCoding
 */
@Service
public interface WebsiteService {
    Website selectById(Integer id);
}
