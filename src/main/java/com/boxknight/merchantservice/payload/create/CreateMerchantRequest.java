package com.boxknight.merchantservice.payload.create;

        import com.boxknight.merchantservice.model.IntegrationType;
        import com.boxknight.merchantservice.model.MerchantType;

public class CreateMerchantRequest {
    private String name;
    private MerchantType merchantType;
    private IntegrationType integrationType;

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
}
