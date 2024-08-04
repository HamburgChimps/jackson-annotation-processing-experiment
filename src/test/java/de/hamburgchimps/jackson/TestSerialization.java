package de.hamburgchimps.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.jupiter.api.Test;

public class TestSerialization {

    @Test
    void no_args() throws JsonProcessingException {
        var mapper = new XmlMapper();

        var exampleFromJsonPropertyNoArgsPojo = new JsonPropertyNoArgsExamplePojo("hooray", "oh no");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(exampleFromJsonPropertyNoArgsPojo));

        var exampleFromJsonPropertyNoArgsRecord = new JsonPropertyNoArgsExampleRecord("hooray", "oh no");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(exampleFromJsonPropertyNoArgsRecord));

        var exampleFromXmlAnnotationNoArgsExamplePojo = new XmlAnnotationNoArgsExamplePojo("hooray", "oh no");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(exampleFromXmlAnnotationNoArgsExamplePojo));

        var exampleFromXmlAnnotationNoArgsExampleRecord = new XmlAnnotationNoArgsExampleRecord("hooray", "oh no");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(exampleFromXmlAnnotationNoArgsExampleRecord));
    }

    @Test
    void JsonProperty_pojo_with_arg() throws JsonProcessingException {
        var mapper = new XmlMapper();

        var exampleFromJsonPropertyWithArgPojo = new JsonPropertyWithArgExamplePojo("hooray", "oh no");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(exampleFromJsonPropertyWithArgPojo));
    }

    @Test
    void JsonProperty_record_with_arg() throws JsonProcessingException {
        var mapper = new XmlMapper();

        var exampleFromJsonPropertyWithArgRecord = new JsonPropertyWithArgExampleRecord("hooray", "oh no");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(exampleFromJsonPropertyWithArgRecord));
    }

    @Test
    void JacksonXmlProperty_pojo_with_arg() throws JsonProcessingException {
        var mapper = new XmlMapper();

        var exampleFromXmlAnnotationWithArgPojo = new XmlAnnotationWithArgExamplePojo("hooray", "oh no");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(exampleFromXmlAnnotationWithArgPojo));
    }

    @Test
    void JacksonXmlProperty_record_with_arg() throws JsonProcessingException {
        var mapper = new XmlMapper();

        var exampleFromXmlAnnotationWithArgRecord = new XmlAnnotationWithArgExampleRecord("hooray", "oh no");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(exampleFromXmlAnnotationWithArgRecord));
    }
}
