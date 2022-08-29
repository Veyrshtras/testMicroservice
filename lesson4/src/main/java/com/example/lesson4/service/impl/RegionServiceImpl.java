package com.example.lesson4.service.impl;
import com.example.lesson4.entity.District;
import com.example.lesson4.entity.Region;
import com.example.lesson4.model.RegionItem;
import com.example.lesson4.repository.DistrictRepository;
import com.example.lesson4.repository.RegionRepository;
import com.example.lesson4.service.RegionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RegionServiceImpl implements RegionService {
    private final RegionRepository repository;

    private final DistrictRepository districtRepository;
    public RegionServiceImpl(RegionRepository repository, DistrictRepository districtRepository) {
        this.repository = repository;
        this.districtRepository = districtRepository;
    }

    @Override
    public RegionItem findOne(Long id) {
        return null;
    }

    @Override
    public RegionItem add(RegionItem regionItem) {
        Region region=new Region();
        region.setName(regionItem.getName());
        repository.save(region);
        for (RegionItem.DistrictItem districtItem: regionItem.getDistricts()){
            District district=new District();
            district.setName(districtItem.getName());
            district.setRegion(region);
            districtRepository.save(district);
        }

        return regionItem;
    }

    @Override
    public RegionItem update(Long id, RegionItem regionItem) {
        Region region= repository.getById(id);

        region.setName(regionItem.getName());

        Set<District> districts=new HashSet<>();
        for (RegionItem.DistrictItem districtItem: regionItem.getDistricts()){

            District district=new District();
            district.setName(districtItem.getName());
            districts.add(district);
        }
        region.setDistricts(districts);
        repository.save(region);
        return regionItem;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }


}
