package com.crawldata.trangtintucbongda.service.impl;

import com.crawldata.trangtintucbongda.repository.NewRepository;
import com.crawldata.trangtintucbongda.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;

public class NewService implements INewService{
    @Autowired
    private NewRepository newRepository;

}
