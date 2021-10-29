package com.appspringmanipulandojson;

import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

@SpringBootApplication
public class AppSpringManipulandoJsonApplication {

    public static void main(String[] args) throws FileNotFoundException {
        SpringApplication.run(AppSpringManipulandoJsonApplication.class, args);

        JSONObject jsonzinho = new JSONObject();
        
        jsonzinho.put("Nome", "Julio");
        jsonzinho.put("Sobrenome", "Smith");
        jsonzinho.put("Idade", "25");
        jsonzinho.put("Nome", "Julio");
        jsonzinho.put("Sobrenome", "Smith");
        jsonzinho.put("Idade", 25);

        System.out.println(jsonzinho);

        PrintWriter salvar = new PrintWriter("./src/main/java/teste2.json");
        salvar.write(jsonzinho.toJSONString());

        salvar.flush();
        salvar.close();
    }

}
