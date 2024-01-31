package com.example.lambaithi_01022024.service;

import com.example.lambaithi_01022024.model.Homestay;
import com.example.lambaithi_01022024.repository.HomestayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomestayService {
    @Autowired
    private HomestayRepository homestayRepository;

    public List<Homestay> getAllListHomestays() {
        return (List<Homestay>) homestayRepository.findAll();
    }

    public void createHomestay(Homestay homestay) {
        homestayRepository.save(homestay);
    }

    public Homestay findById(int id) {
        return homestayRepository.findById(id).get();
    }

    public void updateHomestay(Homestay homestay) {
        Homestay homestayEdit = findById(homestay.getId());

        if (homestayEdit != null) {
            homestayEdit.setId(homestay.getId());
            homestayEdit.setName(homestay.getName());
            homestayEdit.setCity(homestay.getCity());
            homestayEdit.setNumberRoom(homestay.getNumberRoom());
            homestayEdit.setPrice(homestay.getPrice());
            homestayEdit.setNumberWC(homestay.getNumberWC());
            homestayEdit.setDetails(homestay.getDetails());

            homestayRepository.save(homestayEdit);
        }
    }

    public void deleteById(int id) {
        homestayRepository.deleteById(id);
    }

    public List<Homestay> searchWithKeyword(String city) {
        return homestayRepository.findByCityContaining(city);
    }
}