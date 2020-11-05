package com.neuedu.hospital.controller;

import com.neuedu.hospital.pojo.Datadictionary;
import com.neuedu.hospital.service.DatadictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/datadictionary")
public class DatadictionaryController {
    @Autowired
    private DatadictionaryService datadictionaryService;
    //查询所有
    @RequestMapping("/getDatadictionaryAll")
    @ResponseBody
    public List<Datadictionary> getDatadictionaryAll(){
        List<Datadictionary> userList = datadictionaryService.selectAll();
        return userList;
    }
    //根据类型查询
    @PostMapping("/selectBytype")
    @ResponseBody
    public List<Datadictionary> selectBytype(@RequestBody Datadictionary datadictionary){
        String type = datadictionary.getType();
        List<Datadictionary> datadictionarys= datadictionaryService.selectBytype(type);
        return datadictionarys;
    }
    //根名称型查询
    @PostMapping("/selectByName")
    @ResponseBody
    public Datadictionary selectByname(@RequestBody Datadictionary datadictionary){
        String name = datadictionary.getName();
        Datadictionary datadictionarys=datadictionaryService.selectByname(String.valueOf(name));
        return datadictionarys;
    }
    //增加
    @PostMapping("/adddatadictionary")
    @ResponseBody
    public String  adddatadictionary(@RequestBody Datadictionary datadictionary) {
        String type = datadictionary.getType();
        String name = datadictionary.getName();
        String value = datadictionary.getValue();

        datadictionary.setType(type);
        datadictionary.setName(name);
        datadictionary.setValue(value);

        int result = datadictionaryService.insert(datadictionary);
        if(result<=0){
            return "添加失败!";
        }
    return "添加成功！";
    }

    //修改
    @PostMapping("/updatedatadictionary")
    @ResponseBody
    public String  updatedatadictionary(@RequestBody Datadictionary datadictionary) {
        Integer datadictionaryId = datadictionary.getDatadictionaryId();
        String type = datadictionary.getType();
        String name = datadictionary.getName();
        String value = datadictionary.getValue();

        datadictionary.setType(type);
        datadictionary.setName(name);
        datadictionary.setValue(value);

        int result = datadictionaryService.updateByPrimaryKey(datadictionary);
        if(result<=0){
            return "修改失败!";
        }
        return "修改成功！";
    }
}
