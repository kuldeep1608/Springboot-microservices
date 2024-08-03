/**
 *
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;

/**
 * @author Kuldeep Singh Yadav
 *
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/{id}")
    public ResponseEntity<List<UserInfo>> getUserInfo(@PathVariable String id) {
        List<UserInfo> users = userInfoService.getAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
