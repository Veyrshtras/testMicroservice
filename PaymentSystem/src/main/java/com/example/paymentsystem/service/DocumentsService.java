package com.example.paymentsystem.service;

import com.example.paymentsystem.entity.Documents;

import java.util.List;

public interface DocumentsService {

    List<Documents> findAll();

    Documents getOne(Long id);

    Documents add(Documents documents);

    Documents update(Long id, Documents documents);

    Documents delete(Long id);
}
