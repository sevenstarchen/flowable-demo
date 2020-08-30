package com.hyyj.service;

import org.flowable.engine.repository.Deployment;
import org.springframework.stereotype.Service;


@Service
public interface IFlowService {
    /**
     * 部署工作流
     */
    Deployment createFlow(String filePath);
}
