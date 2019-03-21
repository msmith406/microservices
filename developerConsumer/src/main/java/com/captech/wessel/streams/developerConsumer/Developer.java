package com.captech.wessel.streams.developerConsumer;

import lombok.Data;

import java.util.UUID;

@Data
public class Developer {

        private UUID id;
        private String name;
        private String language;

        public Developer(){}

}
