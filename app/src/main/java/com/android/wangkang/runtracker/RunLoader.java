package com.android.wangkang.runtracker;

import android.content.Context;

/**
 * Created by WangKang on 2015/11/15.
 */
public class RunLoader extends DataLoader<Run> {
    private long mRunId;

    public RunLoader(Context context,long runId){
        super(context);
        mRunId=runId;
    }

    @Override
    public Run loadInBackground() {
        return RunManager.get(getContext()).getRun(mRunId);
    }
}
