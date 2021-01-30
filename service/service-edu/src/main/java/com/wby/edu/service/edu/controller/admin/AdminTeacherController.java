package com.wby.edu.service.edu.controller.admin;


import com.wby.edu.service.edu.entity.Teacher;
import com.wby.edu.service.edu.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * 添加swagger描述
 *  1.controller
 *      @API    描述controller
 *      @ApiOpration    描述controller的一个方法
 *      @ApiParam   描述形参
 *  2.javabean
 *      @ApiModel   描述bean
 *     @ApiModelProperty    描述bean属性
 *
 * @author wby
 * @since 2021-01-30
 */
@Api(tags = {"老师管理"})
@RestController
@RequestMapping("admin/edu/teacher")
public class AdminTeacherController {
    @Autowired
    TeacherService teacherService;

    //查询所有
    @ApiOperation(value = "查询所有老师")
    @GetMapping("/list")
    public List<Teacher> list(){
        List<Teacher> list = teacherService.list();
        return list;
    }
    //根据id删除
    //required = true 此参数是否是必须的
    @ApiOperation(value = "根据id删除老师")
    @DeleteMapping("del/{id}")
    public String removeTeacherById(@ApiParam(required = true,value = "老师id") @PathVariable String id){
        boolean b = teacherService.removeById(id);
        if (b){
            return "ok";
        }else {
            return "false1";
        }
    }


}

