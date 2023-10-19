package org.example;


import java.util.List;
import org.example.model.HouseHoldIncome;
import org.example.repository.HouseHoldIncomeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HouseHoldIncomeService {
    private static HouseHoldIncome[] lista;

    public static Object sumNumberOfFamilies () {

        int numTotalHogares = 0;
        for (HouseHoldIncome houseHoldIncome : lista) {
            numTotalHogares += 1;
        }


        return numTotalHogares;
    }
    public static Object calculateAverageHouseHoldIncome() {

        Double averageHouseHoldIncome = 0.0D;
        for (HouseHoldIncome houseHoldIncome : lista) {
            averageHouseHoldIncome += 1;
        }


        return averageHouseHoldIncome;
    }

    public static Object DisplayFamilyName() {

        Double averageHouseHoldIncome = 0.0D;
        for (HouseHoldIncome houseHoldIncome : lista) {
            averageHouseHoldIncome += 1;
        }


        return averageHouseHoldIncome;
    }




}
