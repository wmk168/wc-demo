/**
 * 
 */
package com.weichuang.demo.user.fallback;

import org.springframework.stereotype.Component;

import com.weichuang.demo.api.BaseFallbackApi;
import com.weichuang.demo.user.api.UserApi;
import com.weichuang.demo.user.po.UserPo;

/**
 * 断容错回调
 * @author wmk
 *
 */
@Component
public class UserApiFallback extends BaseFallbackApi<UserPo> implements UserApi{
	
}
