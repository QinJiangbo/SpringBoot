package com.qinjiangbo.resource;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qinjiangbo.model.SysUser;
import com.qinjiangbo.repository.SysUserRepo;
import com.qinjiangbo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Richard on 7/15/16.
 */
@Path("/user")
public class UserResource {

    @Autowired
    private SysUserService sysUserService;

    @Path("/show/{name}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String show(@PathParam("name") String name) {
        return "My name is " + name;
    }

    @Path("/findAll")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    //request参数可以直接被转化为方法的参数
    public String findAll(String jsonStr) {
        JSONObject jsonObject = JSON.parseObject(jsonStr);
        List<String> acEmails = JSONObject.parseArray(jsonObject.getString("acEmails"), String.class);
        List<SysUser> sysUserList = sysUserService.findAllUsers(acEmails);
        return JSON.toJSONString(sysUserList);
    }

    @Path("/deleteUser")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public int deleteUser(@QueryParam("acEmail") String acEmail) {
        return sysUserService.deleteUserByAcEmail(acEmail);
    }

    @Path("/insertUser")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String insertUser(@QueryParam("acEmail") String acEmail, @QueryParam("password") String password) {
        SysUser sysUser = sysUserService.insertUser(acEmail, password);
        return JSON.toJSONString(sysUser);
    }

    @Path("/updateUser")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String updateUser(@QueryParam("acEmail") String acEmail) {
        SysUser sysUser = sysUserService.updateUser(acEmail);
        return JSON.toJSONString(sysUser);
    }
}
