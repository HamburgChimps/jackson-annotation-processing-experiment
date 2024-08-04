package de.hamburgchimps.jackson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class XmlAnnotationNoArgsExamplePojo {

    private String example;
    private String demo;

    public XmlAnnotationNoArgsExamplePojo(@JacksonXmlProperty String example,
                                          @JacksonXmlProperty String demo) {
        this.example = example;
        this.demo = demo;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }
}
