/**
 * Copyright (c) 2018, Mr.Wang (recallcode@aliyun.com) All rights reserved.
 */

package com.youxuepai.mqtt.server.common.session;

import java.util.Set;

/**
 * 会话存储服务接口
 */
public interface ISessionStoreService {

	/**
	 * 存储会话
	 */
	void put(String clientId, SessionStore sessionStore);

	/**
	 * 获取会话
	 */
	SessionStore get(String clientId);

	/**
	 * clientId的会话是否存在
	 */
	boolean containsKey(String clientId);

	/**
	 * 删除会话
	 */
	void remove(String clientId);

	/**
	 * 获取所有的会话
	 */
	Set<String> getAll();

}
