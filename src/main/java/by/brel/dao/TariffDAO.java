package by.brel.dao;

import by.brel.entity.Tariff;

import java.util.List;

public interface TariffDAO {
    List<Tariff> getAllTariffs();

    List<Tariff> getAllTariffs(int page);

    Tariff findTariffById(long id);

    List<Tariff> findTariffByTitle(String title);

    void saveTariff(Tariff tariff);

    void deleteTariff(long id);

    int getCountAllTariffs();

    long getCountAllTariffsSearch(String keyWord);
}
