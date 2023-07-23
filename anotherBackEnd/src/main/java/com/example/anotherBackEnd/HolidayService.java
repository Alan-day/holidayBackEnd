package com.example.anotherBackEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HolidayService {

    private final HolidayRepository holidayRepository;

    private final holidayTilesRepository holidayTilesRepository;


    @Autowired

    public HolidayService(HolidayRepository holidayRepository, holidayTilesRepository holidayTilesRepository){
        this.holidayRepository = holidayRepository;
        this.holidayTilesRepository = holidayTilesRepository;



    }


    public  List<Holiday> getAllHolidays() {
        return  holidayRepository.getAllHolidays();
    } // why does it work with the same name of the method in the repository?






}
