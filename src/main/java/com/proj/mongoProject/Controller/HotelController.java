package com.proj.mongoProject.Controller;


import com.proj.mongoProject.Repository.HotelRepository;
import com.proj.mongoProject.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hotels")
public class HotelController {

    @Autowired
    HotelRepository hotelRepository;

    @GetMapping("/all")
    public List<Hotel> getAllRecords(){
        return hotelRepository.findAll();
    }
    
    @PostMapping("/addHotel")
    public ResponseEntity<Hotel> update(@RequestBody Hotel hotel){
        hotelRepository.save(hotel);
        return new ResponseEntity<Hotel>(hotel,HttpStatus.CREATED);
    }
}
