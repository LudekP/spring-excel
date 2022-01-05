package com.msx.springexcel.service;

import com.msx.springexcel.model.OverrideProfileFile;

import java.io.File;

public interface OverrideProfileService {

    OverrideProfileFile convert2csv(File excel);

}
