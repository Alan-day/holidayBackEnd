package com.example.anotherBackEnd;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class HolidayController {

    private final HolidayService holidayService;
    @Autowired
    public HolidayController(HolidayService holidayService) {

        this.holidayService = holidayService;

    }

    @GetMapping("/holidays")

    public ResponseEntity<List<Holiday>> getAllHolidays() {


        return ResponseEntity.status(HttpStatus.OK).body(holidayService.getAllHolidays());
    }






}
