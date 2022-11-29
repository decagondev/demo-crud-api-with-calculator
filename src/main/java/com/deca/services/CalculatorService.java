package com.deca.services;

import com.deca.entities.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CalculatorService {

    public Calculator add(Calculator calculator) {
        return calculator.setResult(calculator.getOpA() + calculator.getOpB());
    }

    public Calculator subtract(Calculator calculator) {
        return calculator.setResult(calculator.getOpA() - calculator.getOpB());
    }

    public Calculator multiply(Calculator calculator) {
        return calculator.setResult(calculator.getOpA() * calculator.getOpB());
    }

    public Calculator divide(Calculator calculator) {
        return calculator.setResult(calculator.getOpA() / calculator.getOpB());
    }

    public Double getPI() { return Math.PI; }



}
