package com.examplejpa.appwithjpa.controller;

import com.examplejpa.appwithjpa.entity.FirstTable;
import com.examplejpa.appwithjpa.repository.FirstTableRepo;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jpa")
public class TableSeviceImpl implements TableService {

    private final ApplicationContext context;
    final FirstTableRepo repo;

    public TableSeviceImpl(ApplicationContext context, FirstTableRepo firstTableRepo) {
        this.context = context;
        this.repo = firstTableRepo;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    @Override
    public List<FirstTable> getAll() {
        return repo.findAll();
    }
}
