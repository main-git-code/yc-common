package com.ai.yc.common.service.atom.sysjf;


import com.ai.yc.common.dao.mapper.bo.SysJf;

/**
 * @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
public interface ISysJfAtomSV {
	
	/**
	 * 查询基本设置
	 */
	SysJf querySysJf();
	
	Integer updateSysJf(SysJf sysJf);
}
