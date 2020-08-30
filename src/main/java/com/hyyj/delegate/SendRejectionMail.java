package com.hyyj.delegate;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * @author lucky-chi
 * @date 2020/08/29
 * **/

public class SendRejectionMail implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) {
        System.out.println("Send Email to "+delegateExecution.getVariable("employee"));
    }
}
