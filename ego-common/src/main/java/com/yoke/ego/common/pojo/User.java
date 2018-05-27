package com.yoke.ego.common.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Long userId;

    private Byte userStatus;

    private Date userCreated;

    private Date userUpdated;

    private String userMemo;

    private String userName;

    private String userTel;

    private String userAddress;

    private Date userLastTime;

    private String userIdNumber;

    private String userRealName;

    private Byte userSex;

    private String userImage;

    private String userPassword;

    private String userAccountNumber;

    private Long userPoints;

    private Long userTime;

    private String userEmail;

    private String userStudentId;

    private String userSchool;

    private Byte userIssaler;

    private static final long serialVersionUID = 1L;

    public User(Long userId, Byte userStatus, Date userCreated, Date userUpdated, String userMemo, String userName, String userTel, String userAddress, Date userLastTime, String userIdNumber, String userRealName, Byte userSex, String userImage, String userPassword, String userAccountNumber, Long userPoints, Long userTime, String userEmail, String userStudentId, String userSchool, Byte userIssaler) {
        this.userId = userId;
        this.userStatus = userStatus;
        this.userCreated = userCreated;
        this.userUpdated = userUpdated;
        this.userMemo = userMemo;
        this.userName = userName;
        this.userTel = userTel;
        this.userAddress = userAddress;
        this.userLastTime = userLastTime;
        this.userIdNumber = userIdNumber;
        this.userRealName = userRealName;
        this.userSex = userSex;
        this.userImage = userImage;
        this.userPassword = userPassword;
        this.userAccountNumber = userAccountNumber;
        this.userPoints = userPoints;
        this.userTime = userTime;
        this.userEmail = userEmail;
        this.userStudentId = userStudentId;
        this.userSchool = userSchool;
        this.userIssaler = userIssaler;
    }

    public User() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    public Date getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(Date userCreated) {
        this.userCreated = userCreated;
    }

    public Date getUserUpdated() {
        return userUpdated;
    }

    public void setUserUpdated(Date userUpdated) {
        this.userUpdated = userUpdated;
    }

    public String getUserMemo() {
        return userMemo;
    }

    public void setUserMemo(String userMemo) {
        this.userMemo = userMemo == null ? null : userMemo.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Date getUserLastTime() {
        return userLastTime;
    }

    public void setUserLastTime(Date userLastTime) {
        this.userLastTime = userLastTime;
    }

    public String getUserIdNumber() {
        return userIdNumber;
    }

    public void setUserIdNumber(String userIdNumber) {
        this.userIdNumber = userIdNumber == null ? null : userIdNumber.trim();
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    public Byte getUserSex() {
        return userSex;
    }

    public void setUserSex(Byte userSex) {
        this.userSex = userSex;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage == null ? null : userImage.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserAccountNumber() {
        return userAccountNumber;
    }

    public void setUserAccountNumber(String userAccountNumber) {
        this.userAccountNumber = userAccountNumber == null ? null : userAccountNumber.trim();
    }

    public Long getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(Long userPoints) {
        this.userPoints = userPoints;
    }

    public Long getUserTime() {
        return userTime;
    }

    public void setUserTime(Long userTime) {
        this.userTime = userTime;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserStudentId() {
        return userStudentId;
    }

    public void setUserStudentId(String userStudentId) {
        this.userStudentId = userStudentId == null ? null : userStudentId.trim();
    }

    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool == null ? null : userSchool.trim();
    }

    public Byte getUserIssaler() {
        return userIssaler;
    }

    public void setUserIssaler(Byte userIssaler) {
        this.userIssaler = userIssaler;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
            && (this.getUserCreated() == null ? other.getUserCreated() == null : this.getUserCreated().equals(other.getUserCreated()))
            && (this.getUserUpdated() == null ? other.getUserUpdated() == null : this.getUserUpdated().equals(other.getUserUpdated()))
            && (this.getUserMemo() == null ? other.getUserMemo() == null : this.getUserMemo().equals(other.getUserMemo()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserTel() == null ? other.getUserTel() == null : this.getUserTel().equals(other.getUserTel()))
            && (this.getUserAddress() == null ? other.getUserAddress() == null : this.getUserAddress().equals(other.getUserAddress()))
            && (this.getUserLastTime() == null ? other.getUserLastTime() == null : this.getUserLastTime().equals(other.getUserLastTime()))
            && (this.getUserIdNumber() == null ? other.getUserIdNumber() == null : this.getUserIdNumber().equals(other.getUserIdNumber()))
            && (this.getUserRealName() == null ? other.getUserRealName() == null : this.getUserRealName().equals(other.getUserRealName()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserImage() == null ? other.getUserImage() == null : this.getUserImage().equals(other.getUserImage()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserAccountNumber() == null ? other.getUserAccountNumber() == null : this.getUserAccountNumber().equals(other.getUserAccountNumber()))
            && (this.getUserPoints() == null ? other.getUserPoints() == null : this.getUserPoints().equals(other.getUserPoints()))
            && (this.getUserTime() == null ? other.getUserTime() == null : this.getUserTime().equals(other.getUserTime()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserStudentId() == null ? other.getUserStudentId() == null : this.getUserStudentId().equals(other.getUserStudentId()))
            && (this.getUserSchool() == null ? other.getUserSchool() == null : this.getUserSchool().equals(other.getUserSchool()))
            && (this.getUserIssaler() == null ? other.getUserIssaler() == null : this.getUserIssaler().equals(other.getUserIssaler()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        result = prime * result + ((getUserCreated() == null) ? 0 : getUserCreated().hashCode());
        result = prime * result + ((getUserUpdated() == null) ? 0 : getUserUpdated().hashCode());
        result = prime * result + ((getUserMemo() == null) ? 0 : getUserMemo().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserTel() == null) ? 0 : getUserTel().hashCode());
        result = prime * result + ((getUserAddress() == null) ? 0 : getUserAddress().hashCode());
        result = prime * result + ((getUserLastTime() == null) ? 0 : getUserLastTime().hashCode());
        result = prime * result + ((getUserIdNumber() == null) ? 0 : getUserIdNumber().hashCode());
        result = prime * result + ((getUserRealName() == null) ? 0 : getUserRealName().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserImage() == null) ? 0 : getUserImage().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserAccountNumber() == null) ? 0 : getUserAccountNumber().hashCode());
        result = prime * result + ((getUserPoints() == null) ? 0 : getUserPoints().hashCode());
        result = prime * result + ((getUserTime() == null) ? 0 : getUserTime().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserStudentId() == null) ? 0 : getUserStudentId().hashCode());
        result = prime * result + ((getUserSchool() == null) ? 0 : getUserSchool().hashCode());
        result = prime * result + ((getUserIssaler() == null) ? 0 : getUserIssaler().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", userCreated=").append(userCreated);
        sb.append(", userUpdated=").append(userUpdated);
        sb.append(", userMemo=").append(userMemo);
        sb.append(", userName=").append(userName);
        sb.append(", userTel=").append(userTel);
        sb.append(", userAddress=").append(userAddress);
        sb.append(", userLastTime=").append(userLastTime);
        sb.append(", userIdNumber=").append(userIdNumber);
        sb.append(", userRealName=").append(userRealName);
        sb.append(", userSex=").append(userSex);
        sb.append(", userImage=").append(userImage);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userAccountNumber=").append(userAccountNumber);
        sb.append(", userPoints=").append(userPoints);
        sb.append(", userTime=").append(userTime);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userStudentId=").append(userStudentId);
        sb.append(", userSchool=").append(userSchool);
        sb.append(", userIssaler=").append(userIssaler);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}