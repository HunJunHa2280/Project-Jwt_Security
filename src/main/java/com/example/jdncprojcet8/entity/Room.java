package com.example.jdncprojcet8.entity;


import com.example.jdncprojcet8.dto.CreateRequestDto;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.Getter;

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
    private int age;
    @Column
    private boolean male = false;
    @Column
    private boolean female= false;
    @Column
    private String family;
    @Column
    private String phone;
    @Column
    private String otherPhone;
    @Column
    private int pay;
    @Column
    private String depositdate;
    @Column
    private String teacher;
    @Column
    private boolean car;
    @Column
    private String extra;

    public void set(CreateRequestDto createRequestDto) {
        this.name = createRequestDto.getName();
        this.age = createRequestDto.getAge();
        this.male = createRequestDto.isMale();
        this.female = createRequestDto.isFemale();
        this.family = createRequestDto.getFamily();
        this.phone = createRequestDto.getPhone();
        this.otherPhone = createRequestDto.getOtherPhone();
        this.pay = createRequestDto.getPay();
        this.depositdate = createRequestDto.getDepositdate();
        this.teacher = createRequestDto.getTeacher();
        this.car = createRequestDto.isCar();
        this.extra = createRequestDto.getExtra();
    }
}
