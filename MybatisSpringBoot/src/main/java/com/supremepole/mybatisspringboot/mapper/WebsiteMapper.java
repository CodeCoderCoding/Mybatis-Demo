package com.supremepole.mybatisspringboot.mapper;

import com.supremepole.mybatisspringboot.model.Website;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author CodeCoderCoding
 */
@Mapper
public interface WebsiteMapper {
    Website selectById(Integer id);
}
