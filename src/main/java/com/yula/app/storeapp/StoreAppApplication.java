package com.yula.app.storeapp;

import com.yula.app.storeapp.models.Product_en;
import com.yula.app.storeapp.models.Product_ru;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class StoreAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreAppApplication.class, args);
    }

//    @Bean
//    public ModelMapper modelMapper(){
//        return new ModelMapper();
//    }
}
