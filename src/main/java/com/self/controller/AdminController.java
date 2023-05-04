package com.self.controller;

import com.self.bean.Admin;
import com.self.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/admin")
//@Slf4j
public class AdminController {
Logger logger = Logger.getLogger("AdminController");
    @Autowired
    private AdminService adminService;

//    http://localhost:8080/admin/list
    @RequestMapping("/list")
    @ResponseBody
    public List<Admin> getAdminList() {
        logger.log(Level.INFO,"查找所有管理员");
        return adminService.getAdminList();
    }

}
