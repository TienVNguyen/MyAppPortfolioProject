/*
 *  Copyright (c) 2016. Self Training Systems, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by TienNguyen <tien.workinfo@gmail.com - tien.workinfo@icloud.com>, October 2015
 */

package com.training.tiennguyen.myappportfolioproject.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import com.training.tiennguyen.myappportfolioproject.R;
import com.training.tiennguyen.myappportfolioproject.models.ProjectModel;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * PortfolioAdapter
 *
 * @author TienNguyen
 */
public class PortfolioAdapter extends ArrayAdapter<ProjectModel> {
    /**
     * Resource
     */
    private int mResource;

    /**
     * Constructor
     *
     * @param context  Context
     * @param resource int
     * @param objects  List<ProjectModel>
     */
    public PortfolioAdapter(Context context, int resource, List<ProjectModel> objects) {
        super(context, resource, objects);
        this.mResource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Caching
        final ViewHolder holder;
        if (convertView != null) {
            holder = (ViewHolder) convertView.getTag();
        } else {
            convertView = LayoutInflater.from(getContext()).inflate(mResource, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }

        //Populating
        final ProjectModel model = getItem(position);
        if (model != null) {
            holder.txt_name.setText(model.getmName());
            holder.txt_name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final Button button = (Button) view;
                    Toast.makeText(getContext(), button.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });
        }

        return convertView;
    }

    /**
     * ViewHolder
     */
    protected static class ViewHolder {
        /**
         * list_item_name
         */
        @Bind(R.id.list_item_name)
        protected Button txt_name;

        /**
         * Constructor
         *
         * @param view View
         */
        protected ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
