package com.ai.yc.common.api.sysitembank.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageQueryRequest;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageQueryResponse;

/**
 * @Description: 题库管理服务
 * @author shancc
 * @version V1.0
 */
@Path("/querysysitembank")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysItemBankSV {
	
	/**
     * 题库列表查询分页
     * @return 题库列表
     * @throws BusinessException,SystemException
     * @author shancc
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysitembank/queryItemBankPage
	 */
	@POST
	@Path("/queryItemBankPage")
	public ItemBankPageQueryResponse queryItemBankPage(ItemBankPageQueryRequest param)throws BusinessException,SystemException;
	
}
