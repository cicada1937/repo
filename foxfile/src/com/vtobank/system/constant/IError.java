/********************************************
 * 功能说明: 错误编码常量
 * 模块名称: 通用常量模块
 * 系统名称: 互联网前置平台
 * 软件版权: 北京银杉金服科技有限公司
 * 系统版本: 1.0.0
 * 开发人员: zhangfb
 * 开发时间: 2017年5月4日 下午8:32:06
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期 修改人员 修改说明
 *********************************************/
package com.vtobank.system.constant;

/**
 * 错误编码常量
 * @author zhangfb
 * @version 1.0.0.1
 */
public interface IError {
	
	// 架构错误：E00XXX
	/** 空指针异常 */
	String E00001 = "E00001";
	/** 参数非法异常 */
	String E00002 = "E00002";
	/** 参数为空异常 */
	String E00003 = "E00003";
	/** 参数验证异常 */
	String E00004 = "E00004";
	/** 获取文件配置参数异常 */
	String E00005 = "E00005";
	/** 表中不存在编码对应记录 */
	String E00006 = "E00006";
	/** 自定义文件名参数为空异常 */
	String E00007 = "E00007";
	
	
	// 应用错误：E01XXX
	/** 应用编码为空 */
	String E01001 = "E01001";
	/** 应用配置为空 */
	String E01002 = "E01002";
	/** 应用状态异常 */
	String E01003 = "E01003";
	/** 公约配置为空 */
	String E01004 = "E01004";
	/** 公钥加载异常 */
	String E01005 = "E01005";
	/** 应用请求非法 */
	String E01006 = "E01006";
	/** 用户令牌失效 */
	String E01007 = "E01007";
	
	// 接口错误：E02XXX
	/** 接口编码为空 */
	String E02001 = "E02001";
	/** 接口配置为空 */
	String E02002 = "E02002";
	/** 接口状态异常 */
	String E02003 = "E02003";
	/** 接口实例为空 */
	String E02004 = "E02004";
	/** 接口请求非法 */
	String E02005 = "E02005";
	/** 接口调用失败 */
	String E02006 = "E02006";
	/** 参数校验失败 */
	String E02007 = "E02007";
	/** 结果解析失败 */
	String E02008 = "E02008";
	
	// 服务错误：E03XXX
	/** 服务配置错误 */
	String E03001 = "E03001";
	/** 服务调用失败 */
	String E03002 = "E03002";
	
	
	
	// 系统错误：E05XXX
	/** 系统编码为空 */
	String E05001 = "E05001";
	/** 系统配置为空 */
	String E05002 = "E05002";
	/** 系统状态异常 */
	String E05003 = "E05003";
	/** 系统配置错误 */
	String E05004 = "E05004";
	/** 其他错误 */
	String E99999 = "E99999";
	
	/** 文件格式异常 */
	String E40001 = "E40001";
	/** form表单上传异常 */
	String E40002 = "E40002";
}