package net.zzqd.elearning.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zqnh
 * @date 2019/7/17 on 11:26.
 * 微信配置类
 */
@Configuration
@PropertySource(value = "classpath:application.properties")
public class WeChatConfig
{
    /**
     * 公众号appid
     */
    @Value("${wxpay.appid}")
    private String appId;

    /**
     * 公众号密钥
     */
    @Value("${wxpay.appsecret}")
    private String appsecret;

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    public String getAppsecret()
    {
        return appsecret;
    }

    public void setAppsecret(String appsecret)
    {
        this.appsecret = appsecret;
    }
}
