package org.example.fitnessjava.service.impl;

import jakarta.annotation.Resource;
import org.example.fitnessjava.dao.BannerRepository;
import org.example.fitnessjava.pojo.Banner;
import org.example.fitnessjava.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BannerServiceImpl implements BannerService {
    @Resource
    private BannerRepository bannerRepository;
    @Override
    public ArrayList<Banner> getBanners() {
        return new ArrayList<>(bannerRepository.findAll());
    }

    @Override
    public Boolean addBanner(Banner banner) {
        Banner save = bannerRepository.save(banner);
        Optional<Banner> byId = bannerRepository.findById(Long.valueOf(save.getId()));
        return byId.isPresent();
    }
}
