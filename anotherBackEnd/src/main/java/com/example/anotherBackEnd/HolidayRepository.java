package com.example.anotherBackEnd;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HolidayRepository  extends JpaRepository<Holiday, Integer> {

    @Query(value= "SELECT * FROM holidays_back.holiday", nativeQuery = true)
    List<Holiday> getAllHolidays();




}
