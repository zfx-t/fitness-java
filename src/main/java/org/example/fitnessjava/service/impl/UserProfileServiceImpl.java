package org.example.fitnessjava.service.impl;

import jakarta.annotation.Resource;
import org.apache.catalina.User;
import org.example.fitnessjava.dao.UserProfileRepository;
import org.example.fitnessjava.pojo.UserProfile;
import org.example.fitnessjava.service.UserProfileService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserProfileServiceImpl implements UserProfileService {
    @Resource
    private UserProfileRepository userProfileRepository;
    @Override
    public Boolean addUser(UserProfile user) {
        UserProfile save = userProfileRepository.save(user);
        Optional<UserProfile> byId = userProfileRepository.findById(Long.valueOf(save.getId()));
        return byId.isPresent();
    }

    @Override
    public UserProfile existUser(String openid) {
        UserProfile byOpenid = userProfileRepository.findByOpenid(openid);
        return byOpenid;
    }
}
