package edu.service;

import edu.entity.BandEntity;
import edu.model.Band;
import edu.repository.BandRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BandServiceImpl implements IBandService{

    private final BandRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Band> getAll() {
        List<Band> BandArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
           Band map =  mapper.map(entity,Band.class);
            BandArrayList.add(map);
        });
        return BandArrayList;
    }

    @Override
    public void addBand(Band band) {
        repository.save(mapper.map(band, BandEntity.class));
    }

    @Override
    public void deleteBandById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Band searchBandById(Integer id) {
        return mapper.map(repository.findById(id),Band.class);
    }

    @Override
    public void updateBandById(Band band) {
        repository.save(mapper.map(band,BandEntity.class));
    }
}
