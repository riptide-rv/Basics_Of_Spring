package com.example.basicsofspring.BasicSpringProject.controllers;

import com.example.basicsofspring.BasicSpringProject.services.datasourceservices.DataSourceService;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {
    DataSourceService dataSourceService;

    public FauxController(DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getDataSource(){
        System.out.println(dataSourceService.getDataSource());
        return dataSourceService.getDataSource();

    }

}
