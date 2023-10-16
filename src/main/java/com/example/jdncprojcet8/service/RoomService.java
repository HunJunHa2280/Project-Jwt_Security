package com.example.jdncprojcet8.service;

import com.example.jdncprojcet8.dto.CreateRequestDto;
import com.example.jdncprojcet8.dto.CreateResponseDto;
import com.example.jdncprojcet8.entity.Room;
import com.example.jdncprojcet8.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    public CreateResponseDto createRoom(CreateRequestDto createRequestDto) {
        Room room = new Room();
        room.set(createRequestDto);
        roomRepository.save(room);

        CreateResponseDto createResponseDto = new CreateResponseDto();
        createResponseDto.set(room);

        return createResponseDto;
        // 생성
    }

    public List<Room> getRoom() {
        return roomRepository.findAll();
    }

    public Room update(Long id, CreateRequestDto createRequestDto) {
        Room room = roomRepository.findById(id).orElseThrow( () ->
                new NullPointerException("해당 회의실은 없는 회의실입니다."));
        room.set(createRequestDto);
        roomRepository.save(room);
        return room;
        // 업데이트
    }

    public List<Room> deleteRoom(Long id) {
        Room room = roomRepository.findById(id).orElseThrow( () ->
                new NullPointerException("해당 회의실은 존재하지 않습니다."));

        roomRepository.delete(room);
        return roomRepository.findAll(); // findByAll이 학생을 가져오면 제거하고 남은 학생을 보이게 리턴
        // 삭제
    }

    public Room geOnetRoom(Long id) {
        return roomRepository.findById(id).orElseThrow(() ->
                new NullPointerException("해당 회의실은 없는 학생입니다."));
        // 한명만 조회
    }
}
