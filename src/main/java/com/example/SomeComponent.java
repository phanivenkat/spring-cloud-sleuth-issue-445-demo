package com.example;

import java.util.concurrent.ExecutorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Created by weidner on 08/11/16.
 */
@Controller
public class SomeComponent {

    @Autowired
    ExtendedExecutor service;

}
