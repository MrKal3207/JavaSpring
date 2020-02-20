package com.mr.kal.service;

import com.mr.kal.model.LombokModel;

public class SpringMavenService {
    public void exec() {
        LombokModel lombokModel = new LombokModel();
        lombokModel.setName("Test");
        lombokModel.setValue("9999");

        LombokModel lombokModel1 = new LombokModel("Test","9999");
        System.out.println(lombokModel.equals(lombokModel1));
    }
}
