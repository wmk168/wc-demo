package com.weichuang.demo.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weichuang.demo.api.BaseControllerApiImpl;
import com.weichuang.demo.bean.Result;
import com.weichuang.demo.user.api.UserApi;
import com.weichuang.demo.user.po.UserPo;

@RestController
@RequestMapping("user")
public class UserConstroller extends BaseControllerApiImpl<UserPo> implements UserApi {

}
