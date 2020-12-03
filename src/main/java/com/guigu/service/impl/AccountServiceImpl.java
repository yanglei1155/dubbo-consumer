package com.guigu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.guigu.mapper.AccountMapper;
import com.guigu.pojo.Account;
import com.guigu.pojo.basecom.Result;
import com.guigu.pojo.code.ResultCode;
import com.guigu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class AccountServiceImpl implements AccountService {
   @Autowired
   private AccountMapper accountMapper;
    @Override
    public Result saveAccount(Account account) {
        Result result=new Result();
        try {
            accountMapper.saveAccount(account);
            result.setMessage("存入账户成功!");
            result.setStatusCode(ResultCode.success);
        } catch (Exception e) {
            result.setMessage("存入账户失败!");
            result.setStatusCode(ResultCode.failure);
            e.printStackTrace();
        }
        return  result;
    }
}
