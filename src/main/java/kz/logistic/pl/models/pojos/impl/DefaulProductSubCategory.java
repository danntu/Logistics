package kz.logistic.pl.models.pojos.impl;

import kz.logistic.pl.models.pojos.LocalizedMessage;
import kz.logistic.pl.models.pojos.ProductSubCategory;
import lombok.Builder;

@Builder
public class DefaulProductSubCategory implements ProductSubCategory {

    private Long id;
    private LocalizedMessage subCategoryName;
    private Integer productCategoryId;
    private String subCategoryAddInfo;

    @Override
    public long getProductSubcategoryId() {
        return id;
    }

    @Override
    public LocalizedMessage getSubcategoryName() {
        return subCategoryName;
    }

    @Override
    public int getProductCategoryId() {
        return productCategoryId;
    }

    @Override
    public String getsubCategoryAddInfo() {
        return subCategoryAddInfo;
    }
}
