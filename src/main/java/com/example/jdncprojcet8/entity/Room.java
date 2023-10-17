package com.example.jdncprojcet8.entity;


import com.example.jdncprojcet8.dto.CreateRequestDto;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@JsonSerialize
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    @Column
    private boolean canuse;
    @Column
    private int floors;



    public void set(CreateRequestDto createRequestDto) {
        this.name = createRequestDto.getName();
        this.canuse = createRequestDto.isCanuse();
        this.floors = createRequestDto.getFloors();
    }
}
