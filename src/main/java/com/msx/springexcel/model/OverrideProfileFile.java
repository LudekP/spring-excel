package com.msx.springexcel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OverrideProfileFile {

    String name;
    String path;
    Map<String, Integer> header;

}
