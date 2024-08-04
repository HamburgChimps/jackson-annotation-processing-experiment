package de.hamburgchimps.jackson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class XmlAnnotationWithArgExamplePojo {
    private String example;
    private String demo;

    public XmlAnnotationWithArgExamplePojo(@JacksonXmlProperty(isAttribute = true) String example,
                                           @JacksonXmlProperty(isAttribute = true) String demo) {
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
