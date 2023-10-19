package org.example.repository;

import java.util.List;

import org.example.model.HouseHoldIncome;


public interface HouseHoldIncomeRepository {

  List<HouseHoldIncome> findAllFamilies();
}
