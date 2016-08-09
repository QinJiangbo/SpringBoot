package com.qinjiangbo.service;

import com.qinjiangbo.model.SysUser;
import com.qinjiangbo.repository.SysUserRepo;
import com.qinjiangbo.util.MD5;
import com.qinjiangbo.util.TwitterSnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by Richard on 7/16/16.
 */
@Service
public class SysUserService {

    @Autowired
    private SysUserRepo sysUserRepo;
    @Autowired
    private TwitterSnowFlake twitterSnowFlake;

    /**
     * 查找属于邮件集合中的用户
     * @param acEmails
     * @return
     */
    public List<SysUser> findAllUsers(List<String> acEmails) {
        return sysUserRepo.findByAcEmailIn(acEmails);
    }

    /**
     * 根据邮件删除用户
     * @param acEmail
     * @return
     */
    public int deleteUserByAcEmail(String acEmail) {
        return sysUserRepo.deleteByAcEmail(acEmail);
    }

    /**
     * 添加用户
     * @param acEmail
     * @param password
     * @return
     */
    public SysUser insertUser(String acEmail, String password) {
        SysUser sysUser = new SysUser();
        sysUser.setAcEmail(acEmail);
        sysUser.setPwd(MD5.getInstance().getMD5String(password));
        sysUser.setUserId(twitterSnowFlake.nextId());
        sysUser.setIsAdmin(0);
        sysUser.setIsStu(1);
        sysUser.setIsTech(0);
        return sysUserRepo.save(sysUser);
    }

    /**
     * 修改用户信息
     * @param acEmail
     * @return
     */
    public SysUser updateUser(String acEmail) {
        SysUser sysUser = sysUserRepo.findByAcEmail(acEmail).get(0);
        sysUser.setAcMobile("13667241395");
        sysUser.setAcQq("111098666661");
        sysUser.setNameNick("Mama");
        sysUser.setGender(1);
        sysUser.setTimeUpdate(new Timestamp(new Date().getTime()));
        return sysUserRepo.save(sysUser);
    }

}
