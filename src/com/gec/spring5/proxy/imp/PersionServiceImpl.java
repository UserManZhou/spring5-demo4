package com.gec.spring5.proxy.imp;

import com.gec.spring5.proxy.PersionService;

public class PersionServiceImpl implements PersionService {
    @Override
    public void add(String string) {
        System.out.println("add-PersionService"+string);
    }
}
