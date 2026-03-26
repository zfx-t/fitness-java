package org.example.fitnessjava.service;


import org.example.fitnessjava.pojo.Banner;

import java.util.ArrayList;

public interface BannerService {
    ArrayList<Banner> getBanners();
    Boolean addBanner(Banner banner);
}
