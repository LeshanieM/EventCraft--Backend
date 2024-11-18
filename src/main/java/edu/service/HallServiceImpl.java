package edu.service;

import edu.entity.HallEntity;
import edu.model.Hall;
import edu.repository.HallRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HallServiceImpl implements IHallService{

    private final HallRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Hall> getAll() {
        List<Hall> HallArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            Hall map =  mapper.map(entity,Hall.class);
            HallArrayList.add(map);
        });
        return HallArrayList;
    }

    @Override
    public void addHall(Hall hall) {
        repository.save(mapper.map(hall, HallEntity.class));
    }

    @Override
    public void deleteHallById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Hall searchHallById(Integer id) {
        return mapper.map(repository.findById(id),Hall.class);
    }

    @Override
    public void updateHallById(Hall hall) {
        repository.save(mapper.map(hall,HallEntity.class));
    }
}
