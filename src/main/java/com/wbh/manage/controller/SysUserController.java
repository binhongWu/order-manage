package com.wbh.manage.controller;

import com.wbh.manage.api.SysUserService;
import com.wbh.manage.common.utils.JSONResult;
import com.wbh.manage.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


/**
 * @author wbh
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 通过用户ID查找用户
     * @param userId
     * @return SysUser
     */
    @GetMapping("/{userId}")
    public JSONResult<SysUser> selectByPrimaryKey(@PathVariable String userId) {
        JSONResult<SysUser> jsonResult = new JSONResult<>();
        SysUser sysUser=sysUserService.selectByPrimaryKey(userId);
        jsonResult.setData(sysUser);
        jsonResult.setStatusCode(String.valueOf(HttpStatus.OK));
        jsonResult.setSuccess(true);
        return jsonResult;
    }

    /**
     * 登录  账号密码登录
     * @return jsonResult
     */
    @GetMapping("/loginByAccount")
    public JSONResult<SysUser> loginByAccount(){
        JSONResult<SysUser> jsonResult = new JSONResult<>();
        jsonResult.setStatusCode(String.valueOf(HttpStatus.OK));
        jsonResult.setSuccess(true);
        return jsonResult;
    }

}
