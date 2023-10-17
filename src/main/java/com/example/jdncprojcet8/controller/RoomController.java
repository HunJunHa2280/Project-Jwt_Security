package com.example.jdncprojcet8.controller;


import com.example.jdncprojcet8.dto.CreateRequestDto;
import com.example.jdncprojcet8.dto.CreateResponseDto;
import com.example.jdncprojcet8.entity.Room;
import com.example.jdncprojcet8.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class RoomController {

    private final RoomService roomService;

//    @PostMapping("/room")
//    public CreateResponseDto createRoom(@RequestBody CreateRequestDto createRequestDto) {
//        return roomService.createRoom(createRequestDto);
//    }

    @GetMapping("/room")
    public List<Room> getAllRoom() {
        return roomService.getRoom();
    }

    @PutMapping("/room/{id}")
    public Room update(@RequestBody CreateRequestDto createRequestDto,
                       @PathVariable Long id) {
        return roomService.update(id,createRequestDto);
    }

    @GetMapping("/room/{id}")
    public Room getRoom(@PathVariable Long id) {
        return roomService.geOnetRoom(id);
    }
}