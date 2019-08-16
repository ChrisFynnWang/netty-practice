package com.algorithmDiagram;

import com.alibaba.druid.support.json.JSONUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.HashBasedTable;
import org.junit.Test;


/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/31 19:23
 */
public class ArrayAndList {

    @Test
    public void map() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        HashBasedTable<String, Integer, Object> table = HashBasedTable.create();
        table.put("1", 2, 3);
        System.out.println(mapper.writeValueAsString(table));
    }
}
