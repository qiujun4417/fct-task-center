package com.fct.task.interfaces;

import com.fct.task.dto.JobData;
import com.fct.task.dto.Result;

/**
 * Created by ningyang on 2017/4/11.
 */
public interface JobHandler {

    Result raiseJob(JobData jobData, boolean isAsy);
}
