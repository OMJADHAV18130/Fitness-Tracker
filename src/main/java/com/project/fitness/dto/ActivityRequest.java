package com.project.fitness.dto;

import com.project.fitness.model.ActivityType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityRequest {
    private Map<String, Object> additionalMetrics;
    private ActivityType type;
    private String user;
    private Integer duration;
    private Integer caloriesBurned;
}
