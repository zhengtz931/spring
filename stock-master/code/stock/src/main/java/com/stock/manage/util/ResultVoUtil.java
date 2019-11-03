package com.stock.manage.util;

import com.stock.manage.vo.ResultVo;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/11/1 9:00
 */

public class ResultVoUtil {

    public static ResultVo success(Object object,Integer total) {
        ResultVo resultVO = new ResultVo();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setCount(total);
        return resultVO;
    }

    public static ResultVo success(){
        return success(null,0);
    }

    public static ResultVo error(Integer code, String msg) {
        ResultVo resultVO = new ResultVo();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        resultVO.setCount(0);
        return resultVO;
    }
}
