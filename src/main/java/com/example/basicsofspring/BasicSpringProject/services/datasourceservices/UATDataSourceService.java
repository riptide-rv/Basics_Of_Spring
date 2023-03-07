package com.example.basicsofspring.BasicSpringProject.services.datasourceservices;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("uat")
@Service
public class UATDataSourceService implements DataSourceService{
    @Override
    public String getDataSource() {
        return "uat data source";
    }
}
