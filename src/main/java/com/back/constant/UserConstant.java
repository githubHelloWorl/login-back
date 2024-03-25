package com.back.constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 用户常量
 */
public interface UserConstant {

    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "user_login";

    //  region 权限

    /**
     * 学生角色
     */
    String STUDENT_ROLE = "student";

    /**
     * 教师角色
     */
    String TEACHER_ROLE = "teacher";

    /**
     * 管理员角色
     */
    String ADMIN_ROLE = "admin";

    /**
     * 被封号
     */
    String BAN_ROLE = "ban";

    /**
     * 职称
     */
    List<String> DUTY = Arrays.asList("助教","讲师","副教授","教授");

    /**
     * 奖惩信息状态  未审核-0/通过-1/不通过-2
     */
    List<Integer> rewardPunishState = Arrays.asList(0,1,2);

    // endregion
}
