package de.hamburgchimps.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonPropertyNoArgsExamplePojo {

    private String example;
    private String demo;

    public JsonPropertyNoArgsExamplePojo() {}

    public JsonPropertyNoArgsExamplePojo(@JsonProperty String example,
                                         @JsonProperty String demo) {
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
