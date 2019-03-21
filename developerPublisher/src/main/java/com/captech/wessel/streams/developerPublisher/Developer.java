package com.captech.wessel.streams.developerPublisher;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import java.util.UUID;

@Data
public class Developer {

        private UUID id;
        private String name;
        private String language;

        Developer (String name, String language){
            this.id = UUID.randomUUID();
            this.name = name;
            this.language = language;
        }


}
