package org.example.fitnessjava.service;

import org.example.fitnessjava.pojo.HealthSurvey;

public interface HealthSurveyService {
    HealthSurvey getHealthSurveyByUserId(String userId);
}
