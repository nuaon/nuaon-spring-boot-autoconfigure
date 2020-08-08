package cn.nuaon.springboot.configuration;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = NuaonProperties.PREFIX)
public class NuaonProperties
{
    public static final String PREFIX = "cn.nuaon";

    private Map<String, String> info;

    public Map<String, String> getInfo()
    {
        return info;
    }
    public void setInfo(Map<String, String> info)
    {
        this.info = info;
    }
}
