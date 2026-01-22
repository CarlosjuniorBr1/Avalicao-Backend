package com.desafio.api.Controllers;

import com.desafio.api.Model.ClassificacaoRequest;
import com.desafio.api.Model.ClassificacaoResponse;
import com.desafio.api.Service.ClassificacaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classificar")
public class ClassificacaoController {

    private final ClassificacaoService classificacaoService;

    public ClassificacaoController(ClassificacaoService classificacaoService) {
        this.classificacaoService = classificacaoService;
    }

    @PostMapping
    public ResponseEntity<ClassificacaoResponse> classificar(@Valid @RequestBody ClassificacaoRequest request){

        String categoria = classificacaoService.classificar(request.getTexto());

        ClassificacaoResponse response = new ClassificacaoResponse(request.getTexto(), categoria);

        return ResponseEntity.ok(response);

    }

}
