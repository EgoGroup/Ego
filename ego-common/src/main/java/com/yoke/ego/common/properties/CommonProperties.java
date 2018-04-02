package com.yoke.ego.common.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Yoke on 2018/3/23
 */
@ConfigurationProperties(prefix = "ego.common")
public class CommonProperties {
    private UploadProperties upload = new UploadProperties();

    private FrontPageProperties frontPage = new FrontPageProperties();

    public FrontPageProperties getFrontPage() {
        return frontPage;
    }

    public void setFrontPage(FrontPageProperties frontPage) {
        this.frontPage = frontPage;
    }

    public UploadProperties getUpload() {
        return upload;
    }

    public void setUpload(UploadProperties upload) {
        this.upload = upload;
    }
}
