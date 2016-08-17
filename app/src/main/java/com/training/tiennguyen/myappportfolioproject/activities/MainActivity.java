/*
 *  Copyright (c) 2016. Self Training Systems, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by TienNguyen <tien.workinfo@gmail.com - tien.workinfo@icloud.com>, October 2015
 */

package com.training.tiennguyen.myappportfolioproject.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.training.tiennguyen.myappportfolioproject.R;
import com.training.tiennguyen.myappportfolioproject.adapters.PortfolioAdapter;
import com.training.tiennguyen.myappportfolioproject.models.ProjectModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * MainActivity
 *
 * @author TienNguyen
 */
public class MainActivity extends AppCompatActivity {
    @Bind(R.id.lvPortfolio)
    protected ListView lvPortfolio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    /**
     * initViews
     */
    private void initViews() {
        ButterKnife.bind(this);

        setTitle(getString(R.string.title_activity_name));

        // Show list
        final List<ProjectModel> projectModels = new ArrayList<>();
        prepareMockDataForList(projectModels);
        PortfolioAdapter adapter = new PortfolioAdapter(getApplicationContext(), R.layout.list_portfolio_item, projectModels);
        lvPortfolio.setAdapter(adapter);
    }

    /**
     * Prepare Data
     *
     * @param projectModels List<ProjectModel>
     */
    private void prepareMockDataForList(List<ProjectModel> projectModels) {
        projectModels.add(new ProjectModel("Popular Movies"));
        projectModels.add(new ProjectModel("Stock Hawk"));
        projectModels.add(new ProjectModel("Build it Bigger"));
        projectModels.add(new ProjectModel("Make Your App Material"));
        projectModels.add(new ProjectModel("Go Ubiquitous"));
        projectModels.add(new ProjectModel("Capstone"));
    }
}
