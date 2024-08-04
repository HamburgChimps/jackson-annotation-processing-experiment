package de.hamburgchimps.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestRecordSerialization {
    static final XmlMapper xmlMapper = new XmlMapper();

    @BeforeAll
    static void setUpMapper() {
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    @Test
    void NoAnnotation_record() throws JsonProcessingException {
        var exampleFromNoAnnotationRecord = new NoAnnotationExampleRecord("hooray", "oh no");
        System.out.println(xmlMapper.writeValueAsString(exampleFromNoAnnotationRecord));
    }

    @Test
    void JsonProperty_record_no_args() throws JsonProcessingException {
        var exampleFromJsonPropertyNoArgsRecord = new JsonPropertyNoArgsExampleRecord("hooray", "oh no");
        System.out.println(xmlMapper.writeValueAsString(exampleFromJsonPropertyNoArgsRecord));
    }

    @Test
    void JacksonXmlProperty_record_no_args() throws JsonProcessingException {
        var exampleFromXmlAnnotationNoArgsExampleRecord = new XmlAnnotationNoArgsExampleRecord("hooray", "oh no");
        System.out.println(xmlMapper.writeValueAsString(exampleFromXmlAnnotationNoArgsExampleRecord));
    }

    @Test
    void JsonProperty_record_with_arg() throws JsonProcessingException {
        var exampleFromJsonPropertyWithArgRecord = new JsonPropertyWithArgExampleRecord("hooray", "oh no");
        System.out.println(xmlMapper.writeValueAsString(exampleFromJsonPropertyWithArgRecord));
    }

    @Test
    void JacksonXmlProperty_record_with_arg() throws JsonProcessingException {
        var exampleFromXmlAnnotationWithArgRecord = new XmlAnnotationWithArgExampleRecord("hooray", "oh no");
        System.out.println(xmlMapper.writeValueAsString(exampleFromXmlAnnotationWithArgRecord));
    }
}
