package org.example.fitnessjava.service.impl;

import jakarta.annotation.Resource;
import org.example.fitnessjava.dao.CoachRepository;
import org.example.fitnessjava.pojo.Coach;
import org.example.fitnessjava.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoachServiceImpl implements CoachService {
    @Resource
    private CoachRepository coachRepository;

    @Override
    public ArrayList<Coach> getCoachesByFeatured() {
        List<Coach> byFeatured = coachRepository.findByFeatured(true);
        return new ArrayList<>(byFeatured);
    }
}
