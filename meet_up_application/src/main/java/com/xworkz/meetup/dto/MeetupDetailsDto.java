package com.xworkz.meetup.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
@Setter
@Getter
@ToString
public class MeetupDetailsDto {
    private String date;
    private String time;
    private String name;
    private String place;
    private String reason;

    private LocalDateTime createdOn;
    private String createdBy;
    private LocalDateTime updatedOn;
    private String updatedBy;
}
