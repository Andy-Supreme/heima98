package com.alibaba.service;

import com.alibaba.dao.LinkageDao;
import com.alibaba.domain.City;
import com.alibaba.domain.Province;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class LinkageService {
    LinkageDao linkageDao = new LinkageDao();
    public String selePro()  {

        List<Province> list = linkageDao.selePro();
        ObjectMapper objectMapper = new ObjectMapper();
        String string = null;
        try {
            string = objectMapper.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return string;
    }

    public String seleCity(String pname) {
        List<City> list = linkageDao.seleCity(pname);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = null;
        try {
            str = objectMapper.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str;

    }
}
