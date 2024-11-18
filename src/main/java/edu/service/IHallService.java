package edu.service;
import java.util.List;
import edu.model.Hall;

public interface IHallService {
    List<Hall> getAll();
    void addHall(Hall hall);
    void deleteHallById(Integer id);
    Hall searchHallById(Integer id);
    void updateHallById(Hall hall);
}
