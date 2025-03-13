package lnd.sample.jasypt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lnd.sample.jasypt.controller.base.BaseController;
import lnd.sample.jasypt.service.PropertyServiceForJasyptStarter;

@RestController
@RequestMapping(value = "test")
public class TestController extends BaseController {
    @Autowired
    PropertyServiceForJasyptStarter propertyServiceForJasyptStarter;

    @GetMapping("/t01")
    private void test1() {
        String decrypted = propertyServiceForJasyptStarter.getProperty();
        System.out.println("decrypted=" + decrypted);
    }

    @GetMapping("/t02")
    private void test2() {
        String decrypted = propertyServiceForJasyptStarter.getProperty();
        System.out.println("Decrypted value = " + decrypted);
    }
}
