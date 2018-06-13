package com.dxtwangxiao.intellbattle.util;

import com.dxtwangxiao.intellbattle.vo.Result;

/**
 * 返回结果工具类，主要用来对返回结果进行封装
 * <p>
 * Created by Devin
 * 2018-06-13 下午 04:15
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(200);
        result.setMessage("请求成功");
        result.setData(object);

        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result success(Integer code, String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setData(null);

        return result;
    }

    public static Result success(Integer code, String message, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);

        return result;
    }

    public static Result error(Integer code, String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);

        return result;
    }
}
