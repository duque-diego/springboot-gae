package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@SpringBootApplication
@RestController
public class DemoController {

    @GetMapping("/")
    public String hello() {
        return "hello world!";
    }


    @GetMapping("/getestabelecimentos")
    @ResponseBody
    public List<EstabelecimentoModel> getEstabelecimentos() {

        EstabelecimentoModel estabelecimentoModel = new EstabelecimentoModel();
        estabelecimentoModel.setNomeEstabelecimento("Salão do Nirso Bala");
        estabelecimentoModel.setResponsavelEstabelecimento("Nirso Bala");
        estabelecimentoModel.setTelefoneEstabelecimento("19-9876-5454");
        estabelecimentoModel.setRuaEstabelecimento("Rua das salsichas");
        estabelecimentoModel.setNumeroEstabelecimento("520");
        estabelecimentoModel.setBairroEstabelecimento("Jardim Florido");

        EstabelecimentoModel estabelecimentoModel1 = new EstabelecimentoModel();
        estabelecimentoModel1.setNomeEstabelecimento("Mecanico Zézinho do Motor");
        estabelecimentoModel1.setResponsavelEstabelecimento("Zézinho do Motor");
        estabelecimentoModel1.setTelefoneEstabelecimento("19-5566-9090");
        estabelecimentoModel1.setRuaEstabelecimento("Rua da mortadela");
        estabelecimentoModel1.setNumeroEstabelecimento("530");
        estabelecimentoModel1.setBairroEstabelecimento("Jardim Carranca");

        EstabelecimentoModel estabelecimentoModel2 = new EstabelecimentoModel();
        estabelecimentoModel2.setNomeEstabelecimento("Padaria do Thiago Capetudo");
        estabelecimentoModel2.setResponsavelEstabelecimento("Thiago Capetudo");
        estabelecimentoModel2.setTelefoneEstabelecimento("19-6666-6666");
        estabelecimentoModel2.setRuaEstabelecimento("Rua do Borrao");
        estabelecimentoModel2.setNumeroEstabelecimento("550");
        estabelecimentoModel2.setBairroEstabelecimento("Jardim Meia Duzia");

        EstabelecimentoModel estabelecimentoModel3 = new EstabelecimentoModel();
        estabelecimentoModel3.setNomeEstabelecimento("Restaurante Morte Lenta");
        estabelecimentoModel3.setResponsavelEstabelecimento("Jandira Marcha Funebre");
        estabelecimentoModel3.setTelefoneEstabelecimento("19-6455-6132");
        estabelecimentoModel3.setRuaEstabelecimento("Rua do Boi Ralado");
        estabelecimentoModel3.setNumeroEstabelecimento("30");
        estabelecimentoModel3.setBairroEstabelecimento("Vila Perdizes");

        EstabelecimentoModel estabelecimentoModel4 = new EstabelecimentoModel();
        estabelecimentoModel4.setNomeEstabelecimento("Lava Rápido Brilho Infinito");
        estabelecimentoModel4.setResponsavelEstabelecimento("Joao Candura");
        estabelecimentoModel4.setTelefoneEstabelecimento("19-6444-6232");
        estabelecimentoModel4.setRuaEstabelecimento("Rua Paranaue");
        estabelecimentoModel4.setNumeroEstabelecimento("4556");
        estabelecimentoModel4.setBairroEstabelecimento("Beco do Batman");

        EstabelecimentoModel estabelecimentoModel5 = new EstabelecimentoModel();
        estabelecimentoModel5.setNomeEstabelecimento("Salão do Nirso Bala");
        estabelecimentoModel5.setResponsavelEstabelecimento("Nirso Bala");
        estabelecimentoModel5.setTelefoneEstabelecimento("19-9876-5454");
        estabelecimentoModel5.setRuaEstabelecimento("Rua das salsichas");
        estabelecimentoModel5.setNumeroEstabelecimento("520");
        estabelecimentoModel5.setBairroEstabelecimento("Jardim Florido");


        List<EstabelecimentoModel> estabelecimentoModels = new ArrayList<EstabelecimentoModel>();
        estabelecimentoModels.add(estabelecimentoModel1);
        estabelecimentoModels.add(estabelecimentoModel2);
        estabelecimentoModels.add(estabelecimentoModel3);
        estabelecimentoModels.add(estabelecimentoModel4);
        estabelecimentoModels.add(estabelecimentoModel5);


        return estabelecimentoModels;
    }
}
