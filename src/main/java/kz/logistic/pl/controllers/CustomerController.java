package kz.logistic.pl.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kz.logistic.pl.MobilePhone;
import kz.logistic.pl.models.pojos.json.CustomerJson;
import kz.logistic.pl.services.CustomerService;
import kz.logistic.pl.services.OtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;

@Api(tags = {"Список клиентов"}, description = "API для списка клиентов")
@RestController
@Validated
@RequestMapping("/customer")
public class CustomerController {

  private CustomerService customerService;
  private OtpService otpService;

  @Qualifier("defaultCustomerService")
  @Autowired(required = false)
  public void setCustomerService(CustomerService customerService) {
    this.customerService = customerService;
  }

  @Qualifier("defaultTokenService")
  @Autowired(required = false)
  public void setOtpService(OtpService otpService) {
    this.otpService = otpService;
  }

  @ApiOperation(value = "Показывает весь список клиентов")
  @GetMapping("/all")
  public ResponseEntity<?> all() {
    return ResponseEntity.ok(this.customerService.showAllCustomers());
  }

  @ApiOperation(value = "Показывает клиента по ID")
  @GetMapping("{id}")
  public ResponseEntity<?> getId(@PathVariable(value = "id") Long customerId) throws Exception {
    return ResponseEntity.ok(this.customerService.showCustomer(customerId));
  }

  @ApiOperation(value = "Проверка существующего логина (мобильный номер)")
  @PostMapping("/exists")
  public ResponseEntity<?> exists(@Valid @RequestBody MobilePhone mobilePhone) {
    return ResponseEntity.ok(this.customerService.exists(mobilePhone));
  }

  @ApiOperation(value = "Генерация OTP для мобильного номера")
  @PostMapping("/generateOtp")
  public ResponseEntity<?> generateOtp(@Valid @RequestBody MobilePhone mobilePhone) throws IOException {
    if (mobilePhone.getMobilePhone().length() == 10){
      mobilePhone.setMobilePhone("7"+mobilePhone.getMobilePhone());
    }
    if (mobilePhone.getMobilePhone().substring(0,1).equals("8") && mobilePhone.getMobilePhone().length() == 11){
      mobilePhone.setMobilePhone("7"+mobilePhone.getMobilePhone().substring(1,11));
    }
    return ResponseEntity.ok(this.otpService.generateOtp(mobilePhone.getMobilePhone()));
  }

  @ApiOperation(value = "Валидация OTP и номер мобильного телефона")
  @PostMapping("/validateOtp")
  public ResponseEntity<?> validateOtp(@RequestParam String mobilePhone, @RequestParam String otp) {
    return ResponseEntity.ok(this.otpService.validateOtp(mobilePhone, otp));
  }
  @ApiOperation(value = "Добавляет клиента")
  @PostMapping("/add")
  public ResponseEntity<?> add(
    @RequestParam String username,
    @RequestParam String password) throws IOException {
    return ResponseEntity.ok(this.customerService.addCustomer(username, password));
  }

  @ApiOperation(value = "Добавляет клиента посредством JSON")
  @PostMapping("/addJson")
  public ResponseEntity<?> addJson(
    @RequestBody CustomerJson customerJson
  ) {
    return ResponseEntity.ok(this.customerService.addCustomerJson(customerJson));
  }

  @ApiOperation(value = "Обновляет клиента")
  @PatchMapping("{id}")
  public ResponseEntity<?> update(
    @PathVariable(value = "id") Long customerId,
    @RequestBody CustomerJson customerJson
  ) {
    return ResponseEntity.ok(this.customerService.updateCustomer(customerId, customerJson));
  }

  @ApiOperation(value = "Удаляет клиента")
  @DeleteMapping("{id}")
  public ResponseEntity<?> delete(@PathVariable(value = "id") Long customerId) {
    return ResponseEntity.ok(this.customerService.deleteCustomer(customerId));
  }

}
