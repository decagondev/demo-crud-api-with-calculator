package com.deca.controllers;

import com.deca.entities.Calculator;
import com.deca.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalculatorController {
    @Autowired
    CalculatorService calcService;

    @PostMapping("/add")
    Calculator add(@RequestBody Calculator calculator) { return calcService.add(calculator); }

    @PostMapping("/subtract")
    Calculator subtract(@RequestBody Calculator calculator) { return calcService.subtract(calculator); }

    @PostMapping("/multiply")
    Calculator multiply(@RequestBody Calculator calculator) { return calcService.multiply(calculator); }

    @PostMapping("/divide")
    Calculator divide(@RequestBody Calculator calculator) { return calcService.divide(calculator); }

    @GetMapping("/pi")
    double getPI() { return calcService.getPI(); }



}
