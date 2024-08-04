package de.hamburgchimps.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public record JsonPropertyNoArgsExampleRecord(@JsonProperty String example,
                                              @JsonProperty String demo) {}
