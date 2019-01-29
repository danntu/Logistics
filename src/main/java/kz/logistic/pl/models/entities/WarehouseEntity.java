package kz.logistic.pl.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "warehouse")
public class WarehouseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long warehouse_id;
    @Column(name = "wh_name_kk")
    private String wh_name_kk;
    @Column(name = "wh_name_ru")
    private String wh_name_ru;
    @Column(name = "wh_name_en")
    private String wh_name_en;
    @Column(name = "seller_company_id")
    private Long seller_company_id;
    @Column(name = "address_id")
    private Long addressId;
    @Column(name = "add_info")
    private String add_info;

}
