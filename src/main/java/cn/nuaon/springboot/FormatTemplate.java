package cn.nuaon.springboot;

import cn.nuaon.springboot.format.FormatProcessor;

public class FormatTemplate
{
    private FormatProcessor processor;

    public FormatTemplate(FormatProcessor processor)
    {
        this.processor = processor;
    }

    public <T> String doFormat(T obj)
    {
        return processor.format(obj);
    }
}
