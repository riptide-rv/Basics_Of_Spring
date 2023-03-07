package com.example.basicsofspring.BasicSpringProject.controllers;

import com.example.basicsofspring.BasicSpringProject.services.datasourceservices.DataSourceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("prod")
@SpringBootTest
class FauxControllerTest {

    @Autowired

    DataSourceService dataSourceService;
    @Test
    void getDataSource() {
        System.out.println(dataSourceService.getDataSource());
    }
}