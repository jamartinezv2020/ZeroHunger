package org.example;


import java.util.List;
import org.example.model.HouseHoldIncome;
import org.example.repository.HouseHoldIncomeRepository;
import org.example.service.HouseHoldIncomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HouseHoldIncomeServiceImpl implements HouseHoldIncomeService {

    private static final Logger logger = LoggerFactory.getLogger(HouseHoldIncomeServiceImpl.class);
    private final HouseHoldIncomeRepository houseHoldIncomeRepository;

    public HouseHoldIncomeServiceImpl(HouseHoldIncomeRepository houseHoldIncomeRepository) {
        this.houseHoldIncomeRepository = houseHoldIncomeRepository;
    }
    @Override
    public void DisplayFamilyName () {
        List<HouseHoldIncome> families = this.houseHoldIncomeRepository.findAllFamilies ();
        for (var ZeroHunger : families) {
            System.out.println (ZeroHunger.nombre ());
        }
    }


    @Override
    public void MostrarNombreFamilia () {

    }

    @Override
    public void ShowNumberMembers () {
        List<HouseHoldIncome> members = this.houseHoldIncomeRepository.findAllFamilies ();
        for (var ZeroHunger : members) {
            System.out.println (ZeroHunger.miembros ());
        }
    }
    @Override
    public void ShowNumberMeals () {
        List<HouseHoldIncome> meals = this.houseHoldIncomeRepository.findAllFamilies ();
        for (var ZeroHunger : meals) {
            System.out.println (ZeroHunger.comidas ());
        }
    }
    @Override
    public void ShowFamilyIncomeAmount () {
        List<HouseHoldIncome> familyIncomeAmounts = this.houseHoldIncomeRepository.findAllFamilies ();
        for (var ZeroHunger : familyIncomeAmounts) {
            System.out.println (ZeroHunger.salario ());
        }
    }

    @Override
    public void ShowEducationalLevel () {
        List<HouseHoldIncome> educationalLavel = this.houseHoldIncomeRepository.findAllFamilies ();
        for (var ZeroHunger : educationalLavel) {
            System.out.println (ZeroHunger.gradoEscolaridad ());
        }
    }
    @Override
    public void ShowHeadHousehold () {
        List<HouseHoldIncome> headHouse = this.houseHoldIncomeRepository.findAllFamilies ();
        for (var ZeroHunger : headHouse) {
            System.out.println (ZeroHunger.jefeFamilia ());
        }
    }

    @Override
    public void ShowNumberRooms () {
        List<HouseHoldIncome> rooms = this.houseHoldIncomeRepository.findAllFamilies ();
        for (var ZeroHunger : rooms) {
            System.out.println (ZeroHunger.habitaciones ());
        }
    }
    @Override
    public Double calculateAverageHouseHoldIncome() {

        System.out.println("Calculando el promedio de los ingresos familiares");
        logger.info("Calculando el promedio de los ingresos familiares");
        logger.warn("Calculando el promedio de los ingresos familiares");
        logger.error("Calculando el promedio de los ingresos familiares");
        // Todo calculateAverage of grades and return the average


        return null;
    }



    @Override
    public Integer sumNumberOfFamilies() {
        System.out.println("Sumando el número de familias");
        logger.info("Sumando el número de familias");
        logger.warn("Sumando el número de familias");
        logger.error("Sumando el número de familias");

        List<HouseHoldIncome> familiesList = this.houseHoldIncomeRepository.findAllFamilies();
        // TODO sum number of families and return the summation
        return null;
    }
}
