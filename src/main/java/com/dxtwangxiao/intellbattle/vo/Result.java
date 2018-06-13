package com.dxtwangxiao.intellbattle.vo;

import lombok.Data;

/**
 * 封装数据，返回到视图层
 * <p>
 * Created by Devin
 * 2018-06-13 下午 04:11
 */
@Data
public class Result {

    private Integer code;

    private String message;

    private Object data;

}
