package kz.logistic.pl.services.impl;

import kz.logistic.pl.models.entities.SellerCompanyEntity;
import kz.logistic.pl.models.factories.LocalizedMessageBuilderFactory;
import kz.logistic.pl.models.pojos.SellerCompany;
import kz.logistic.pl.models.pojos.impl.DefaultSellerCompany;
import kz.logistic.pl.repositories.SellerCompanyRepository;
import kz.logistic.pl.services.SellerCompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class DefaultSellerCompanyService implements SellerCompanyService {

    private SellerCompanyRepository sellerCompanyRepository;
    private LocalizedMessageBuilderFactory localizedMessageBuilderFactory;

    @Autowired(required = false)
    public void setSellerCompanyRepository(SellerCompanyRepository sellerCompanyRepository) {
        this.sellerCompanyRepository = sellerCompanyRepository;
    }

    @Autowired(required = false)
    public void setLocalizedMessageBuilderFactory(LocalizedMessageBuilderFactory localizedMessageBuilderFactory) {
        this.localizedMessageBuilderFactory = localizedMessageBuilderFactory;
    }

    @Override
    public List<SellerCompany> showAllSellerCompanies() {
        List<SellerCompanyEntity> entities = this.sellerCompanyRepository.findAll();

        return entities.stream().map(sellerCompanyEntity -> DefaultSellerCompany
                .builder()
                .id(sellerCompanyEntity.getSellerCompanyId())
                .sellerCompanyName(localizedMessageBuilderFactory.builder()
                        .kk(sellerCompanyEntity.getCompanyNameKk())
                        .ru(sellerCompanyEntity.getCompanyNameRu())
                        .en(sellerCompanyEntity.getCompanyNameEn()).build())
                .sellerCompanyPhone(sellerCompanyEntity.getPhone())
                .sellerCompanyMobilePhone(sellerCompanyEntity.getMobile_phone())
                .sellerCompanyBin(sellerCompanyEntity.getBin())
                .sellerCompanyEmail(sellerCompanyEntity.getEmail())
                .sellerCategoryId(sellerCompanyEntity.getSellerCategoryId())).collect(Collectors.toList());
    }

    @Override
    public void addSellerCompany(String sellerCompanyNameKk, String sellerCompanyNameRu, String sellerCompanyNameEn, String sellerCompanyPhone, String sellerCompanyMobilePhone, String sellerCompanyBin, String sellerCompanyEmail, long sellerCategoryId, String username, String password) {

    }

    @Override
    public void updateSellerCompany(String sellerCompanyNameKk, String sellerCompanyNameRu, String sellerCompanyNameEn, String sellerCompanyPhone, String sellerCompanyMobilePhone, String sellerCompanyBin, String sellerCompanyEmail, long sellerCategoryId) {

    }
}
