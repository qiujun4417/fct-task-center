package com.fct.task.dto;

import lombok.Data;

import java.util.Map;

/**
 * Created by ningyang on 2017/4/11.
 * 任务数据模型
 */
@Data
public class JobData {

    private String jobId;

    private Map<String, Object> parms;

    private JobType jobType;

}
