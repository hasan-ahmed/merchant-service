package com.boxknight.merchantservice.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name= "merchants")
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 40)
    private String name;

    @Enumerated(EnumType.STRING)
    private MerchantType merchantType;

    @Enumerated(EnumType.STRING)
    private IntegrationType integrationType;

    @OneToMany(mappedBy = "merchant",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<MerchantLocation> merchantWarehouses;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MerchantType getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(MerchantType merchantType) {
        this.merchantType = merchantType;
    }

    public IntegrationType getIntegrationType() {
        return integrationType;
    }

    public void setIntegrationType(IntegrationType integrationType) {
        this.integrationType = integrationType;
    }

    public List<MerchantLocation> getMerchantWarehouses() {
        return merchantWarehouses;
    }

    public void setMerchantWarehouses(List<MerchantLocation> merchantWarehouses) {
        this.merchantWarehouses = merchantWarehouses;
    }
}
