package com.wby.edu.service.base.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
//@Accessors用于配置getter和setter方法的生成结果,chain设置为true，则setter方法返回当前对象
@Accessors(chain = true)
public class BaseEntity {

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    //@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm")
    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    //@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm")
    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;
}
