package com.example.demo.day2.service;

import com.example.demo.day2.domain.TableVo;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface TestTableService {
    //c
    public void insert(TableVo tableVO) throws Exception;

    //R
    public List<TableVo> selectAllList() throws Exception;
    public TableVo selectByUserCode(int userCode) throws Exception;

    //U
    public int update(TableVo tableVO) throws Exception;

    //D
    public int deleteByUserCode(int userCode) throws Exception;
    public void delete(int userCode) throws Exception;
}
