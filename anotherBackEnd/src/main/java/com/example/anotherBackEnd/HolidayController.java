package com.example.anotherBackEnd;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class HolidayController {
    @Autowired
    private final HolidayService holidayService;

    public HolidayController(HolidayService holidayService) {

        this.holidayService = holidayService;

    }



    @PostMapping("/holidays")
    public ResponseEntity <Holiday> createHoliday(@RequestBody Holiday holiday) {
        Holiday newHoliday = holidayService.addHoliday(holiday);
       return ResponseEntity.status(HttpStatus.CREATED).body(newHoliday);

    }






    @GetMapping("/holidays")

    public ResponseEntity<List<Holiday>> getAllHolidays() {


        return ResponseEntity.status(HttpStatus.OK).body(holidayService.getAllHolidays());
    }






}
