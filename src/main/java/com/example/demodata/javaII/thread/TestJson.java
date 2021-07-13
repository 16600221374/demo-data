package com.example.demodata.javaII.thread;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.springframework.cglib.beans.BeanMap;

/**
 * @ClassName: TestJson
 * @Author: liuzuncai
 * @Description:
 * @Date: 2021/7/9 9:20
 * @Version: 1.0
 */
public class TestJson {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("刘","尊才");
        DTO dto = new DTO();
        dto.setMap(map);
        dto.setName("刘尊才");
        DTO dto1 = new DTO();
        Map<String,String> map1 = new HashMap<>();
        map1.putAll(map);//map深copy
        dto1.setMap(map1);
        dto1.setName("刘尊才");
        List<DTO> dtos = new ArrayList<>();
        dtos.add(dto);
        dtos.add(dto1);

        String str = JSONArray.toJSONString(dtos);
        System.out.println(JSONArray.toJSONString(dtos));

        List<DTO> dtoTem = JSONArray.parseArray(str,DTO.class);

        System.out.println(1111);
    }
}
