package de.hamburgchimps.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.jupiter.api.Test;

public class TestRecordDeserialization {
    private static final XmlMapper xmlMapper = new XmlMapper();

    private static final String NO_ANNOTATION_EXAMPLE_RECORD_XML;
    private static final String JSON_PROPERTY_NO_ARGS_EXAMPLE_RECORD_XML;
    private static final String XML_ANNOTATION_NO_ARGS_EXAMPLE_RECORD_XML;
    private static final String JSON_PROPERTY_WITH_ARG_EXAMPLE_RECORD_XML;
    private static final String XML_ANNOTATION_WITH_ARG_EXAMPLE_RECORD_XML;

    static {
        try {
            NO_ANNOTATION_EXAMPLE_RECORD_XML = xmlMapper.writeValueAsString(new NoAnnotationExampleRecord("hooray", "oh no"));
            JSON_PROPERTY_NO_ARGS_EXAMPLE_RECORD_XML = xmlMapper.writeValueAsString(new JsonPropertyNoArgsExampleRecord("hooray", "oh no"));
            XML_ANNOTATION_NO_ARGS_EXAMPLE_RECORD_XML = xmlMapper.writeValueAsString(new XmlAnnotationNoArgsExampleRecord("hooray", "oh no"));
            JSON_PROPERTY_WITH_ARG_EXAMPLE_RECORD_XML = xmlMapper.writeValueAsString(new JsonPropertyWithArgExampleRecord("hooray", "oh no"));
            XML_ANNOTATION_WITH_ARG_EXAMPLE_RECORD_XML = xmlMapper.writeValueAsString(new XmlAnnotationNoArgsExampleRecord("hooray", "oh no"));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void NoAnnotation_record() throws JsonProcessingException {
        xmlMapper.readValue(NO_ANNOTATION_EXAMPLE_RECORD_XML, NoAnnotationExampleRecord.class);
    }

    @Test
    void JsonProperty_record_no_args() throws JsonProcessingException {
        xmlMapper.readValue(JSON_PROPERTY_NO_ARGS_EXAMPLE_RECORD_XML, JsonPropertyNoArgsExampleRecord.class);
    }

    @Test
    void JacksonXmlProperty_record_no_args() throws JsonProcessingException {
        xmlMapper.readValue(XML_ANNOTATION_NO_ARGS_EXAMPLE_RECORD_XML, XmlAnnotationNoArgsExampleRecord.class);
    }

    @Test
    void JsonProperty_record_with_arg() throws JsonProcessingException {
        xmlMapper.readValue(JSON_PROPERTY_WITH_ARG_EXAMPLE_RECORD_XML, JsonPropertyWithArgExampleRecord.class);
    }

    @Test
    void JacksonXmlProperty_record_with_arg() throws JsonProcessingException {
        xmlMapper.readValue(XML_ANNOTATION_WITH_ARG_EXAMPLE_RECORD_XML, XmlAnnotationWithArgExampleRecord.class);
    }
}
