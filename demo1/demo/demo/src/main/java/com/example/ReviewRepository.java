package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    
}

