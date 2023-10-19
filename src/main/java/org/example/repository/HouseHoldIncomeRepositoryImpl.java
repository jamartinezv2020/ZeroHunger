package org.example.repository;

import org.example.HouseHoldIncomeServiceImpl;
import org.example.model.HouseHoldIncome;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class HouseHoldIncomeRepositoryImpl implements HouseHoldIncomeRepository {
    @Override
    public List<HouseHoldIncome> findAllFamilies() {
        return null;
    }

    private static final Logger logger = LoggerFactory.getLogger(HouseHoldIncomeServiceImpl.class);
    private  HouseHoldIncomeRepository houseHoldIncomeRepository;

    public void HouseHoldIncomeServiceImpl(HouseHoldIncomeRepository houseHoldIncomeRepository) {
        this.houseHoldIncomeRepository = houseHoldIncomeRepository;
    }
}
