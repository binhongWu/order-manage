package com.wbh.manage.api.impl;

import com.wbh.manage.api.SysUserService;
import com.wbh.manage.dao.SysUserMapper;
import com.wbh.manage.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wbh
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectByPrimaryKey(String userId) {
        return sysUserMapper.selectByPrimaryKey(userId);
    }
}
