package org.example;

import org.example.repository.HouseHoldIncomeInMemoryRepositoryImpl;

import java.text.MessageFormat;

import static java.text.MessageFormat.*;

public class ApplicationRunner {
  public static void main(String[] args) {

    org.example.service.HouseHoldIncomeService householdIncomeService =
            (org.example.service.HouseHoldIncomeService) new HouseHoldIncomeServiceImpl(new HouseHoldIncomeInMemoryRepositoryImpl());

    System.out.println(
            format("Comidas: {0}", HouseHoldIncomeService.calculateAverageHouseHoldIncome()));


    System.out.println(
        format(
            "Cantidad de familias: {0}", HouseHoldIncomeService.sumNumberOfFamilies()));

    System.out.println(
        format("Promedio: {0}", HouseHoldIncomeService.calculateAverageHouseHoldIncome()));
  }

}
