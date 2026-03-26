package org.example.fitnessjava.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("wx.miniapp")
public class WXAConfig {
    public String appId;
    public String appSecret;
}
