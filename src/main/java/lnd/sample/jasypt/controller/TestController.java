package lnd.sample.jasypt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lnd.sample.jasypt.service.PropertyServiceForJasyptStarter;

@RestController
@RequestMapping(value = "test")
public class TestController {
    @Autowired
    PropertyServiceForJasyptStarter propertyServiceForJasyptStarter;

    @GetMapping("/t01")
    private void test1() {
        String decrypted = propertyServiceForJasyptStarter.getProperty();
        System.out.println("decrypted=" + decrypted);
    }
}
