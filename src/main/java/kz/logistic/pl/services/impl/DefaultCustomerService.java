package kz.logistic.pl.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import kz.logistic.pl.models.entities.CustomerEntity;
import kz.logistic.pl.models.entities.LoginEntity;
import kz.logistic.pl.models.pojos.Customer;
import kz.logistic.pl.models.pojos.impl.DefaultCustomer;
import kz.logistic.pl.models.pojos.json.CustomerJson;
import kz.logistic.pl.repositories.CustomerRepository;
import kz.logistic.pl.repositories.LoginRepository;
import kz.logistic.pl.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;


@Slf4j
public class DefaultCustomerService implements CustomerService {

  private CustomerRepository customerRepository;
  private LoginRepository loginRepository;

  @Autowired
  public void setCustomerRepository(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @Autowired
  public void setLoginRepository(LoginRepository loginRepository) {
    this.loginRepository = loginRepository;
  }

  @Override
  public List<Customer> showAllCustomers() {
    List<LoginEntity> entities = this.loginRepository.findByCustomerEntityCustomerIdIsNotNull();

    return entities.stream().map(customerEntity -> DefaultCustomer.builder()
      .loginId(customerEntity.getLoginId())
      .username(customerEntity.getUsername())
      .password(customerEntity.getPassword())
      .customerId(customerEntity.getCustomerEntity().getCustomerId())
      .mobilePhone(customerEntity.getCustomerEntity().getMobilePhone())
      .build()).collect(Collectors.toList());
  }

  @Override
  public boolean exists(String username) {
    ArrayList<LoginEntity> loginEntities = this.loginRepository.findByUsername(username);
    return loginEntities.size() > 0;
  }

  @Override
  public String addCustomer(String username, String password) {
    if (exists(username)) {
      return "Данный логин уже занят";
    }
    LoginEntity loginEntity = new LoginEntity();
    loginEntity.setUsername(username);
    loginEntity.setPassword(password);

    CustomerEntity customerEntity = new CustomerEntity();
    this.customerRepository.save(customerEntity);
    loginEntity.setCustomerEntity(customerEntity);
    this.loginRepository.save(loginEntity);
    log.info("Added new customer, username: " + username + ". " + new Date());
    return "Пользователь добавлен";
  }

  @Override
  public String addCustomerJson(CustomerJson customerJson) {
    if (exists(customerJson.getUsername())) {
      return "Данный логин уже занят";
    }
    LoginEntity loginEntity = new LoginEntity();
    loginEntity.setUsername(customerJson.getUsername());
    loginEntity.setPassword(customerJson.getPassword());

    CustomerEntity customerEntity = new CustomerEntity();
    this.customerRepository.save(customerEntity);
    loginEntity.setCustomerEntity(customerEntity);
    this.loginRepository.save(loginEntity);
    log.info("Added new customer via JSON, username "
      + customerJson.getUsername() + ". " + new Date());
    return "Пользователь добавлен ";
  }
}
