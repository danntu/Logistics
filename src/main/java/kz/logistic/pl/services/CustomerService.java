package kz.logistic.pl.services;

import java.util.List;
import kz.logistic.pl.models.pojos.Customer;
import kz.logistic.pl.models.pojos.json.CustomerJson;


public interface CustomerService {

  //Показать  всех клиентов
  List<Customer> showAllCustomers();

  //Добавить нового клиента
  String addCustomer(String username, String password);

  //Добавить нового клиента посредством JSON
  String addCustomerJson(CustomerJson customerJson);

  boolean exists(String username);
}
