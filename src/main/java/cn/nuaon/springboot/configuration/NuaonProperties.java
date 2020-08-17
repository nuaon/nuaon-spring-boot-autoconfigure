package cn.nuaon.springboot.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = NuaonProperties.PREFIX)
public class NuaonProperties
{
    public static final String PREFIX = "cn.nuaon";

    /**
     * 站点名称
     */
    private String name;

    /**
     * 站点版权信息
     */
    private String copyright;

    /**
     * 站点备案信息
     */
    private String icp;

    /**
     * 静态文件版本号
     */
    private String version;

    /**
     * 静态文件前缀地址
     */
    private String urlPrefix;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getCopyright()
    {
        return copyright;
    }
    public void setCopyright(String copyright)
    {
        this.copyright = copyright;
    }

    public String getIcp()
    {
        return icp;
    }
    public void setIcp(String icp)
    {
        this.icp = icp;
    }

    public String getVersion()
    {
        return version;
    }
    public void setVersion(String version)
    {
        this.version = version;
    }

    public String getUrlPrefix()
    {
        return urlPrefix;
    }
    public void setUrlPrefix(String urlPrefix)
    {
        this.urlPrefix = urlPrefix;
    }

    @Override
    public String toString()
    {
        return "NuaonProperties [name=" + name + ", copyright=" + copyright + ", icp=" + icp + ", version=" + version + ", urlPrefix=" + urlPrefix + "]";
    }
}
