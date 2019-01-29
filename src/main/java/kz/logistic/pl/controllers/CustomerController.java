package kz.logistic.pl.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kz.logistic.pl.models.pojos.Customer;
import kz.logistic.pl.services.CustomerService;
import kz.logistic.pl.services.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"Список клиентов"}, description = "API для списка клиентов")
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    @Qualifier("defaultCustomerService")
    @Autowired(required = false)
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }


    @ApiOperation(value = "Показывает весь список клиентов")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<?> all() {
        return ResponseEntity.ok(this.customerService.showAllCustomers());
    }

    @ApiOperation(value = "Добавляет клиента")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> add(
            @RequestParam String mobilePhone,
            @RequestParam String password) {
        this.customerService.addCustomer(mobilePhone, password);
        return ResponseEntity.ok("Новая клиент добавлен");
    }

}