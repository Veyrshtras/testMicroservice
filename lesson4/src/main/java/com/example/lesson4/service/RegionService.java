package com.example.lesson4.service;


import com.example.lesson4.model.RegionItem;

public interface RegionService {

    RegionItem findOne(Long id);

    RegionItem add(RegionItem regionItem);

    RegionItem update(Long id, RegionItem regionItem);

    void delete(Long id);
}
