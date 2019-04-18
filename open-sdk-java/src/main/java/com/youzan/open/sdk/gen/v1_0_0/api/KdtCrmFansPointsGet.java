package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtCrmFansPointsGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtCrmFansPointsGetParams;

public class KdtCrmFansPointsGet extends AbstractAPI {

    public KdtCrmFansPointsGet() {
    }

    public KdtCrmFansPointsGet(KdtCrmFansPointsGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.crm.fans.points.get";
    }

    public Class getResultModelClass() {
        return KdtCrmFansPointsGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtCrmFansPointsGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}