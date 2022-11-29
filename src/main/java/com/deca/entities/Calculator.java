package com.deca.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculator {
    int opA;
    int opB;
    int result;

    public Calculator setResult(int result) {
        this.result = result;
        return this;
    }
}
