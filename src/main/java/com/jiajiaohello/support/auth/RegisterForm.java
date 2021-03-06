package com.jiajiaohello.support.auth;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

/**
 * User: bohan
 * Date: 10/29/14
 * Time: 6:44 PM
 */
public class RegisterForm {
    /**
     * 用户类型，0为用户 1为教员
     */
    private Integer account = 0;
    @Size(min = 11, max = 11, message = "请输入11位的手机号")
    private String phone;
    @NotBlank(message = "名称不能为空")
    private String name;
    @Size(min = 6, max = 20, message = "密码长度需在6到22之间")
    private String password;
    private String repeatPassword;
    private Integer role;
    @Size(min = 4, max = 4, message = "请输入正确的验证码")
    private String verifyCode;

    @AssertTrue(message="密码与验证密码不相同")
    private boolean isValid() {
        return this.password.equals(this.repeatPassword);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }
}
