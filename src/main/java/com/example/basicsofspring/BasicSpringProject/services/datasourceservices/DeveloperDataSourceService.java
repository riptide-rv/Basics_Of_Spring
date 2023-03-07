package com.example.basicsofspring.BasicSpringProject.services.datasourceservices;

import com.example.basicsofspring.BasicSpringProject.services.datasourceservices.DataSourceService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"dev","default"})
@Service
public class DeveloperDataSourceService implements DataSourceService {
    @Override
    public String getDataSource() {
        return "developer data source";
    }
}
