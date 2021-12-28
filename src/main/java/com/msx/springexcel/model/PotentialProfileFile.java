package com.msx.springexcel.model;

import lombok.*;

import java.nio.file.Path;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PotentialProfileFile {

    String name;
    String path;
    Map<String, Integer> header;

}
