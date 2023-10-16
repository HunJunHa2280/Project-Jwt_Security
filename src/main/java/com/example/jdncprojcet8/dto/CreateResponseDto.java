package com.example.jdncprojcet8.dto;

import com.example.jdncprojcet8.entity.Room;
import lombok.Getter;

@Getter
public class CreateResponseDto {

    private Long id;

    private String name;
    private int age;
    private boolean male = false;
    private boolean female = false;
    private String family;
    private String phone;
    private String otherPhone;
    private int pay;
    private String depositdate;
    private String teacher;
    private boolean car;
    private String extra;

    public void set(Room room) {

        this.id = room.getId();
        this.name = room.getName();
        this.age = room.getAge();
        this.male = room.isMale();
        this.female = room.isFemale();
        this.family = room.getFamily();
        this.phone = room.getPhone();
        this.otherPhone = room.getOtherPhone();
        this.pay = room.getPay();
        this.depositdate = room.getDepositdate();
        this.teacher = room.getTeacher();
        this.car = room.isCar();
        this.extra = room.getExtra();

    }
}