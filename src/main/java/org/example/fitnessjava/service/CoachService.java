package org.example.fitnessjava.service;

import org.example.fitnessjava.pojo.Coach;

import java.util.ArrayList;

public interface CoachService {
    ArrayList<Coach> getCoachesByFeatured();
}
