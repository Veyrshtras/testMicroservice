package com.example.paymentsystem.service;

import com.example.paymentsystem.entity.Bill;

import java.util.List;

public interface BillService {

    List<Bill> findAll();

    Bill getOne(Long id);

    Bill add(Bill bill);

    Bill update(Long id, Bill bill);

    Bill delete(Long id);

}
