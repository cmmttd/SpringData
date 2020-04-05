package com.examplejpa.appwithjpa.repository;

import com.examplejpa.appwithjpa.entity.FirstTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FirstTableRepo extends JpaRepository<FirstTable, Long> {

    @Query("select b from FirstTable b where b.name = :name")
    FirstTable findByName(@Param("name")String name);
}