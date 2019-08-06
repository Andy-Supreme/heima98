package com.alibaba.dao;

import java.util.List;

import com.alibaba.domain.City;
import com.alibaba.domain.Province;
import com.alibaba.utils.JDBCUtils;


import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class LinkageDao {
    JdbcTemplate jdbcTemplate =new JdbcTemplate(JDBCUtils.getDataSource());
    public List<Province> selePro() {



        String sql = "select * from province";
        List<Province> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Province.class));
        return list;


    }
    @Test
    public void jjj(){
        String sql = "select * from province";
        List<Province> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Province.class));
        System.out.println(query.get(0).toString());
    }

    public List<City> seleCity(String pname) {
        String sql = "select a.* from city a ,province b where a.pid=b.pid and b.pname=?";
        List<City> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(City.class), pname);
        return list;
    }
}
