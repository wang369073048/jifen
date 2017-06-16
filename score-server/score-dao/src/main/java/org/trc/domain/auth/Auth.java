package org.trc.domain.auth;

import org.trc.domain.CommonDO;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by hzwzhen on 2017/6/14.
 */
@Table(name = "auth")
public class Auth extends CommonDO{

    @Column(name = "channelCode")
    private String channelCode; //渠道编码
    @Column(name = "exchangeCurrency")
    private String exchangeCurrency; //外币
    @Column(name = "userId")
    private String userId; //用户id
    private String phone; //联系人手机号
    @Column(name = "contactsUser")
    private String contactsUser; //联系人

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getExchangeCurrency() {
        return exchangeCurrency;
    }

    public void setExchangeCurrency(String exchangeCurrency) {
        this.exchangeCurrency = exchangeCurrency;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContactsUser() {
        return contactsUser;
    }

    public void setContactsUser(String contactsUser) {
        this.contactsUser = contactsUser;
    }
}
