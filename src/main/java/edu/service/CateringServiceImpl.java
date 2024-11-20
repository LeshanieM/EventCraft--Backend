package edu.service;

import edu.entity.CateringEntity;
import edu.model.Catering;
import edu.repository.CateringRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CateringServiceImpl implements ICateringService{

    private final CateringRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Catering> getAll() {
        List<Catering> CateringArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            Catering map =  mapper.map(entity,Catering.class);
            CateringArrayList.add(map);
        });
        return CateringArrayList;
    }

    @Override
    public void addCatering(Catering catering) {
        repository.save(mapper.map(catering, CateringEntity.class));
    }

    @Override
    public void deleteCateringById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Catering searchCateringById(Integer id) {
        return mapper.map(repository.findById(id),Catering.class);
    }

    @Override
    public void updateCateringById(Catering catering) {
        repository.save(mapper.map(catering,CateringEntity.class));
    }
}
