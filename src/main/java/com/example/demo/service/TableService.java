package com.example.demo.service;

import com.example.demo.model.Table;
import javafx.scene.control.Tab;

import java.util.List;

public interface TableService {

    Table read(int id);

    List<Table> readAll();

    List<Table> readByBusy(boolean isBusy);

    List<Table> readBySeatCount(int seatCount);

    void create(Table table);

    Table update(int id, Table table);

    void delete(int id);

}
