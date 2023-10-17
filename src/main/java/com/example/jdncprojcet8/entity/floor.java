package com.example.jdncprojcet8.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
@JsonSerialize
public class floor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}
