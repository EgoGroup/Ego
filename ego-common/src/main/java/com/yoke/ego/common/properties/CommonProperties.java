package com.yoke.ego.common.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Yoke on 2018/3/23
 */
@ConfigurationProperties(prefix = "ego.common")
public class CommonProperties {
    private UploadProperties upload = new UploadProperties();

    public UploadProperties getUpload() {
        return upload;
    }

    public void setUpload(UploadProperties upload) {
        this.upload = upload;
    }
}
