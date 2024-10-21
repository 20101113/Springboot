package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    
}
