package com.example.basicsofspring.BasicSpringProject.services.datasourceservices;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class QADataSourceService implements DataSourceService {




    @Override
    public String getDataSource() {
        return "quality assurance data source";
    }
}
