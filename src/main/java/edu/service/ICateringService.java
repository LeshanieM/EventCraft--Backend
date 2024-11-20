package edu.service;

import edu.model.Catering;

import java.util.List;

public interface ICateringService {
    List<Catering> getAll();
    void addCatering(Catering catering);
    void deleteCateringById(Integer id);
    Catering searchCateringById(Integer id);
    void updateCateringById(Catering catering);
}
