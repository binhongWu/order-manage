package com.wbh.manage.api;

import com.wbh.manage.model.SysUser;

/**
 * @author wbh
 */
public interface SysUserService {

    /**
     * 根据ID查找用户
     * @param userId
     * @return
     */
    SysUser selectByPrimaryKey(String userId);
}
