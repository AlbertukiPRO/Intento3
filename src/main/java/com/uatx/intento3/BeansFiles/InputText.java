package com.uatx.intento3.BeansFiles;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "inputText")
@SessionScoped
@RestController
public class InputText {

    private String hola = "hola";

    public String getHola() {
        return hola;
    }

    public void setHola(String hola) {
        this.hola = hola;
    }
}
