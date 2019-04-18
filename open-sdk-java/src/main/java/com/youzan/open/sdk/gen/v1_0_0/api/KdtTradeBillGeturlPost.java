package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradeBillGeturlPostResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradeBillGeturlPostParams;

public class KdtTradeBillGeturlPost extends AbstractAPI {

    public KdtTradeBillGeturlPost() {
    }

    public KdtTradeBillGeturlPost(KdtTradeBillGeturlPostParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.trade.bill.geturl.post";
    }

    public Class getResultModelClass() {
        return KdtTradeBillGeturlPostResult.class;
    }

    public Class getParamModelClass() {
        return KdtTradeBillGeturlPostParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}