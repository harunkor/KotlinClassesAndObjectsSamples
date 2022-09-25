package com.harunkor

import androidx.annotation.IntDef


@Retention(AnnotationRetention.SOURCE)
@IntDef(
    UserTypeEnum.NEWUSER,
    UserTypeEnum.PREMIUM,
    UserTypeEnum.GOLD_USER

)

annotation class UserTypeEnum {
    companion object {
        const val NEWUSER = 1
        const val PREMIUM = 2
        const val GOLD_USER = 3
    }

}