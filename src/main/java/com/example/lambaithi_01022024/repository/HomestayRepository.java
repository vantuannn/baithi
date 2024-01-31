package com.example.lambaithi_01022024.repository;

import com.example.lambaithi_01022024.model.Homestay;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomestayRepository extends CrudRepository<Homestay, Integer> {
    List<Homestay> findByCityContaining(String keyword);
}
