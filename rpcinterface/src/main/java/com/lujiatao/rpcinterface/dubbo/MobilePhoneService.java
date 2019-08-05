package com.lujiatao.rpcinterface.dubbo;

import com.lujiatao.rpcinterface.domain.MobilePhone;

public interface MobilePhoneService {

	public MobilePhone getMobilePhone(String model);

	public String saveMobilePhone(MobilePhone mobilePhone);

}
