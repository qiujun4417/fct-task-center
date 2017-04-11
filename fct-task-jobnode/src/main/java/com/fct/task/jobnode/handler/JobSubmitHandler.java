package com.fct.task.jobnode.handler;

import com.fct.task.dto.JobData;
import com.fct.task.dto.Result;
import com.fct.task.interfaces.JobHandler;
import com.github.ltsopensource.core.domain.Job;
import com.github.ltsopensource.jobclient.JobClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ningyang on 2017/4/11.
 * @author ningyang
 */
@Service("jobHandler")
public class JobSubmitHandler implements JobHandler{

    @Autowired
    private JobClient jobClient;

    public Result raiseJob(JobData jobData, boolean isAsy) {
        Job job = new Job();
        job.setCronExpression((String)jobData.getParms().get("cron"));
        jobClient.submitJob(job);
        return new Result();
    }
}
