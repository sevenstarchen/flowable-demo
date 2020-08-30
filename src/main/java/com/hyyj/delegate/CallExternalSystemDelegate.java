package com.hyyj.delegate;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * @author lucky-chi
 * @date 2020/08/29
 **/
public class CallExternalSystemDelegate implements JavaDelegate {
    public void execute(DelegateExecution delegateExecution) {
        System.out.println("Calling the external system for employee "
                + delegateExecution.getVariable("employee"));
    }
}