/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancoguatemalarestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
   import org.springframework.web.bind.annotation.RestController;
   import gt.gob.banguat.variables.ws.TipoCambioSoap;
/**
 *
 * @author hisco
 */
@RestController
public class TipoCambioControlador {

    @GetMapping("/tipo-cambio-dia")
    public String getTipoCambioDia() {
        TipoCambio service = new TipoCambio();
        TipoCambioSoap port = service.getTipoCambioSoap();
        return port.tipoCambioDiaString();
    }
}