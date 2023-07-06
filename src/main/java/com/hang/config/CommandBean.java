package com.hang.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Classname CommandBean
 * @Description TODO
 * @Date 2023/7/6 18:04
 * @Author hang
 * @Version 1.0
 */
@Component
public class CommandBean implements CommandLineRunner {
    /*
    *
        str:--debug=hello.txt
        str:--param
        str:params
    *
    * */
    @Override
    public void run(String... args) {
        System.out.println("------ commandlinerrunner starting ------");
        Arrays.stream(args)
                .forEach(str->
                        System.out.println("str:" + str)
                );
    }
}

@Component
class ApplicationRunnerImpl implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args){
        /*
        *   source args:--debug=hello.txt
            source args:--param
            source args:params
            option name:debug
            option value:[hello.txt]
            option name:param
            option value:[]
            NonOptionArgs args:params
        * */
        System.out.println("------ ApplicationRunner starting ------");
        Arrays.stream(args.getSourceArgs())
                .forEach(str->
                        System.out.println("source args:" + str)
                );
        args.getOptionNames()
                .forEach(str-> {
                        System.out.println("option name:" + str);
                        System.out.println("option value:" + args.getOptionValues(str));
                });

       args.getNonOptionArgs()
                .forEach(str->
                        System.out.println("NonOptionArgs args:" + str)
                );

    }
}
