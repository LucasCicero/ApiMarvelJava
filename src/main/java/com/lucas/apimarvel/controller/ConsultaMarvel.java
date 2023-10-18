package com.lucas.apimarvel.controller;

import com.lucas.apimarvel.entity.CharacterResultDTO;
import com.lucas.apimarvel.entity.RestResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Date;


@RestController
@RequestMapping("consulta-heroi")
public class ConsultaMarvel {

    @GetMapping("{id}")
    public CharacterResultDTO consultaHeroi (@PathVariable("id") Integer id) {
            String  apikey="265685722fcdf88865391a0276438a08691d2fad";
            String  apikeyPublic="8cb885863eb25b6b134e930b0c09e039";
            String url = "";
            Long timeStampAux = new Date().getTime();
            String timeStamp = timeStampAux.toString();
            String toBeHash= timeStamp + apikey + apikeyPublic;
            String hash= Md5.md5Converter(toBeHash);

            RestTemplate restTemplate = new RestTemplate();
            RestResponse resp = restTemplate.getForObject("http://gateway.marvel.com/v1/public/characters/" + id + "?ts=" + timeStamp + "&apikey=" + apikeyPublic + "&hash=" + hash, RestResponse.class);
            return resp.getData().getResults()[0];
        }

}
