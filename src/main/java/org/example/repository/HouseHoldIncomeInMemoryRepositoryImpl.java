package org.example.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.example.model.HouseHoldIncome;


public class HouseHoldIncomeInMemoryRepositoryImpl implements HouseHoldIncomeRepository {
  @Override
  public List<HouseHoldIncome> findAllFamilies() {
    //public record HouseHoldIncome(String nombre,
    // String gradoEscolaridad, String jefeFamilia, BigDecimal salario, byte miembros, Double families, LocalDate submissionDate) {}
    //lista.add(new InformacionHogar("9/13/2023 6:45:12","Natalia Camacho Burbano" ,11,"padre y madre",new BigDecimal("1700000.50"),4,3,2));
    //  new HouseHoldIncome(LocalDate.of(2023, Month.AUGUST, 1), "JOSE ALFREDO MARTINEZ VALDES", "11", "Padre y Madre", new BigDecimal("1700000.50"), 2, 2, 2)),
    //public record HouseHoldIncome(String project, Double families, LocalDate submissionDate) {}

    List<HouseHoldIncome> householdIncomeList =
        List.of(
            new HouseHoldIncome(LocalDate.of(2023, Month.APRIL, 12), "JOSE ALFREDO MARTINEZ VALDES", "11", "Padre y Madre", 800000.0D, 3, 2, 2),
            new HouseHoldIncome(LocalDate.of(2022, Month.OCTOBER, 11), "JOSE ALFREDO MARTINEZ VALDES", "10", "Padre y Madre", 1600000.0D, 7, 5, 4),
            new HouseHoldIncome(LocalDate.of(2023, Month.AUGUST, 1), "JOSE ALFREDO MARTINEZ VALDES", "10", "Padre", 1130000.0D, 2, 5, 3),
            new HouseHoldIncome(LocalDate.of(2023, Month.FEBRUARY, 21), "JOSE ALFREDO MARTINEZ VALDES", "11", "Padre", 850000.0D, 2, 8, 3),
            new HouseHoldIncome(LocalDate.of(2021, Month.OCTOBER, 17), "JOSE ALFREDO MARTINEZ VALDES", "10", "Padre y Madre", 5800000.0D, 2, 4, 2),
            new HouseHoldIncome(LocalDate.of(2023, Month.SEPTEMBER, 19), "JOSE ALFREDO MARTINEZ VALDES", "8", "Madre", 820000.0D, 2, 7, 1),
            new HouseHoldIncome(LocalDate.of(2023, Month.JULY, 12), "JOSE ALFREDO MARTINEZ VALDES", "8", "Otros", 1856000.0D, 2, 4, 5),
            new HouseHoldIncome(LocalDate.of(2023, Month.JUNE, 5), "JOSE ALFREDO MARTINEZ VALDES", "11", "Abuelos", 1250000.0D, 2, 2, 3));
    return householdIncomeList;
  }
}
