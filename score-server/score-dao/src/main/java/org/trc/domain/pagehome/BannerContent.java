package org.trc.domain.pagehome;

import org.trc.domain.CommonDO;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by hzwzhen on 2017/6/12.
 */
@Table(name = "banner_content")
public class BannerContent extends CommonDO{

    private String title; //标题
    @Column(name = "imgUrl")
    private String imgUrl; //图片url
    @Column(name = "targetUrl")
    private String targetUrl; //跳转url

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    @Override
    public String toString() {
        return "BannerContent{" +
                "title='" + title + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", targetUrl='" + targetUrl + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                ", operatorUserId='" + operatorUserId + '\'' +
                ", shopId=" + shopId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
