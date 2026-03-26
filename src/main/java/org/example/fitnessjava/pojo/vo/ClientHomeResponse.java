package org.example.fitnessjava.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.fitnessjava.pojo.Banner;
import org.example.fitnessjava.pojo.HealthSurvey;
import org.example.fitnessjava.pojo.Coach;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientHomeResponse{
    private ArrayList<Banner> banners;
    private ArrayList<Coach> featuredCoaches;
    private HealthSurvey survey;
}
