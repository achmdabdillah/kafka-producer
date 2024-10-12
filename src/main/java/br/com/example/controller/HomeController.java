package br.com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/")
@Slf4j
public class HomeController {
    @GetMapping
    public String homeController() throws Exception {
        String response;
        try {
            response = "Autoloan Tracking Order Consumer Livin";
            log.info("Testttt Masok");
        } catch (Exception e) {
            response = "Koneksi gagal";
            e.printStackTrace();
        }
        return response;
    }
}
