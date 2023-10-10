package com.example.jdncprojcet8.dto;

import com.example.jdncprojcet8.entity.Student;
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

    public void set(Student student) {

        this.id = student.getId();
        this.name = student.getName();
        this.age = student.getAge();
        this.male = student.isMale();
        this.female = student.isFemale();
        this.family = student.getFamily();
        this.phone = student.getPhone();
        this.otherPhone = student.getOtherPhone();
        this.pay = student.getPay();
        this.depositdate = student.getDepositdate();
        this.teacher = student.getTeacher();
        this.car = student.isCar();
        this.extra = student.getExtra();

    }
}