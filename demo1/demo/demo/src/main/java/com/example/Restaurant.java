package com.example;
import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String cusine;
    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Review> reviews;
    
    //getters and setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }   
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCusine(){
        return cusine;
    }
    public void setCusine(String cusine){
        this.cusine = cusine;
    }
    public List<Review> getReviews(){
        return reviews;
    }
    public void setReviews(List<Review> reviews){
        this.reviews = reviews;
    }
    
}