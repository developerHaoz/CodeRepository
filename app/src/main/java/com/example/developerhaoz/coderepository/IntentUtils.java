package com.example.developerhaoz.coderepository;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

import java.util.List;

/**
 * 跟 Intent 相关的工具类
 *
 * Created by developerHaoz on 2017/7/31.
 */

public class IntentUtils {

    /**
     * 判断是否存在可响应 Intent 的可用 Activity
     *
     * @param intent
     * @return
     */
    public static boolean isExistResponseActivity(Context context, Intent intent){
        PackageManager packageManager = context.getPackageManager();
        List activities = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
        boolean isIntentSafe = activities.size() > 0;
        return isIntentSafe;
    }











}











