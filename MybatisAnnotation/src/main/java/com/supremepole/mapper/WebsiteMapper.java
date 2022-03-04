package com.supremepole.mapper;

import com.supremepole.model.Website;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @author CodeCoderCoding
 */
public interface WebsiteMapper {
    @Results({
            @Result(property="id", column="id", id=true),
            @Result(property="name", column="name"),
            @Result(property="url", column="url")
    })
    @Select("select id, name, url from website where id = #{id}")
    Website selectById(Integer id);
}
