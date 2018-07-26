package com.lcg.dao;

import com.lcg.entity.DevUser;

public interface DevUserDao {
    int save(DevUser user);
    int delete(DevUser user);
    int update(DevUser user);
    DevUser login(DevUser user);
    int getTotalCount(DevUser user);
}
