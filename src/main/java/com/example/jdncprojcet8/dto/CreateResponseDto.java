package com.example.jdncprojcet8.dto;

import com.example.jdncprojcet8.entity.Room;
import lombok.Getter;

@Getter
public class CreateResponseDto {

    private Long id;

    private String name;
    private int number;
    private boolean canuse;
    private int floors;
    public void set(Room room) {

        this.id = room.getId();
        this.name = room.getName();
        this.canuse = room.isCanuse();
        this.floors = room.getFloors();
    }
}