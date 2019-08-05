package com.lujiatao.rpcinterface.dubbo.impl;

import org.apache.dubbo.config.annotation.Service;

import com.lujiatao.rpcinterface.domain.MobilePhone;
import com.lujiatao.rpcinterface.dubbo.MobilePhoneService;
import com.lujiatao.rpcinterface.repository.MobilePhoneRepository;

@Service(version = "1.0.0")
public class MobilePhoneServiceImpl implements MobilePhoneService {

	private MobilePhoneRepository mobilePhoneRepository = new MobilePhoneRepository();

	public MobilePhone getMobilePhone(String model) {
		return mobilePhoneRepository.getMobilePhone(model);
	}

	public String saveMobilePhone(MobilePhone mobilePhone) {
		String template = "{\"code\":%d,\"message\":\"保存%s！\"}";
		return mobilePhoneRepository.setMobilePhone(mobilePhone.getModel(), mobilePhone) == 0
				? String.format(template, 0, "成功")
				: String.format(template, 1, "失败");
	}

}
