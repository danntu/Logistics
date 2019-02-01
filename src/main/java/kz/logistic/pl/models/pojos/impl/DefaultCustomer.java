package kz.logistic.pl.models.pojos.impl;

import kz.logistic.pl.models.pojos.Customer;
import kz.logistic.pl.models.pojos.LocalizedMessage;
import kz.logistic.pl.models.pojos.ProductSubCategory;
import lombok.Builder;

@Builder
public class DefaultCustomer implements Customer {

    private Long customerId;
    private LocalizedMessage customerName;
    private String username;
    private String password;

    @Override
    public long getCustomerId() {
        return customerId;
    }

    @Override
    public LocalizedMessage getCustomerName() {
        return customerName;
    }

    @Override
    public String getCustomerUsername() {
        return username;
    }

    @Override
    public String getCustomerPassword() {
        return password;
    }
}
