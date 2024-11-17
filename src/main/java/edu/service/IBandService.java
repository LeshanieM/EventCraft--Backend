package edu.service;
import java.util.List;
import edu.model.Band;

public interface IBandService {
   List<Band> getAll();
   void addBand(Band band);
   void deleteBandById(Integer id);
   Band searchBandById(Integer id);
   void updateBandById(Band band);
}
