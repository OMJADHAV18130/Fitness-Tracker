package com.project.fitness.service;

import com.project.fitness.dto.RecommendationRequest;
import com.project.fitness.model.Activity;
import com.project.fitness.model.Recommendation;
import com.project.fitness.model.User;
import com.project.fitness.repository.ActivityRepository;
import com.project.fitness.repository.RecommendationRepository;
import com.project.fitness.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RecommendationService {

    private final UserRepository userRepository;
    private final ActivityRepository activityRepository;
    private final RecommendationRepository recommendationRepository;

    public Recommendation generateRecommendation(RecommendationRequest request) {

        User user = userRepository.findById(request.getUserId()).get();
        Activity activity = activityRepository.findById(request.getActivityId()).get();

        Recommendation recommendation = Recommendation.builder()
                .user(user)
                .activity(activity)
                .improvements(request.getImprovements())
                .suggestions(request.getSuggestions())
                .safety(request.getSafety())
                .build();
        return recommendationRepository.save(recommendation);
    }

    public List<Recommendation> getRecommendationByUser(String userId) {
        List<Recommendation> recommendation = recommendationRepository.findByUserId(userId);
        return recommendation.stream()
                .collect(Collectors.toList());
    }

    public List<Recommendation> getRecommendationByActivity(String activityId) {
        List<Recommendation> recommendation = recommendationRepository.findByActivityId(activityId);
        return recommendation.stream()
                .collect(Collectors.toList());
    }
}
