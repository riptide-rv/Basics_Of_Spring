package com.example.basicsofspring.BasicSpringProject.services.datasourceservices;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("prod")
@Service
public class PRODDataSourceService implements DataSourceService{
    @Override
    public String getDataSource() {
        return "prod data source";
    }
}
