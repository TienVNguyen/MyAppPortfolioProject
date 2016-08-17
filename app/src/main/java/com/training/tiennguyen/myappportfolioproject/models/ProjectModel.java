/*
 *  Copyright (c) 2016. Self Training Systems, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by TienNguyen <tien.workinfo@gmail.com - tien.workinfo@icloud.com>, October 2015
 */

package com.training.tiennguyen.myappportfolioproject.models;

/**
 * ProjectModel
 *
 * @author TienNguyen
 */
public class ProjectModel {
    /**
     * Name
     */
    private String mName;

    /**
     * Constructor
     */
    public ProjectModel() {
    }

    /**
     * Constructor
     *
     * @param mName String
     */
    public ProjectModel(String mName) {
        this.mName = mName;
    }

    /**
     * getter method
     *
     * @return mName String
     */
    public String getmName() {
        return mName;
    }

    /**
     * sets mName
     *
     * @param mName String
     */
    public void setmName(String mName) {
        this.mName = mName;
    }
}
