package com.billetsdoux.servercommon.dto;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;




@Data
@TableName("t_student")
public class Student implements Serializable {

    @TableId
    private Integer id;
    private String name;
    private Integer age;


}
