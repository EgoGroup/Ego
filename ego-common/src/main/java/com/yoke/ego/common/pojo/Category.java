package com.yoke.ego.common.pojo;

import java.io.Serializable;
import java.util.Date;

public class Category implements Serializable {
    private Long categoryId;

    private Byte categoryStatus;

    private Date categoryCreated;

    private Date categoryUpdated;

    private String categoryMemo;

    private String categoryTitle;

    private String categoryIcon;

    private String categoryName;

    private Integer categorySortOrder;

    private Long categoryParentId;

    private Byte categoryIsEnd;

    private Integer categoryItemNum;

    private static final long serialVersionUID = 1L;

    public Category(Long categoryId, Byte categoryStatus, Date categoryCreated, Date categoryUpdated, String categoryMemo, String categoryTitle, String categoryIcon, String categoryName, Integer categorySortOrder, Long categoryParentId, Byte categoryIsEnd, Integer categoryItemNum) {
        this.categoryId = categoryId;
        this.categoryStatus = categoryStatus;
        this.categoryCreated = categoryCreated;
        this.categoryUpdated = categoryUpdated;
        this.categoryMemo = categoryMemo;
        this.categoryTitle = categoryTitle;
        this.categoryIcon = categoryIcon;
        this.categoryName = categoryName;
        this.categorySortOrder = categorySortOrder;
        this.categoryParentId = categoryParentId;
        this.categoryIsEnd = categoryIsEnd;
        this.categoryItemNum = categoryItemNum;
    }

    public Category() {
        super();
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Byte getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(Byte categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    public Date getCategoryCreated() {
        return categoryCreated;
    }

    public void setCategoryCreated(Date categoryCreated) {
        this.categoryCreated = categoryCreated;
    }

    public Date getCategoryUpdated() {
        return categoryUpdated;
    }

    public void setCategoryUpdated(Date categoryUpdated) {
        this.categoryUpdated = categoryUpdated;
    }

    public String getCategoryMemo() {
        return categoryMemo;
    }

    public void setCategoryMemo(String categoryMemo) {
        this.categoryMemo = categoryMemo == null ? null : categoryMemo.trim();
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle == null ? null : categoryTitle.trim();
    }

    public String getCategoryIcon() {
        return categoryIcon;
    }

    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon == null ? null : categoryIcon.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getCategorySortOrder() {
        return categorySortOrder;
    }

    public void setCategorySortOrder(Integer categorySortOrder) {
        this.categorySortOrder = categorySortOrder;
    }

    public Long getCategoryParentId() {
        return categoryParentId;
    }

    public void setCategoryParentId(Long categoryParentId) {
        this.categoryParentId = categoryParentId;
    }

    public Byte getCategoryIsEnd() {
        return categoryIsEnd;
    }

    public void setCategoryIsEnd(Byte categoryIsEnd) {
        this.categoryIsEnd = categoryIsEnd;
    }

    public Integer getCategoryItemNum() {
        return categoryItemNum;
    }

    public void setCategoryItemNum(Integer categoryItemNum) {
        this.categoryItemNum = categoryItemNum;
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
        Category other = (Category) that;
        return (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getCategoryStatus() == null ? other.getCategoryStatus() == null : this.getCategoryStatus().equals(other.getCategoryStatus()))
            && (this.getCategoryCreated() == null ? other.getCategoryCreated() == null : this.getCategoryCreated().equals(other.getCategoryCreated()))
            && (this.getCategoryUpdated() == null ? other.getCategoryUpdated() == null : this.getCategoryUpdated().equals(other.getCategoryUpdated()))
            && (this.getCategoryMemo() == null ? other.getCategoryMemo() == null : this.getCategoryMemo().equals(other.getCategoryMemo()))
            && (this.getCategoryTitle() == null ? other.getCategoryTitle() == null : this.getCategoryTitle().equals(other.getCategoryTitle()))
            && (this.getCategoryIcon() == null ? other.getCategoryIcon() == null : this.getCategoryIcon().equals(other.getCategoryIcon()))
            && (this.getCategoryName() == null ? other.getCategoryName() == null : this.getCategoryName().equals(other.getCategoryName()))
            && (this.getCategorySortOrder() == null ? other.getCategorySortOrder() == null : this.getCategorySortOrder().equals(other.getCategorySortOrder()))
            && (this.getCategoryParentId() == null ? other.getCategoryParentId() == null : this.getCategoryParentId().equals(other.getCategoryParentId()))
            && (this.getCategoryIsEnd() == null ? other.getCategoryIsEnd() == null : this.getCategoryIsEnd().equals(other.getCategoryIsEnd()))
            && (this.getCategoryItemNum() == null ? other.getCategoryItemNum() == null : this.getCategoryItemNum().equals(other.getCategoryItemNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getCategoryStatus() == null) ? 0 : getCategoryStatus().hashCode());
        result = prime * result + ((getCategoryCreated() == null) ? 0 : getCategoryCreated().hashCode());
        result = prime * result + ((getCategoryUpdated() == null) ? 0 : getCategoryUpdated().hashCode());
        result = prime * result + ((getCategoryMemo() == null) ? 0 : getCategoryMemo().hashCode());
        result = prime * result + ((getCategoryTitle() == null) ? 0 : getCategoryTitle().hashCode());
        result = prime * result + ((getCategoryIcon() == null) ? 0 : getCategoryIcon().hashCode());
        result = prime * result + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        result = prime * result + ((getCategorySortOrder() == null) ? 0 : getCategorySortOrder().hashCode());
        result = prime * result + ((getCategoryParentId() == null) ? 0 : getCategoryParentId().hashCode());
        result = prime * result + ((getCategoryIsEnd() == null) ? 0 : getCategoryIsEnd().hashCode());
        result = prime * result + ((getCategoryItemNum() == null) ? 0 : getCategoryItemNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", categoryId=").append(categoryId);
        sb.append(", categoryStatus=").append(categoryStatus);
        sb.append(", categoryCreated=").append(categoryCreated);
        sb.append(", categoryUpdated=").append(categoryUpdated);
        sb.append(", categoryMemo=").append(categoryMemo);
        sb.append(", categoryTitle=").append(categoryTitle);
        sb.append(", categoryIcon=").append(categoryIcon);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", categorySortOrder=").append(categorySortOrder);
        sb.append(", categoryParentId=").append(categoryParentId);
        sb.append(", categoryIsEnd=").append(categoryIsEnd);
        sb.append(", categoryItemNum=").append(categoryItemNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}