package com.yoke.ego.common.pojo;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable {
    private Long memberId;

    private String memberName;

    private String memberPassword;

    private Date memberCreated;

    private Date memberUpdated;

    private String memberTel;

    private String memberEmail;

    private Byte memberStatus;

    private Date memberLastTime;

    private String memberImage;

    private static final long serialVersionUID = 1L;

    public Member(Long memberId, String memberName, String memberPassword, Date memberCreated, Date memberUpdated, String memberTel, String memberEmail, Byte memberStatus, Date memberLastTime, String memberImage) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberPassword = memberPassword;
        this.memberCreated = memberCreated;
        this.memberUpdated = memberUpdated;
        this.memberTel = memberTel;
        this.memberEmail = memberEmail;
        this.memberStatus = memberStatus;
        this.memberLastTime = memberLastTime;
        this.memberImage = memberImage;
    }

    public Member() {
        super();
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword == null ? null : memberPassword.trim();
    }

    public Date getMemberCreated() {
        return memberCreated;
    }

    public void setMemberCreated(Date memberCreated) {
        this.memberCreated = memberCreated;
    }

    public Date getMemberUpdated() {
        return memberUpdated;
    }

    public void setMemberUpdated(Date memberUpdated) {
        this.memberUpdated = memberUpdated;
    }

    public String getMemberTel() {
        return memberTel;
    }

    public void setMemberTel(String memberTel) {
        this.memberTel = memberTel == null ? null : memberTel.trim();
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail == null ? null : memberEmail.trim();
    }

    public Byte getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(Byte memberStatus) {
        this.memberStatus = memberStatus;
    }

    public Date getMemberLastTime() {
        return memberLastTime;
    }

    public void setMemberLastTime(Date memberLastTime) {
        this.memberLastTime = memberLastTime;
    }

    public String getMemberImage() {
        return memberImage;
    }

    public void setMemberImage(String memberImage) {
        this.memberImage = memberImage == null ? null : memberImage.trim();
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
        Member other = (Member) that;
        return (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getMemberName() == null ? other.getMemberName() == null : this.getMemberName().equals(other.getMemberName()))
            && (this.getMemberPassword() == null ? other.getMemberPassword() == null : this.getMemberPassword().equals(other.getMemberPassword()))
            && (this.getMemberCreated() == null ? other.getMemberCreated() == null : this.getMemberCreated().equals(other.getMemberCreated()))
            && (this.getMemberUpdated() == null ? other.getMemberUpdated() == null : this.getMemberUpdated().equals(other.getMemberUpdated()))
            && (this.getMemberTel() == null ? other.getMemberTel() == null : this.getMemberTel().equals(other.getMemberTel()))
            && (this.getMemberEmail() == null ? other.getMemberEmail() == null : this.getMemberEmail().equals(other.getMemberEmail()))
            && (this.getMemberStatus() == null ? other.getMemberStatus() == null : this.getMemberStatus().equals(other.getMemberStatus()))
            && (this.getMemberLastTime() == null ? other.getMemberLastTime() == null : this.getMemberLastTime().equals(other.getMemberLastTime()))
            && (this.getMemberImage() == null ? other.getMemberImage() == null : this.getMemberImage().equals(other.getMemberImage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        result = prime * result + ((getMemberPassword() == null) ? 0 : getMemberPassword().hashCode());
        result = prime * result + ((getMemberCreated() == null) ? 0 : getMemberCreated().hashCode());
        result = prime * result + ((getMemberUpdated() == null) ? 0 : getMemberUpdated().hashCode());
        result = prime * result + ((getMemberTel() == null) ? 0 : getMemberTel().hashCode());
        result = prime * result + ((getMemberEmail() == null) ? 0 : getMemberEmail().hashCode());
        result = prime * result + ((getMemberStatus() == null) ? 0 : getMemberStatus().hashCode());
        result = prime * result + ((getMemberLastTime() == null) ? 0 : getMemberLastTime().hashCode());
        result = prime * result + ((getMemberImage() == null) ? 0 : getMemberImage().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", memberId=").append(memberId);
        sb.append(", memberName=").append(memberName);
        sb.append(", memberPassword=").append(memberPassword);
        sb.append(", memberCreated=").append(memberCreated);
        sb.append(", memberUpdated=").append(memberUpdated);
        sb.append(", memberTel=").append(memberTel);
        sb.append(", memberEmail=").append(memberEmail);
        sb.append(", memberStatus=").append(memberStatus);
        sb.append(", memberLastTime=").append(memberLastTime);
        sb.append(", memberImage=").append(memberImage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}