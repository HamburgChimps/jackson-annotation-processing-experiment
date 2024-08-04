package de.hamburgchimps.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public record JsonPropertyWithArgExampleRecord(@JsonProperty(required = true) String example,
                                               @JsonProperty(required = true) String demo) {}
