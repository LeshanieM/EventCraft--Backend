package edu.service;

import edu.entity.BandEntity;
import edu.model.Band;
import edu.repository.BandRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BandServiceImpl implements IBandService{

    private final BandRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Band> getAll() {
        return null;
    }

    @Override
    public void addBand(Band band) {
    repository.save(mapper.map(band, BandEntity.class));
    }

    @Override
    public void deleteBandById(Integer id) {

    }

    @Override
    public Band searchBandById(Integer id) {
        return null;
    }

    @Override
    public void updateBandById(Band band) {

    }
}
