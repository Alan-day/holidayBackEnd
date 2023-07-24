package com.example.anotherBackEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class HolidayService {

    private final HolidayRepository holidayRepository;

    private final holidayTilesRepository holidayTilesRepository;

    public Holiday addHoliday(@RequestBody Holiday holiday) {

        Holiday newHoliday = holidayRepository.save(holiday);

        System.out.println(newHoliday);
        return newHoliday;

    }
    @Autowired

    public HolidayService(HolidayRepository holidayRepository, holidayTilesRepository holidayTilesRepository){
        this.holidayRepository = holidayRepository;
        this.holidayTilesRepository = holidayTilesRepository;



    }


    public  List<Holiday> getAllHolidays() {
        return  holidayRepository.getAllHolidays();
    } // why does it work with the same name of the method in the repository?






}
