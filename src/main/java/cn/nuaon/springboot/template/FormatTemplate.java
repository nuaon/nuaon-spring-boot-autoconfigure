package cn.nuaon.springboot.template;

import cn.nuaon.springboot.configuration.NuaonProperties;
import cn.nuaon.springboot.format.FormatProcessor;

public class FormatTemplate
{
    private FormatProcessor processor;
    private NuaonProperties properties;

    public FormatTemplate(FormatProcessor processor, NuaonProperties properties)
    {
        this.processor = processor;
        this.properties = properties;
    }

    public <T> String doFormat(T obj)
    {
        System.out.println(properties.toString());
        return processor.format(obj);
    }
}
