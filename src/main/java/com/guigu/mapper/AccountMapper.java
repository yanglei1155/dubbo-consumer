package com.guigu.mapper;

import com.guigu.pojo.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    void saveAccount(Account account);
}
