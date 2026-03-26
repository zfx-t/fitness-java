package org.example.fitnessjava.service;

import org.example.fitnessjava.pojo.UserProfile;

public interface UserProfileService {
    Boolean addUser(UserProfile user);
    UserProfile existUser(String openid);
}
