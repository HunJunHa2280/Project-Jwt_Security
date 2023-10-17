package com.example.jdncprojcet8.dto;

import com.example.jdncprojcet8.entity.Room;
import lombok.Getter;

@Getter
public class RoomResponseDto {

    private Long id;
    private boolean canUse;
    private String roomName;
    //전체 조회
}