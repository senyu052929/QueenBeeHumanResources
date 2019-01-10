package org.QueenBee.shiro.service.impl;

import org.QueenBee.shiro.config.ShiroConfig;
import org.QueenBee.shiro.dao.UserInfoDao;
import org.QueenBee.shiro.entity.UserInfo;
import org.QueenBee.shiro.service.UserInfoService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	
	private static Log logger = LogFactory.getLog(UserInfoServiceImpl.class);
	
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        logger.debug("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}