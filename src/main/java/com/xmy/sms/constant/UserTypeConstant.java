package com.xmy.sms.constant;

import java.util.HashMap;
import java.util.Map;

public class UserTypeConstant {

	private static String BUILDE_TYPE="施工单位";
	private static String TEST_TYPE="中心试验室";
	private static String SUPERVISOR_TYPE="监理单位";

	public static ConstantsMap map;
	static {
		map = new ConstantsMap();
		map.putConstant(0, BUILDE_TYPE);
		map.putConstant(1, TEST_TYPE);
		map.putConstant(2, SUPERVISOR_TYPE);
	}
}
